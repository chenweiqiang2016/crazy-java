package chapter10.exceptions;

public class DivTest {
	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);

			int b = Integer.parseInt(args[1]);

			double c = a / b;

			System.out.println("输入的两个数的商为: " + c);

		} catch (IndexOutOfBoundsException ie) {
			System.out.println("数组越界");
		} catch (NumberFormatException fe) {
			System.out.println("格式错误");
		} catch (ArithmeticException ae) {
			System.out.println("除数为0");
		} catch (Exception e) {
			System.out.println("未知异常");
		}
	}
}
