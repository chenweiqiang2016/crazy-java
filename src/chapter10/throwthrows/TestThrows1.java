package chapter10.throwthrows;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * checked异常必须捕获 或者 声明抛出
 */

public class TestThrows1 {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("a.txt");
	}
}
