import java.util.Scanner;

public class CodesCracker
{
   public static void main(String[] args)
   {
      int i;
      String binary="";
      
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter the Octal Number: ");
      String octal = s.nextLine();
      
      for(i=0; i<octal.length(); i++)
      {
         char ch = octal.charAt(i);
         switch(ch)
         {
            //help to create logic
         }
      }
      
      System.out.println("\nEquivalent Binary Value = " +binary);
   }
}
