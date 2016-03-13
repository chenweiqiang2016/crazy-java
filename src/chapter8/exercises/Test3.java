package chapter8.exercises;

import java.util.HashMap;
import java.util.Map;

public class Test3 {
	public static void main(String[] args){
		String[] s = {"a", "b", "a", "b", "c", "a", "b", "c", "b"};
		Map m = new HashMap();
		for(int i=0; i < s.length; i++){
			if(m.containsKey(s[i])){
				m.put(s[i], (Integer)(m.get(s[i])) + 1);
			}else{
				m.put(s[i], 1);
			}
		}
		System.out.println(m);
	}
}
