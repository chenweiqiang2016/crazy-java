package chapter15.transientTest;

public class Person implements java.io.Serializable{
	
	private String name;
	
	//只能修饰实例变量
	private transient String age;
	
	private transient int count;
	
	public Person(String name, String age, int count) {
		this.name = name;
		this.age = age;
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	

}
