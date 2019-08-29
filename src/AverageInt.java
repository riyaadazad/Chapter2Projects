import java.util.Scanner;

public class AverageInt {
    /*
    Assignment: Write an application that prompts the user to enter in three int
    values. Create and read three int variables from the user. Calculate their average
    and store it in an int variable. Print out the average as an int value.
    */
    public static void main(String[] args) { // Uses Scanner to take in user-inputted ints and returns the average

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        System.out.print("Enter third (final) number: ");
        int thirdNumber = input.nextInt();

        int numberSum = firstNumber + secondNumber + thirdNumber;
        int numberCount = 3;

        int avgNumber = numberSum / numberCount;

        System.out.println("The incorrect average is " + avgNumber);

        /*
        Was this supposed to be difficult because it was pretty difficult...
        To solve this problem I looked on Stack Overflow (https://stackoverflow.com/questions/7337167/system-out-print-method-doesn%c2%b4t-work-right)
        and Beginners Book (https://beginnersbook.com/2017/09/java-program-to-read-integer-value-from-the-standard-input/)
        ...But once I solved it,
         */

    }
}
