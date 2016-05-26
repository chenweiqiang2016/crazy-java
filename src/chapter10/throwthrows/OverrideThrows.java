package chapter10.throwthrows;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 子类相同的方法遵循两小原则
 * 1、子类抛出的异常更小 可以不抛
 * 2、子类抛出的异常更少
 */

public class OverrideThrows {
	public void test() throws IOException{
		FileOutputStream fis = new FileOutputStream("a.txt");
	}
}

class Sub extends OverrideThrows{
	public void test(){
		
	}
}