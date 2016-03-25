package chapter10.stacktrace;

/**
 * 第一行定义 异常类型 具体信息
 * 异常栈 每行 异常发生点 类 方法 文件 行
 *
 */

class SelfException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public SelfException(){}
	
	public SelfException(String msg){super(msg);}
	
}


public class PrintStackTraceTest {
	
	public static void main(String[] args){
		firstMethod();
	}
	
	public static void firstMethod(){
		secondMethod();
	}
	
	public static void secondMethod(){
		thirdMethod();
	}
	
	public static void thirdMethod(){
		throw new SelfException("自定义异常");
	}
}
