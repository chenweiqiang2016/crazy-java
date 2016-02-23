package chapter8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * ��ϰCollection���ϵĻ�������
 * add
 * addAll
 * clear
 * contains
 * containsAll
 * isEmpty
 * iterator
 * remove
 * removeAll
 * retainAll
 * size
 * Object[] toArray()
 */

public class CollectionTest{
	public static void main(String[] args){
		Collection c = new ArrayList();
		c.add("�����");
		//Collection������ֻ����ʢװ���� Java֧���Զ�װ��
		c.add(6); 
		System.out.println("Ԫ�ظ�����: " + c.size());
		System.out.println("�����Ƿ����Ԫ��\"�����\": " + c.contains("�����"));
		c.remove(6);
		System.out.println("ɾ��һ��Ԫ�غ�, Ԫ�ظ�����: " + c.size());
		c.add("Java EE��ҵӦ��ʵս");
		System.out.println(c);
		Collection books = new HashSet();
		books.add("���Java����");
		books.add("Java EE��ҵӦ��ʵս");
		c.removeAll(books);
		System.out.println("c���ϼ�ȥbooks���Ϻ�: " + c);
		c.retainAll(books);
		System.out.println("��������ȡ������: " + c);
		
		//Java 8������
		//forEach����Collection�ĸ��ӿ�
		//����Consumer action ����lambda���ʽ������ÿһ��Ԫ��
		books.forEach(ele -> System.out.println("Ԫ��Ϊ: " + ele));
	}
}