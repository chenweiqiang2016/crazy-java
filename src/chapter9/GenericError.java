package chapter9;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 泛型类是不存在的
 */

public class GenericError {
	public static void main(String[] args){
		Collection<String> cs = new ArrayList<String>();
		System.out.println(cs instanceof ArrayList);
		//System.out.println(cs instanceof ArrayList<String>);
	}
}
