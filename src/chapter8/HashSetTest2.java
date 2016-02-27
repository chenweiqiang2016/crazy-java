package chapter8;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 不要随意修改HashSet中的可变对象
 */

class R {
	int count;

	public R(int count) {
		this.count = count;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj != null && obj.getClass() == R.class) {
			R r = (R) obj;
			if (r.count == count) {
				return true;
			}
		}
		return false;
	}

	public int hashCode() {
		return count;
	}

	public String toString() {
		return "R[count=" + count + "]";
	}
}

public class HashSetTest2 {
	public static void main(String[] args) {
		Collection c = new HashSet();
		c.add(new R(5));
		c.add(new R(-3));
		c.add(new R(9));
		c.add(new R(-2));
		System.out.println(c);
		
		Iterator it = c.iterator();
		R r = (R)it.next();
		r.count=-3; //改变可变对象的有效属性 影响了hashCode 避免这种操作
		System.out.println(c);
		
		c.remove(new R(-3));//只能删除一个未被改动的
		System.out.println(c);
		
		System.out.println(c.contains(new R(-3)));//false 原因是-3存储在-2的hash值对应的位置上
		System.out.println(c.contains(new R(-2)));//false 原因是-2hash值位置上的存储的时-3 equals()返回false
	}
}
