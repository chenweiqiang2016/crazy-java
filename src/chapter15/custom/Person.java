package chapter15.custom;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable{
	
	private String name;

	private int age;

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
	
	public Person(String name, int age) {
		System.out.println("有参数的构造器");
		this.name = name;
		this.age = age;
	}
	
	public void writeObject(java.io.ObjectOutputStream out) throws IOException{
		out.writeObject(new StringBuffer(name).reverse()); //.toString()
		out.writeInt(age);
	}
	
	public void readObject(java.io.ObjectInputStream in) throws ClassNotFoundException, IOException {
		//不要忘了this.
		 this.name = ((StringBuffer)in.readObject()).reverse().toString();
		 this.age = in.readInt();
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//      测试代码
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("custom.txt"));
//		oos.writeObject(new Person("cwq", 25));
//		oos.close();
//		
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("custom.txt"));
//		Person p = (Person)ois.readObject();
//		System.out.println(p.getName());
//		System.out.println(p.getAge());
	}
	

}
