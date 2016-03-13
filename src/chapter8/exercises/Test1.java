package chapter8.exercises;

import java.util.HashSet;
import java.util.Set;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 从控制台 读入20个字符串 存入Set集合
 */

public class Test1 {

	public static void main(String[] args) throws IOException {
		Set s = new HashSet();
		for(int i=0; i<10; i++){
			System.out.print("请输入第" + (i+1) + "字符串: ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			s.add(br.readLine());
		}
		System.out.println(s);
	}
}
