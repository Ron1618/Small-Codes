import java.util.Scanner;


 //This program calculates a student's average grade and can be used for multiple students.
 

public class TestAverages
{
   public static void main(String[] args)
   {
      int studentAmount;   
      int testAmounts;      
      double score;      
      double total;      
      double average;    
      
      // Create Scanner object
      Scanner keyboard = new Scanner(System.in);

      System.out.println("This program averages test scores.");

      // Get number of students
      System.out.print("How many students do you have? ");
      studentAmount = keyboard.nextInt();

      // Get number of test scores per student
      System.out.print("How many test scores per student? ");
      testAmounts = keyboard.nextInt();

      // Process all the students
      for (int student = 1; student <= studentAmount; student++)
      {
         // Set total to zero
         total = 0.0;

         // Get the test scores
         for (int test = 1; test <= testAmounts; test++)
         {
            System.out.print("Enter score " + test + " for student " + student + ": ");
            score = keyboard.nextDouble();
            total += score;  // Add score to total
         }

         // Calculate and display average
         average = total / testAmounts;
         System.out.println("The average score for student " +
                            student + " is " + average);
         System.out.println();
      }
   }
}