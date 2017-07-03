package chapter15;

import java.io.FileWriter;
import java.io.IOException;

//直接写字符串
public class FileWriterTest {
	public static void main(String[] args) {

		try (FileWriter fw = new FileWriter("pom.txt");) {
			fw.write("静夜思 \r\n");
			fw.write("床前明月光，疑是地上霜。\r\n");
			fw.write("举头望明月，低头思故乡。\r\n");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}