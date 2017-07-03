//这个程序没有运行成功

package chapter7;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import java.io.FileOutputStream;

public class WriteToProcess {
	public static void main(String[] args) throws IOException{
		Process p = Runtime.getRuntime().exec("java ReadStandard");
		try (PrintStream ps = new PrintStream(p.getOutputStream());) {
			// 输出流 对于p来说是输入流
			ps.println("普通字符串");
			ps.println(new WriteToProcess());
		}
	}
}

class ReadStandard {
	public static void main(String[] args) throws IOException {
		try (Scanner scanner = new Scanner(System.in);
				PrintStream ps = new PrintStream(new FileOutputStream("out.txt"));) {
			if (scanner.hasNext()) {
				ps.println(scanner.next());
			}
		}
	}
}
