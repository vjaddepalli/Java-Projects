import java.util.Scanner;

public class DoWhileMain1 {

	public static void main(String[] args) {
		
		int choice =0;
		do {
			System.out.println("1.Add");
			System.out.println("2.Sub");
			System.out.println("3.Mul");
			System.out.println("4.Div");
			System.out.println("5.Exit");
			
			System.out.println("Enter Choice");
			Scanner sc=new Scanner(System.in);
			choice = sc.nextInt();
		}while(choice !=5);
		
	}

}
