
import java.math.BigInteger;
import java.util.Scanner;
public class Main {


    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        String userInput;

        System.out.println("Enter a hexadecimal number: ");
        userInput = scnr.nextLine();

        if (userInput.substring(0,1) == "0x") {
            userInput.replace("0x","");

        }
        userInput = userInput.toUpperCase();

        long total = 0;

        int i;
//hahahhah
        for (i = 0; i < userInput.length(); ++i)

        {
            long valueChar = 0;

            if (userInput.charAt(i) == '0') {

                valueChar = (long) (0 * Math.pow(16, userInput.length() - 1 - i));

            }

            if (userInput.charAt(i) == '1') {

                valueChar = (long) (1 * Math.pow(16, userInput.length() - 1 - i));
            }
            if (userInput.charAt(i) == '2') {

                valueChar = (long) (2 * Math.pow(16, userInput.length() - 1 - i));
            }

            if (userInput.charAt(i) == '3') {

                valueChar = (long) (3 * Math.pow(16, userInput.length() - 1 - i));
            }

            if (userInput.charAt(i) == '4') {

                valueChar = (long) (4 * Math.pow(16, userInput.length() - 1 - i));
            }
            if (userInput.charAt(i) == '5') {

                valueChar = (long) (5 * Math.pow(16, userInput.length() - 1 - i));
            }

            if (userInput.charAt(i) == '6') {

                valueChar = (long) (6 * Math.pow(16, userInput.length() - 1 - i));
            }

            if (userInput.charAt(i) == '7') {

                valueChar = (long) (7 * Math.pow(16, userInput.length() - 1 - i));
            }

            if (userInput.charAt(i) == '8') {

                valueChar = (long) (8 * Math.pow(16, userInput.length() - 1 - i));
            }

            if (userInput.charAt(i) == '9') {

                valueChar = (long) (9 * Math.pow(16, userInput.length() - 1 - i));
            }

            if (userInput.charAt(i) == 'A') {

                valueChar = (long) (10 * Math.pow(16, userInput.length() - 1 - i));
            }

            else if (userInput.charAt(i) == 'B') {

                valueChar = (long) (11 * Math.pow(16, userInput.length() - 1 - i));
            }

            if (userInput.charAt(i) == 'C') {

                valueChar = (long) (12 * Math.pow(16, userInput.length() - 1 - i));
            }

            if (userInput.charAt(i) == 'D') {

                valueChar = (long) (13 * Math.pow(16, userInput.length() - 1 - i));
            }

            if (userInput.charAt(i) == 'E') {

                valueChar = (long) (14 * Math.pow(16, userInput.length() - 1 - i));
            }

            if (userInput.charAt(i) == 'F') {

                valueChar = (long) (15 * Math.pow(16, userInput.length() - 1 - i));
            }
            total += valueChar;


        }
       /* String result = String.valueOf(total);
        result = result.replace(".0","");*/
        System.out.println("Your number is " + total + " in decimal");
    }
}

