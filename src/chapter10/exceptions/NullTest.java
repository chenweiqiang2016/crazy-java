package chapter10.exceptions;

import java.util.Date;

public class NullTest {
	public static void main(String[] args){
		Date a = null;
		try{
			Boolean b = a.after(new Date());
		}catch(NullPointerException ne){
			System.out.println("空指针异常");
		}catch(Exception e){
			System.out.println("未知异常");
		}
	}

}
