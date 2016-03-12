package chapter8.collection.map;

import java.util.TreeMap;

/**
 * 根据顺序来取得key-value对或者是key, first last lower higher subSet
 */

class R implements Comparable{
	int count;
	
	public R(int count){
		this.count = count;
	}
	
	public boolean equals(Object obj){
		if(this==obj){
			return true;
		}
		if(obj!=null && obj.getClass()==R.class){
			R r = (R)obj;
			return r.count == this.count;
		}
		return false;
	}
	
	public int compareTo(Object obj){
		R r = (R)obj;
		return this.count > r.count? 1:
			this.count < r.count? -1:0;
	}
	
	public String toString(){
		return "R[count=" + count + "]";
	}
}
public class TreeMapTest {
	public static void main(String[] args){
		TreeMap tm = new TreeMap();
		tm.put(new R(3), "轻量级Java EE企业应用实战");
		tm.put(new R(-5), "疯狂Java讲义");
		tm.put(new R(9), "疯狂Ajax讲义");
		
		System.out.println(tm);
		
		System.out.println(tm.firstEntry());
		
		System.out.println(tm.lastKey());
		
		System.out.println(tm.lowerKey(new R(3)));
		
		System.out.println(tm.higherEntry(new R(-5)));
		
		System.out.println(tm.subMap(new R(-5), new R(3)));
	}
}
