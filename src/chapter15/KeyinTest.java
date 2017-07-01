package chapter15;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

//将字节流转换为字符流
public class KeyinTest {
	
	public static void main(String[] args) throws IOException{
		//标准输入是InputStream的实例 转换为字符流
		
		InputStreamReader reader = new InputStreamReader(System.in);
		
		//包装成更方便的字符流  可以打印一整行
		BufferedReader breader = new BufferedReader(reader);
		
		String line = null;
		
		while((line=breader.readLine()) != null) {
			
			System.out.println(line);
			
			if(line.equals("exit")) {
				System.exit(0);
			}
		}
		
	}
}
