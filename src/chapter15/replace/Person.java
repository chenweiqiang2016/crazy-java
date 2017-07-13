package chapter15.replace;

import java.io.ObjectStreamException;
import java.util.ArrayList;

public class Person implements java.io.Serializable{
	private String name;
	
	private int age;
	
	public Person(String name, int age) {
		System.out.println("执行有参数的构造器");
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//返回Object 不是replaceWrite
	private Object writeReplace() throws ObjectStreamException{
		ArrayList<Object> l = new ArrayList<>();
		l.add(this.name);
		l.add(this.age);
		System.out.println("执行replaceWrite方法...");
		return l;
	}

}
