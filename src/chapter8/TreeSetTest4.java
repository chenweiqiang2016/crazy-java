package chapter8;

import java.util.TreeSet;

/**
 * 练习定制排序
 */


class M{ //无需实现Comparable接口
	int age;
	
	public M(int age){
		this.age = age;
	}
	
	public String toString(){
		return "M[age:" + age + "]";
	}
}
public class TreeSetTest4 {
	public static void main(String[] args){
		TreeSet ts = new TreeSet((o1, o2) -> {  //lambda表达式实现Comparator对象
			M m1 = (M)o1;
			M m2 = (M)o2;
			return m1.age > m2.age?-1:
				m1.age<m2.age?1:0;
		});
		ts.add(new M(5));
		ts.add(new M(10));
		ts.add(new M(5)); //加不进去
		ts.add(new M(8));
		
		System.out.println(ts);
	}
}
