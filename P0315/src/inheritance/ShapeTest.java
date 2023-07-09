package inheritance;

import java.util.ArrayList;

public class ShapeTest {

	public static void main(String[] args) {
		ArrayList<Shape> list =new ArrayList<Shape>();
		list.add(new Circle());
		list.add(new Triangle());
		list.add(new Shape());
		
		for(Shape s:list) {
			s.draw();
		}
	}

}

