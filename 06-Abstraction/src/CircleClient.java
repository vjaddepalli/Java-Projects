
public class CircleClient {

	public static void main(String[] args) {

		Circle c1;
		c1 = new Circle();
		c1.radius = 10;
		double area = c1.getArea();
		System.out.println("Area of Circle1: " + area);

		Circle c2 = new Circle();
		c2.radius = 7;
		System.out.println("Area of c2: " + c2.getArea());

		Circle c3 = new Circle();
		c3.radius = 21;
		System.out.println("Area of c3: " + c3.getArea());

	}

}
