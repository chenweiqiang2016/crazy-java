package chapter6;

/**
 * 枚举类的成员变量 方法 构造器(必须为private)
 * 3个枚举类的版本 逐步改进
 * 结论:使用private final修饰成员变量
 */

enum Gender1 {
	MALE, FEMALE;
	public String name; // 可以直接访问
}

class GenderTest {
	public static void main(String[] args) {
		Gender1 g = Enum.valueOf(Gender1.class, "FEMALE"); // 获取枚举值的方法之一
		g.name = "女";
		System.out.println(g + "代表:" + g.name);
	}
}

// 改进: 使用方法 增加访问控制
enum Gender2 {
	MALE, FEMALE;
	private String name;

	public void setName(String name) {
		switch (this) {
		case MALE:
			if (name == "男") {
				this.name = name;
			} else {
				System.out.println("参数错误");
				return;
			}
			break;
		case FEMALE:
			if (name == "女") {
				this.name = name;
			} else {
				System.out.println("参数错误");
				return;
			}
			break;
		}
	}

	public String getName() {
		return this.name;
	}
}

class GenderTest2{
	public static void main(String[] args){
		Gender2 g = Gender2.valueOf("FEMALE"); // 获取枚举值的方法之二
		g.setName("女");
		System.out.println(g+"代表:"+g.getName());
		g.setName("男");
		System.out.println(g+"代表:"+g.getName());
	}
}

//继续改进 枚举类的成员变量声明为private final 将枚举类变为不可变类
enum Gender3{
	MALE("男"), FEMALE("女");
	
	private final String name;
	
	private Gender3(String name){
		this.name = name;
	}
	
	public String  StgetName(){
		return name;
	}
}