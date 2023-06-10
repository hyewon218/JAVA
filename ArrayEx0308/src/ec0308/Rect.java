package ec0308;

public class Rect {
	private int width;
	private int height;
	
	public Rect(int width, int height) {
		this.width=width;
		this.height=height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width=width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height=height;
	}
	public void showInfo() {
		int area=0;
		area=width*height;
		System.out.println("사각형의 넓이 : "+area);
	}
}

