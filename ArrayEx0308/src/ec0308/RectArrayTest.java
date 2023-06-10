package ec0308;

import java.util.ArrayList;

public class RectArrayTest {

	public static void main(String[] args) {
		
		ArrayList<Rect> rects=new ArrayList<Rect>();
		rects.add(new Rect(1, 4));
		rects.add(new Rect(2, 4));
		rects.add(new Rect(3, 4));
		rects.add(new Rect(4, 4));
		rects.add(new Rect(5, 4));

		for(int i=0; i<rects.size(); i++) {
			rects.get(i).showInfo();
		}
	}

}
