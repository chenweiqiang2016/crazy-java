package chapter9;

public class Apple<T> {
	T info;
	
	public Apple(T info){
		this.info = info;
	}

	public T getInfo(){
		return info;
	}
	
	public void setInfo(T info){
		this.info = info;
	}
	
	public static void main(String[] args){
		Apple<String> a = new Apple<>("cwq");
		System.out.println(a.getInfo());
		
		Apple<Double> b = new Apple(5.18);
		System.out.println(b.getInfo());
		
	}

}
