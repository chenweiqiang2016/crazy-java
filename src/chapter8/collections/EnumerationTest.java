package chapter8.collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/**
 * 较老版本的迭代器 用于Vector Hashtable
 */

public class EnumerationTest {
	
	public static void main(String[] args){
		Vector v = new Vector();
		v.add(1);
		v.add(11);
		v.add(3);
		v.add(33);
		
		Enumeration em = v.elements();
		while(em.hasMoreElements()){
			System.out.println(em.nextElement());
		}
		
		Hashtable ht = new Hashtable();
		ht.put("语文", 88);
		ht.put("数学", 90);
		Enumeration htem = ht.keys();
		while(htem.hasMoreElements()){
			Object obj = htem.nextElement();
			System.out.println(obj + "--->" + ht.get(obj));
		}
	} 

}
