import java.util.Scanner;  

public class DivisibleBy13Plus{
     
      public static void main(String[] args){
            
            Scanner keyboard = new Scanner(System.in);
      
            int x;
            
            do{
                  System.out.print("Enter any integer: ");
                  x = keyboard.nextInt();

                  if (x >= 0){
                        if( x == 0)
                        {
                               System.out.println("0 is divisible by 13, 17 or 19");
                               break;
                        }
                        else if (x % 17 == 0)
                        {
                             System.out.println( x + " is divisible by 13, 17 or 19");
                        
                        
                        }
                        else if (x % 13 == 0)
                        {
                              System.out.println( x + " is divisible by 13, 17 or 19");
                        

                        }
                         else if (x % 19 == 0)
                        {
                           System.out.println( x + " is divisible by 13, 17 or 19");
                        

                        }
                        else if (x != 0)
                        {
                              System.out.println( x + " is NOT divisible 13, 17 or 19");
                        }
                  }
            }while (x>=0);
      }
}
