//这个程序没有运行成功 在cmd无包名的情形下运行成功

package chapter7;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import java.io.FileOutputStream;

public class WriteToProcess {
	public static void main(String[] args) throws IOException{
		Process p = Runtime.getRuntime().exec("java ReadStandard");
		//本程序的输出流 是 p进程的输入流
		//使用p进程的输出流进行创建
		try (PrintStream ps = new PrintStream(p.getOutputStream());) {
			// 输出流 对于p来说是输入流
			ps.println("普通字符串 单词2 单词三");
			ps.println(new WriteToProcess());
		}
	}
}

class ReadStandard {
	public static void main(String[] args) throws IOException {
		try (Scanner scanner = new Scanner(System.in);
				PrintStream ps = new PrintStream(new FileOutputStream("out.txt"));) {
			while(scanner.hasNext()) {
				ps.println(scanner.next());
			}
		}
	}
}
