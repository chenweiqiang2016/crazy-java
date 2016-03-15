package chapter9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 测试Java7的棱形语法
 */

public class DiamondTest {
	public static void main(String[] args){
		Map<String, Integer> scores = new HashMap<String, Integer>();
		scores.put("语文", 90);
		scores.put("数学", 88);
		scores.put("英语", 80);
		System.out.println(scores);
		Map<String, List<String>> persons = new HashMap<>();
		List<String> schools = new ArrayList<>();
		schools.add("七十二变");
		schools.add("斗转星移");
		persons.put("孙悟空", schools);
		System.out.println(persons);
 	}
}