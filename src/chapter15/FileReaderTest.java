package chapter15;

import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author chenweiqiang
 * Reader是基类 FileReader是节点流
 */
public class FileReaderTest {
	public static void main(String[] args) throws IOException {
		try {
			FileReader fr = new FileReader("src/chapter15/FileReaderTest.java");
			// 创建水桶
			char[] buf = new char[10]; // 较小的字符数组也不会产生问题
			int readCount = 0;
			while ((readCount = fr.read(buf)) > 0) {
				System.out.print(new String(buf, 0, readCount));
			}
		} catch (Exception e) {
			//Java 7 使用try catch可以自动关闭资源

		}

	}
}
