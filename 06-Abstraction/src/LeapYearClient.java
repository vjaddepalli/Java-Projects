
public class LeapYearClient {

	public static void main(String[] args) {
		
		LeapYearDecider lyd=new LeapYearDecider();
		lyd.setYear(2020);
		
		System.out.println(lyd.isLeapYear());

	}

}
