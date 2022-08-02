import java.util.Scanner;
public class DetectPositiveNumbers{

	public static void main(String [] args){

		Scanner input = new Scanner(System.in);
		int pos = 0;
		int neg = 0;
		int total = 0;
		int count = 0;
		
		System.out.println("Enter integers below, program ends when 0 is entered:");

		for(int i = 0;i<1000;i++){
			int number = input.nextInt();
			if(number >0){
				pos++;
				count++;
				total = total +number;
			}
			else if (number < 0){
				neg++;
				count++;
				total = total +number;
			}
			if(number == 0){
				if(count == 0){
					System.out.println("no numbers are entered except 0");
					break;
				}
				else {
					double average = (double)total/count;
					System.out.println("The number of positives is " + pos);
					System.out.println("The number of negatives is " + neg);
					System.out.println("The total is " + total);
					System.out.println("The average is " + average);
					break;
				}
			}
		}
	}
}