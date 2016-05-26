package chapter10.stacktrace;

/**
 * 一般程序异常终止于main方法
 * 多线程终止于Thread的run方法
 */

public class ThreadExceptionTest implements Runnable{

	public void run() {
		firstMethod();
	}
	
	public void firstMethod(){
		secondMethod();
	}
	
	public void secondMethod(){
		throw new SelfException("线程异常");
	}
	public static void main(String[] args){
		new Thread(new ThreadExceptionTest()).start();
	}
}