
public class CircleClient {

	public static void main(String[] args) {
		Circle c1, c2, c3;

		c1 = new Circle();
		c2 = new Circle();
		c3 = new Circle();

		c1.setRadius(5);
		c2.setRadius(6);
		c3.setRadius(7);

		System.out.println(Circle.PI);
		Circle.greet();
		System.out.println(c1.getArea());
		System.out.println(c2.getArea());
		System.out.println(c3.getArea());

	}

}
