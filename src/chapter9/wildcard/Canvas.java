package chapter9.wildcard;

import java.util.ArrayList;
import java.util.List;

public class Canvas {

//	public void drawAll(List<?> shapes){
//		for(Object s:shapes){ //此处是Object
//			((Shape)s).draw(this);
//		}
//	}

	public void drawAll(List<? extends Shape> shapes){
		for(Shape s:shapes){
			s.draw(this);
		}
	}
	
	public static void main(String[] args){
		List<Rectangle> l = new ArrayList<>();
		l.add(new Rectangle());
		l.add(new Rectangle());
		Canvas c = new Canvas();
		c.drawAll(l);
	}
}
