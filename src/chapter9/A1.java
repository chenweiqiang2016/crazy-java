package chapter9;

/**
 * 重写父类方法
 * 注意: 两个getInfo方法的返回值类型都是String
 */

public class A1 extends Apple<String>{

	//必须实现该方法
	public A1(String info) {
		super(info);
	}
	
	public String getInfo(){
		return "A1方法中: " + super.getInfo();
	}
	
	public static void main(String[] args){
		A1 a1 = new A1("cwp");
		System.out.println(a1.getInfo());
	}
}