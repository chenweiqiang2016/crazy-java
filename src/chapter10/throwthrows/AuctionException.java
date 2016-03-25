package chapter10.throwthrows;

/**
 * 增加最后一个构造方法 可以传入一个异常对象 当抛出异常时 实现异常的跟踪
 */

public class AuctionException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public AuctionException(){
	}
	
	public AuctionException(String msg){
		super(msg);
	}
	
	public AuctionException(Throwable t){
		super(t);
	}
}
