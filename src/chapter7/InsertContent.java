package chapter7;

import java.io.RandomAccessFile;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//在文件中间插入内容
public class InsertContent {
	
	public static void main(String[] args) {
		try {
			File tempFile = File.createTempFile("temp-", null);
			// JVM退出时删除
			//tempFile.deleteOnExit();
			FileInputStream fis = new FileInputStream(tempFile);
			FileOutputStream fos = new FileOutputStream(tempFile);
			
			RandomAccessFile raf = new RandomAccessFile("src/chapter7/props.txt", "rw");
			raf.seek(1);
			//将后面这一部分存入temp文件
			byte[] buf = new byte[1024];
			int hasRead = 0;
		    while((hasRead = raf.read(buf))>0) {
				fos.write(buf);
			}
		    
		    raf.seek(1);
		    raf.write("添加的内容".getBytes());
		    
		    int count = 0;
		    while((count=fis.read(buf))>0) {
		    	    raf.write(buf);
		    }
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
