package chapter9.wildcard;

public class Rectangle extends Shape{

	@Override
	public void draw(Canvas c) {
		System.out.println("矩形在画布上" + c + "描绘");
	}

}
