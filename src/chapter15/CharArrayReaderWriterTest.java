package chapter15;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

// 错误的文件名ByteArrayReaderWriterTest
// 使用字符串物理节点
public class CharArrayReaderWriterTest {
	public static void main(String[] args) {
		char[] charArray = "《登金陵凤凰台》是李白集中为数不多的七言律诗之一".toCharArray();
		char[] charBrray = new char[10];
		int hasRead = 0;
		// 字符数组 可以使用字符串代替
		try (CharArrayReader reader = new CharArrayReader(charArray);){
			while((hasRead = reader.read(charBrray))>0) {
				System.out.print(new String(charBrray, 0, hasRead));
			}	
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		// 使用StringBuffer作为物理节点
		try (CharArrayWriter writer = new CharArrayWriter();) {
			writer.write("ABC");
			writer.write("DEF");
			System.out.println(writer.toString());
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

}
