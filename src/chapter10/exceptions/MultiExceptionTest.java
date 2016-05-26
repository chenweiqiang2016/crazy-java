package chapter10.exceptions;

/**
 * Java7支持一次捕获多个异常类型
 */

public class MultiExceptionTest {
	public static void main(String[] args){
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a/b;
		}catch(IndexOutOfBoundsException|NumberFormatException|ArithmeticException ie){
			System.out.println("多种异常情况");
			//ie = new RuntimeException("运行时异常"); 不可以重新赋值
		}catch(Exception e){
			System.out.println("未知异常");
			e = new RuntimeException("运行时异常");
		}
	}
}
