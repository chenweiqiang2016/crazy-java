package chapter10.throwthrows;

public class AuctionException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public AuctionException(){
	}
	
	public AuctionException(String msg){
		super(msg);
	}
}
