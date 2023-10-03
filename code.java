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
            case '0': binary = binary + "000";
               break;
            case '1': binary = binary + "001";
               break;
            case '2': binary = binary + "010";
               break;
            case '3': binary = binary + "011";
               break;
            case '4': binary = binary + "100";
               break;
            case '5': binary = binary + "101";
               break;
            case '6': binary = binary + "110";
               break;
            case '7': binary = binary + "111";
               break;
            default: System.out.println("\nInvalid Octal Digit!");
               return;
         }
      }


      //one more solution
      import java.util.Scanner;

public class OctalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Octal Number: ");
        String octal = scanner.nextLine();

        // Check if the input contains only valid octal digits (0-7)
        if (!isValidOctal(octal)) {
            System.out.println("Invalid Octal Number!");
            return;
        }

        String binary = convertOctalToBinary(octal);

        System.out.println("Equivalent Binary Value: " + binary);
    }

    // Function to check if a given string is a valid octal number
    private static boolean isValidOctal(String octal) {
        for (char ch : octal.toCharArray()) {
            if (ch < '0' || ch > '7') {
                return false;
            }
        }
        return true;
    }

    // Function to convert an octal string to binary
    private static String convertOctalToBinary(String octal) {
        StringBuilder binary = new StringBuilder();

        for (char ch : octal.toCharArray()) {
            int octalDigit = ch - '0'; // Convert character to integer
            // Convert the octal digit to a 3-digit binary representation
            String binaryDigit = String.format("%03d", Integer.parseInt(Integer.toBinaryString(octalDigit)));
            binary.append(binaryDigit);
        }

        return binary.toString();
    }
}

      
      System.out.println("\nEquivalent Binary Value = " +binary);
   }
}
