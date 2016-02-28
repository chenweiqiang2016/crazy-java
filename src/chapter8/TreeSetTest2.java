package chapter8;

import java.util.TreeSet;

/**
 * equals()返回true 而compareTo不为0的情形
 * 添加同一个元素两次
 */

class Z implements Comparable{
	int age;

	public Z(int age) {
		this.age = age;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj != null && obj.getClass() == Z.class) {
			Z z = (Z) obj;
			return z.age == this.age;
		}
		return false;
	}

	public int compareTo(Object obj) {
		return 1;
	}
}

public class TreeSetTest2 {
	public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        Z z1 = new Z(5);
        //添加同一个元素两次
        ts.add(z1);
        ts.add(z1);
        //改变第一个元素
        ((Z)(ts.first())).age = 10;
        //第二个元素变了
        System.out.println(((Z)ts.last()).age);
	}
}
