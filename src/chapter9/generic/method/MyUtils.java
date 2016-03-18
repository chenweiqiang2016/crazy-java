package chapter9.generic.method;

/*
 * 类型推断的两种方法
 * 1.根据变量类型
 * 2.根据方法调用各个参数间关系
 */

public class MyUtils<E> {
	public static <Z> MyUtils<Z> nil(){//第一种推断方法
		return null;
	}
	
	public static <Z> void cons(Z head, MyUtils<Z> tail){//第二种推断方法
	}
	
	E head(){
		return null;
	}
	
	public static void main(String[] args){
		//根据变量声明可以推断得出
		MyUtils<String> u1 = MyUtils.nil();
		MyUtils<String> u2 = MyUtils.<String>nil();
		//根据方法调用,各个形参的关系,可以推断得出
		MyUtils.cons(10, MyUtils.nil());
		MyUtils.cons(10, MyUtils.<Integer>nil());
		//无法推断得出 转了两次弯 不能正确推断出
//		String s = MyUtils.nil().head();
	}
}
