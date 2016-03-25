package chapter10.throwthrows;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 调用异常抛出的方法继续将异常抛出
 */

public class TestThrow2 {
	public static void main(String[] args) throws Exception{
		test();
	}
	
	public static void test() throws IOException{
		FileInputStream fis = new FileInputStream("a.txt");
	}
}
