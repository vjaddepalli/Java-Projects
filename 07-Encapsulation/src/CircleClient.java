
public class CircleClient {

	public static void main(String[] args) {

		Circle c1;
		c1 = new Circle();
		c1.setRadius(5);
		System.out.println("Radius: " + c1.getRadius());
		System.out.println("Area of c1: " + c1.getArea());

		Circle c2 = new Circle();
		c2.setRadius(10);
		System.out.println("Radius: " + c2.getRadius());
		System.out.println("Area of c2: " + c2.getArea());

		Circle c3 = new Circle();
		c3.setRadius(8);
		System.out.println("Radius: " + c3.getRadius());
		System.out.println("Area of c3: " + c3.getArea());

	}

}
