package chapter9;

/**
 * 父类是Object 子类是String 方法重写
 */

public class A2 extends Apple{

	public A2(Object info) {
		super(info);
	}
	
	public String getInfo(){
		return "A2类中的方法: " + super.getInfo().toString();
	}
	
	public static void main(String[] args){
		A2 a2 = new A2("zm");
	    System.out.println(a2.getInfo());	
	}
}