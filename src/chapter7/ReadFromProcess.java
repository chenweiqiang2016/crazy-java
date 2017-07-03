package chapter7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadFromProcess {
	public static void main(String[] args) throws Exception {

		Process p = Runtime.getRuntime().exec("javac");
		// 输入输出是以程序所在内存为参照的
		// 对子进程来说其实是输出
		// 这行语句里面 含有输出 也含有输入
		BufferedReader br = new BufferedReader(new InputStreamReader(p.getErrorStream()));
		// bug
		// 这行代码输出：啥也没有输出
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(p.getInputStream()));
		String line = "";
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}

	}
}
