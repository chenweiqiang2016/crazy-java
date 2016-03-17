package chapter9.wildcard;

/**
 * Integer[]是Number[]的子类
 * List<Integer>并非List<Number>的子类
 */

public class NumberAndInteger {
	public static void main(String[] args){
		Number[] numArr;
		Integer[] intArr = new Integer[3];
		numArr = intArr;
		numArr[0] = 5; //并未报错
	}
}
