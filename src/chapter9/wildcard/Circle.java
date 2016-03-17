package chapter9.wildcard;

public class Circle extends Shape{
	@Override
	public void draw(Canvas c) {
		System.out.println("圆形在" + c + "描绘");
	}

}
