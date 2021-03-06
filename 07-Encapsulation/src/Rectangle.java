
public class Rectangle {

	private int width;
	private int height;

	// constructor method
	public Rectangle() {
		System.out.println("Rectangle Instance Created");
	}

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		System.out.println("Parameterized Constructor");
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	long getArea() {
		return this.width * this.height;
	}

}
