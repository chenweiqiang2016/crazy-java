package chapter15;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

/**
 * @author Administrator
 *
 */
public class WriteTeacher {
	public static void main(String[] args) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("teacher.txt"));) {
			Person p = new Person("孙悟空", 500);
			Teacher t1 = new Teacher("唐僧", p);
			Teacher t2 = new Teacher("菩提老祖", p);
			//序列化编号 字节数组
			oos.writeObject(t1);
			oos.writeObject(t2);
			oos.writeObject(p);
			oos.writeObject(t1);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
