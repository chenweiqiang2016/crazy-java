package chapter10.exceptions;

/**
 * finally中的return和throw要尽量避免
 */

public class FinallyFlowTest {
	public static void main(String[] args) {
		System.out.println(test());
	}

	public static boolean test() {
		try {
			return true;
		} finally {
			return false;
		}
	}
}
