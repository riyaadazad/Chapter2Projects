import java.util.Scanner;

public class AverageCorrect {
    public static void main(String[] args) { // Takes in user input ints and returns average as a double
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        System.out.print("Enter third (final) number: ");
        int thirdNumber = input.nextInt();

        int numberSum = firstNumber + secondNumber + thirdNumber;
        int numberCount = 3;

        Double avgNumber = Double.valueOf(numberSum) / Double.valueOf(numberCount);

        System.out.println("The average is " + avgNumber);

        /*
        * I can't believe it worked this is so awesome!!!
        * I used Beginners Book again to solve this problem:
        * https://beginnersbook.com/2018/09/java-convert-int-to-double/
        */
    }
}
