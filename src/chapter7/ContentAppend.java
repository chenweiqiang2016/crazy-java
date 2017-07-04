package chapter7;

import java.io.RandomAccessFile;
import java.io.File;
import java.io.IOException;

public class ContentAppend {
	public static void main(String[] args) {
		try (RandomAccessFile raf = new RandomAccessFile(new File("src/chapter7/out.txt"), "rw")) {
			System.out.println("初始的文件记录指针：" + raf.getFilePointer());
			raf.seek(raf.length());
			raf.write("追加字符串\n".getBytes());
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
