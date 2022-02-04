
public class Main2 {

	public static void main(String[] args) {

		double[] prices = { 1.0, 20.0, 10.0, 4.0, 5.0, 7.0, 8.0 };
		double sum = 0;
		double max=prices[0];
		double min=prices[0];
		for (double price: prices) {
			
			if(max<price) 
				max=price;
			if(price<=min)
				min=price;
			
			sum = sum + price;

		}

		System.out.println("Sum: " + sum);
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
		System.out.println("Avg: "+ sum/prices.length);
	}

}
