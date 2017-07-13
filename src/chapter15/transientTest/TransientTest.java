package chapter15.transientTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TransientTest {
	public static void main(String[] args) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("transient.txt"));
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("transient.txt"));) {
            Person p = new Person("陈伟强", "28", 100);
            oos.writeObject(p);
            Person p1 = (Person)ois.readObject();
            System.out.println("反序列化后得到的age字符串是：" + p1.getAge()); //null
            System.out.println("反序列化后得到的count数字是：" + p1.getCount()); //0
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
