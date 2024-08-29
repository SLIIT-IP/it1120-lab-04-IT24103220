import java.util.Scanner;
         
              public class IT24103220Lab4Q3 {
                     public static void main (String[] args)   {
                     double num1;
 
              Scanner input = new Scanner(System.in);
              System.out.print("Enter a number: ");
              num1 = input.nextDouble();
              String result = (num1 > 0 ) ? "positive" :
                              (num1 < 0) ? "Negative" : "zero" ;
                    System.out.println("The number is " +result);


                      }
          }
                  