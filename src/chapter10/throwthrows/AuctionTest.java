package chapter10.throwthrows;

/**
 * catch和throw配合使用 异常连模式
 */

public class AuctionTest {
	public void bid(String bidStr) throws AuctionException {
		double init_bid = 5.0;
		Double bid = null;
		try {
			bid = Double.parseDouble(bidStr);
		} catch (NumberFormatException ne) {
			ne.printStackTrace();
			throw new AuctionException("输入的不是字符串");
		} catch (Exception e) {
			e.printStackTrace();
			throw new AuctionException("未知异常");
		}
		if (bid < init_bid) {
			throw new AuctionException("必须高于起始竞拍价格");
		}
	}

	public static void main(String[] args) {
		AuctionTest at = new AuctionTest();
		try {
			at.bid("df");
		} catch (AuctionException ae) {
			System.out.println(ae.getMessage());
		}
	}

}
