package chapter6;

/**
 * 每个枚举值分别实现接口方法
 * 生成的是内部匿名子类的对象
 */

interface GenderDesc{
	void info();
}

enum Gender implements GenderDesc{
	
	//MALE("男"){}, FEMALE("女"){}; 在没有implements接口时 这种写法居然是对的 编译产生了匿名子类
	
	MALE("男"){
		public void info(){
			System.out.println("用于描述男性");
		}
	}, FAMALE("女"){
		public void info(){
			System.out.println("用于描述女性");
		}
	};
	
	private final String name;
	
	private Gender(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public static void main(String[] args){
		Gender.MALE.info();
	}
}
