import java.util.Scanner;

public class Investment {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);

		System.out.print("Enter monthly saving amount: ");
		double savingAmount = input.nextDouble();

		System.out.print("Enter yearly percentage: ");
		double MONTHLY_INTEREST_RATE = input.nextDouble();

		double total = savingAmount * (1 + MONTHLY_INTEREST_RATE/12);
		System.out.print("month 1: " + total);

		total = (savingAmount + total) * (1 + MONTHLY_INTEREST_RATE/12);
		System.out.println("\nmonth 2: " + total);

		total = (savingAmount + total) * (1 + MONTHLY_INTEREST_RATE/12);
		System.out.println("month 3: " + total);

		total = (savingAmount + total) * (1 + MONTHLY_INTEREST_RATE/12);
		System.out.println("month 4: " + total);

		total = (savingAmount + total) * (1 + MONTHLY_INTEREST_RATE/12);
		System.out.println("month 5: " + total);

		total = (savingAmount + total) * (1 + MONTHLY_INTEREST_RATE/12);

		System.out.println("After the sixth month, the account value is " + total);
	}
}