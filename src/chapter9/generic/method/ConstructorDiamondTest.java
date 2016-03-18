package chapter9.generic.method;

/**
 * 泛型构造器和菱形语法结合使用的注意事项
 */

class MyClass<E>{
	public <T> MyClass(T t){
		System.out.println("输入构造器的参数: " + t);
	}
}

public class ConstructorDiamondTest {
	public static void main(String[] args){
		MyClass<String> m1 = new MyClass<>(123456);
		
		//Explicit type arguments cannot be used with '<>' in an allocation expression
		//MyClass<Integer> m2 = new <Integer> MyClass<>(654321);
		
		MyClass<Integer> m2 = new <Integer> MyClass<Integer>(654321);
	}
}
