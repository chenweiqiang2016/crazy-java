package chapter15;

import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadTeacher {

	public static void main(String[] args){
		try(
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("teacher.txt"));){
			Teacher t1 = (Teacher)ois.readObject();
			Teacher t2 = (Teacher)ois.readObject();
			Person p = (Person)ois.readObject();
			//文件中没有该对象 java.io.EOFException
			Teacher t3 = (Teacher)ois.readObject();
			System.out.println("t1和t2内部的Person对象相等：" + (t1.getStudent() == t2.getStudent()));
			System.out.println("t1内部的Person对象与p对象相等：" + (t1.getStudent() == p));
			System.out.println("t1和t3相等：" + (t1 == t3));		
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
