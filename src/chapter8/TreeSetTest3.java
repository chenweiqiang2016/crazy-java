package chapter8;

import java.util.TreeSet;

/**
 * TreeSet跟HashSet的一个不同: 改变可变对象后
 * 1.被修改的可变对象 和 2.可变对象compareTo=0的对象都不能正常删除了
 * 删除其他对象 重新索引一下 之后可不可以删除还是不好说 复杂
 * 
 *  R Q 问题: 即便已经修改了 可能还是报错 强行执行一遍
 */


class Q implements Comparable{ //The type Q is already defined
	int count;
	
	public Q(int count){
		this.count = count;
	}
	
	public boolean equals(Object obj){
		if(this==obj){
			return true;
		}
		if(obj!=null && obj.getClass()==Q.class){
			Q r = (Q)obj;
			return this.count == r.count;
		}
		return false;
	}
	
	public int compareTo(Object obj){
		Q r = (Q) obj;
		return this.count>r.count?1:
			this.count<r.count?-1:0;
	}
	
	public String toString(){
		return "Q[count=" + count + "]";
	}
}

public class TreeSetTest3 {

	public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(new Q(5));
        ts.add(new Q(-3));
        ts.add(new Q(9));
        ts.add(new Q(-2));
        ts.add(new Q(6));//影响重新索引后能不能删除成功
        System.out.println("修改前:" + ts);
        
        ((Q)ts.first()).count = 20;
        ((Q)ts.last()).count = -2;
        System.out.println("修改后:" + ts);
        //删除失败 注意与HashSet的不同
        System.out.println("删除-2是否成功?" + ts.remove(new Q(-2)));
        System.out.println("删除后:" + ts);
        
        //重新索引 可以删除成功 有时不能成功
        System.out.println(ts.remove(new Q(5))); //只有这个可以成功
        System.out.println(ts.remove(new Q(20)));
        System.out.println(ts.remove(new Q(-2)));
        System.out.println("删除成功?:" + ts);
        
	}
}
