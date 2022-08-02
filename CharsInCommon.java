import java.util.Scanner;
public class CharsInCommon{

	public static void main(String [] args){

		int count = 0;
		String str3 = "";
		Scanner input = new Scanner(System.in);
		System.out.print("enter first word: ");
		String str1 = input.nextLine();
		System.out.print("enter second word: ");
		String str2 = input.nextLine();

		int str1Length = str1.length();

		for(int i = 0;i<str1Length;i++){
			if (!str3.contains(str1.substring(i,i+1)) & str2.contains(str1.substring(i,i+1))){
				count++;
				str3 += str1.substring(i,i+1);

				
			}

		}
		System.out.println("count: " + count);

	}
}