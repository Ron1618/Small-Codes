import java.util.Scanner;
public class MultiplicationTable{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("enter an integer: ");
		int a = input.nextInt();

		for(int i =1;i<13;i++){
			if (i<10)
			{
				int b = i * a;
				if(b<10)
				{
					System.out.println(" " + i + " *  " + a + " =  " + i*a);
				}
				else 
				{
					if(a>9){
						System.out.println(" " + i + " * " + a + " = " + i*a);
					}
					else{
						System.out.println(" " + i + " *  " + a + " = " + i*a);
					}
				}
			}
			else if(i>9) {
				int b = i * a;
				if(b>9)
				{
					if(a>9){
						System.out.println(i + " * " + a + " = " + i*a);
					}
					else{
						System.out.println(i + " *  " + a + " = " + i*a);
					}
				}
				else 
				{
					System.out.println(i + " *  " + a + " =  " + i*a);
				}
			}

		}
	}
}