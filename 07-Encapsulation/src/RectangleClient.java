
public class RectangleClient {

	public static void main(String[] args) {

		Rectangle rect = new Rectangle();
		rect.setWidth(10);
		rect.setHeight(25);
		System.out.println("R1 area: " + rect.getArea());

		Rectangle rect2 = new Rectangle(4, 5);
		System.out.println("R2 area: " + rect2.getArea());

	}

}
