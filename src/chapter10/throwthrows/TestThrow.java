package chapter10.throwthrows;

/**
 * checked异常必须显式捕获 或者 声明抛出
 * Runtime可以显式捕获 也可以不予理会
 */

public class TestThrow {
	public static void main(String[] args){
		try{
			throwChecked(-3);
		}catch(Exception e){
			
		}
		
		throwRuntime(-3);
	}
	
	public static void throwChecked(int a) throws Exception{
		if(a<0){
			throw new Exception("a必须大于0");
		}
	}

	public static void throwRuntime(int a){
		if(a<0){
			throw new RuntimeException("a必须大于0");
		}
	}
}
