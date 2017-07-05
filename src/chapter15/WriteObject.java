package chapter15;

import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteObject {

	public static void main(String[] args) {
		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("out.txt"));) {
			Person p = new Person("chenweiqiang", 27);
			os.writeObject(p);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}

class Person implements Serializable {
	private String name;

	private int age;

	public Person(String name, int age) {
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

}
