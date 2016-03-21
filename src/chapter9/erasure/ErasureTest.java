package chapter9.erasure;

import java.util.ArrayList;

class Apple<T extends Number>{
	T size;
	
	public Apple(T size){
		this.size = size;
	}
	
	public T getSize(){
		return size;
	}
	
	public void setSize(T size){
		this.size=size;
	}
}

public class ErasureTest {
	public static void main(String[] args){
		Apple<Integer> a = new Apple<>(3);
		Apple b = a; //类型丢失
//		Integer i = b.getSize();
		Number n = b.getSize();
		
	}
}
