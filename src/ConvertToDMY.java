import java.util.Scanner;

public class ConvertToDMY {
    /*
    Assignment: Write an application that prompts the user to enter a total
    number of days and calculate the number of days, months, and years that represents.
    Assume a year has 365 days and a month has 30 days. Make sure to print units.
    */
    public static void main(String[] args) {
        /*
        Uses Scanner to take in user-inputted number of days and return the
        corresponding years, months, and days.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a total number of days: ");
        int totalDays = input.nextInt();

        int totalYears = totalDays / 365;

        int usedDays = totalYears * 365;

        int remainingDays = totalDays - usedDays;

        int totalMonths = remainingDays / 30;

        usedDays = usedDays + (totalMonths * 30); // IT TOOK FOREVER FOR ME TO REALIZE THAT I HAD TO PUT totalMonths!

        remainingDays = totalDays - usedDays; // WOW THIS IS SO COOL! :-)

        System.out.println(totalDays + " days have " + totalYears + " years, " + totalMonths + " months, and " + remainingDays + " days.");
    }
}
