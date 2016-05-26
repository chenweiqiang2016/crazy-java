package chapter10.exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class FinallyTest {
	public static void main(String[] args) {
		FileInputStream a = null;
		try {
			a = new FileInputStream("a.txt");
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			if (a != null) {
				try {
					a.close();
				} catch (IOException ie) {

				}
			}
			System.out.println("执行finally中的语句");
		}
	}

}
