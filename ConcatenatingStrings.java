import java.util.Scanner;
import javax.swing.JOptionPane;

public class ConcatenatingStrings{
	public static void main (String[] args){
		
		Scanner x = new Scanner(System.in);

		System.out.print("please enter String: ");
		String a1 = x.nextLine();
		
		System.out.print("please enter first int: ");
		int a2 = x.nextInt();

		System.out.print("please enter second int: ");
		int a3 = x.nextInt();

		
		//collect data

		String a4 = a1.toUpperCase();


		// make name uppercase

		String a5 = a1.substring(0,1).toUpperCase() + a1.substring(1).toLowerCase();

		//make first letter uppercase rest lowercase

		String a6 = a1.toLowerCase();

		//prints whole thing in lowercase

		int a7 = a2 + a3;

		System.out.printf("in java the string: " + "\"%s\"" + " is different from", a6);
		System.out.printf("\nthe strings: " + "\"%s\"" + " and: " + "\"%s.\"", a4, a5);
		System.out.println("\nAlso: " + a2 + "+" + a3 + "=" + a7);
		System.out.println("but " + a2 + " concatenated with " + a3 + " is: " + a2 + a3);

	}

}