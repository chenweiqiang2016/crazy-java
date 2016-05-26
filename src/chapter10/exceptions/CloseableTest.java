package chapter10.exceptions;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class CloseableTest {

	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader("src/chapter10/exceptions/CloseableTest.java"));
				PrintStream ps = new PrintStream(new FileOutputStream("a.txt"));) {
			System.out.println(br.readLine());
			System.out.println("春风得意十里街");
		}//catch(Exception e){
			//System.out.println(e.getMessage());
		//}
	}
}
