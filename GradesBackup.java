import java.util.Scanner;  

public class Grades{
   public static void main(String[] args){

      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("enter a number grade: ");
      String numberGrades = keyboard.next();

      if(numberGrades.contains(".0") || numberGrades.contains(".5")){
         if (numberGrades.equals("10.0") || numberGrades.equals("9.5") || numberGrades.equals("9.0") || numberGrades.equals("8.5"))
         {
            System.out.println("letter grade is A");
         }
         else if (numberGrades.equals("8.0") || numberGrades.equals("7.5"))
         {
            System.out.println("letter grade is B");
         }
         else if (numberGrades.equals("7.0") || numberGrades.equals("6.5"))
         {
            System.out.println("letter grade is C");
         }    
         else if (numberGrades.equals("6.0") || numberGrades.equals("5.5"))
         {
            System.out.println("letter grade is D");
         }
         else if (numberGrades.equals("5.0") || numberGrades.equals("4.5") || numberGrades.equals("4.0") || numberGrades.equals("3.5") || numberGrades.equals("3.0"))
         {
            System.out.println("letter grade is F");
         }
         else if (numberGrades.equals("2.5") || numberGrades.equals("2.0") || numberGrades.equals("1.5") || numberGrades.equals("1.0") || numberGrades.equals("0.5") || numberGrades.equals("0.0"))
         {
            System.out.println("letter grade is F");
         }
         else
         {
         System.out.println("ERROR: " + numberGrades);
         }
      }
      else
      {
         System.out.println("ERROR: " + numberGrades);
      }
   }
}
