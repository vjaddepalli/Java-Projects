
public class Account {

	double balance;
	int typeOfAccount; // 1 or 2

	double getInterestAmount() {

		switch (typeOfAccount) {

		case 1:
			return balance * 0.35;
		case 2:
			return balance * 0.20;
		default:
			System.out.println("Invalid Account Type");
			return 0;

		}

	}

}
