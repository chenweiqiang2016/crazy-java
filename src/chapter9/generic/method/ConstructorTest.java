package chapter9.generic.method;

/**
 * 学习泛型构造器
 */

class Foo{
	public <T> Foo(T t){
		System.out.println("这个对象是: " + t);
	}
}

public class ConstructorTest {
	public static void main(String[] args){
		Foo f1 = new Foo("chenweiqiang");
		System.out.println(f1);
		Foo f2 = new Foo(100);
		System.out.println(f2);
		
		Foo f3 = new <String> Foo("cwp");
		System.out.println(f3);
		
		//错误 显示指定的T 和 数据实参指定的key不一致
//		Foo f4 = new <String> Foo(2.3);
//		System.out.println(f4);
		
	}
}
