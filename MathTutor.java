import java.util.Scanner; 
import java.util.Random;  

//This program is a tutor that uses to increase basic math skills.
 

public class MathTutor
{
   public static void main(String[] args)
   {
      int num1;      
      int num2;      
      int sum;          
      int inputUser;   

      
      Scanner keyboard = new Scanner(System.in);
      
      // Create a Random object
      Random randomNum = new Random();

      // Generate two random numbers
      num1 = randomNum.nextInt(100);
      num2 = randomNum.nextInt(100);

      // Display equation
      System.out.println("What is the answer to the following problem?");
      System.out.print(num1 + " + " +
                       num2 + " = ? ");

      // Calculate the answer
      sum = num1 + num2;

      // Get the user's input
      inputUser = keyboard.nextInt();

      // Display if user is correct or incorrect
      if (inputUser == sum)
         System.out.println("Correct!");
      else
      {
         System.out.println("Sorry, wrong answer. The correct answer is " + sum);
      }
   }
}
