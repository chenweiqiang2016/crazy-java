package chapter15;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class ReadObject {
	public static void main(String[] args) {
		try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("out.txt"));) {
			// 读出来的类型是Object
			Person p = (Person) is.readObject();
			System.out.println("name是：" + p.getName());
			System.out.println("age是：" + p.getAge());
		} catch (IOException | ClassNotFoundException ioe) {// Person类必须存在
			ioe.printStackTrace();
		}
	}

}
