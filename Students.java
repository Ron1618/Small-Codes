import java.util.Scanner;
public class Students{
	public static void main(String [] args){
		Scanner a = new Scanner(System.in);
		

		System.out.print("enter student1 name: ");
		String sn1 = a.nextLine();
		
		System.out.print("enter student1 score: ");
		double ss1 = a.nextDouble();

		a.nextLine();
		
		System.out.print("enter student2 name: ");
		String sn2 = a.nextLine();
		
		System.out.print("enter student2 score: ");
		double ss2 = a.nextDouble();

		a.nextLine();
		

		System.out.print("enter student3 name: ");
		String sn3 = a.nextLine();
		
		System.out.print("enter student3 score: ");
		double ss3 = a.nextDouble();


		if(ss1>ss2&&ss1>ss3)
		{
			if(ss2>ss3){
				System.out.println("first place student: " + sn1);
				System.out.println("second place student: " + sn2);
				System.out.println("third place student: " + sn3);
			}
			else if(ss2<ss3){
				System.out.println("first place student: " + sn1);
				System.out.println("second place student: " + sn3);
				System.out.println("third place student: " + sn2);
			}


		}
		else if(ss2>ss1&&ss2>ss3)
		{
			if(ss1>ss3){
				System.out.println("first place student: " + sn2);
				System.out.println("second place student: " + sn1);
				System.out.println("third place student: " + sn3);
			}
			else if(ss1<ss3){
				System.out.println("first place student: " + sn2);
				System.out.println("second place student: " + sn3);
				System.out.println("third place student: " + sn1);
			}


		}
		else if(ss3>ss2&&ss3>ss1)
		{
			if(ss2>ss1){
				System.out.println("first place student: " + sn3);
				System.out.println("second place student: " + sn2);
				System.out.println("third place student: " + sn1);
			}
			else if(ss2<ss1){
				System.out.println("first place student: " + sn3);
				System.out.println("second place student: " + sn1);
				System.out.println("third place student: " + sn2);
			}


		}
		
		
	
	
	
	}

}