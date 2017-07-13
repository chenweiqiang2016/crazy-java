package chapter15.replace;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ReplaceTest {
	public static void main(String[] args) {
		Person p = new Person("亚瑟", 100);
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("replace.txt"));
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("replace.txt"))) {
			oos.writeObject(p);
			ArrayList l = (ArrayList)ois.readObject();
			System.out.println(l);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
