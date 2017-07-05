package chapter15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//序列化机制存在的一个问题
public class SerializeMutable {
	public static void main(String[] args){
		try(
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("mutable.txt"));
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("mutable.txt"));){
			
			Person p = new Person("孙悟空",500);
			
			oos.writeObject(p);
			
			p.setName("猪八戒");
			
			oos.writeObject(p);
			
			
			
			Person p1 = (Person)ois.readObject();
			
			Person p2 = (Person)ois.readObject();
			
			System.out.println("两次写入的对象是否相等：" +(p1==p2));
			System.out.println(p2.getName());
			
			
		}catch(IOException | ClassNotFoundException ioe){
			ioe.printStackTrace();
		}
	}
}
