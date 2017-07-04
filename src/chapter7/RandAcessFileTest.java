//总结 一个英文字母占一个字节 一个/也是占一个字节 回车符占一个字节 中文占了三个字节

package chapter7;

//读文件
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandAcessFileTest {
	public static void main(String[] args) {
		try (RandomAccessFile raf = new RandomAccessFile("src/chapter7/RandAcessFileTest.java", "r");) {

			raf.seek(27);

			byte[] buf = new byte[1024];

			int hasRead = 0;

			while ((hasRead = raf.read(buf)) > 0) {
				System.out.println(new String(buf, 0, hasRead));
			}

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

}
