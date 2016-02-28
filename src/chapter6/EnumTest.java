package chapter6;

/**
 * compareTo(Season o)
 * name()
 * toString()更友好
 * ordinal() 枚举值的index
 * 
 * values()全部枚举值
 * valueOf(EnumType, String name) 获取字符串对应的枚举值
 */

enum Season{
	Spring, Summer, Fall, Winter; //TODO: 枚举实例 改成大写
}

public class EnumTest {
	
	public void judge(Season s){
		switch(s){
			case Spring: //后面不要加{
				System.out.println("春意盎然, 出门采风");
				break;
			case Summer:
				System.out.println("夏日炎炎，出门游泳");
				break;
			case Fall:
				System.out.println("秋风送爽, 出门钓鱼");
				break;
			case Winter:
				System.out.println("白雪皑皑，围炉赏雪");
				break;
		}
	}

	public static void main(String[] args){
		for(Season s: Season.values()){
			System.out.println(s); //枚举值调用toString方法
		}
		
		(new EnumTest()).judge(Season.Fall);
	}
	

}
