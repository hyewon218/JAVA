package ec0308;

public class RectTest {
	public static void main(String[] args) {
		Rect[] rect = new Rect[5];
		rect[0] = new Rect(1, 4);
		rect[1] = new Rect(2, 4);
		rect[2] = new Rect(3, 4);
		rect[3] = new Rect(4, 4);
		rect[4] = new Rect(5, 4);

		for (int i=0; i<rect.length; i++) {
			rect[i].showInfo();
		}
	}
}
