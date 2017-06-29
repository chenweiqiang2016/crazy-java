package chapter15;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * InputStream是基类 不可以实例化
 * FileInputStream是节点流
 */
public class FileInputStreamTest {
	public static void main(String[] args) throws IOException{
//		try {
			FileInputStream fis = new FileInputStream("src/chapter15/FileInputStreamTest.java");
			// 准备水桶 不是Byte
			byte[] b = new byte[1024]; //如果太小 会出现乱码 因为GBK中文是两个字节 可能被分割了
			// 获得的字节数目
			int readCount = 0;
			while ((readCount = fis.read(b)) > 0) {
				System.out.println(new String(b, 0, readCount));
			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
			//IO资源关闭 不会自动回收
			fis.close();
	}
}
