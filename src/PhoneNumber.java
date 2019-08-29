import java.util.Random;

public class PhoneNumber {
    /*
    Assignment: Write a program that creates and prints 20 RANDOM phone numbers of the form (XXX) YYY - ZZZZ
    Include the parentheses and the dash in your output.

    Area Code: Do not let an 8 or 9 appear ANYWHERE in the area code (first three digits - XXX). Do not let the area
    code start with a 0 or 1. There are no other restrictions on this number!

    Prefix: Do not let the second set of three digits, YYY, be greater than 742. Do not let the second set of three
    digits start with a 0 or 1 either. (In other words, 571 is valid but 175 is not.) There are no other restrictions
    on this number.

    Line Number: There are no restrictions on the value of the last four digits.

    Warning: Each digit MUST print in your answer. You need to let the computer pick a random number for you.

    Hint: Think this through. Sometimes you have to determine each digit separately, and sometimes you don't. You may
    want to use the DecimalFormat class.

    Error Checking: Depending on your algorithm, make sure it is a valid phone number. (571) 555 - 0022
    should not read (571) 555 - 22 with the zeroes missing.
    */
    public static void main(String[] args) {

        Random randomNumber = new Random(); // https://www.geeksforgeeks.org/generating-random-numbers-in-java/
        int phoneNumber = 1; // https://javarevisited.blogspot.com/2013/05/how-to-generate-random-numbers-in-java-between-range.html

        for (int i = 0; i < 20; i++) {
            int areaCode1 = (int)(8 * Math.random());
            int areaCode2 = (int)(8 * Math.random());
            int areaCode3 = (int)(8 * Math.random());
            int prefix1 = randomNumber.nextInt(7);
            int prefix2 = randomNumber.nextInt(7);
            int prefix3 = randomNumber.nextInt(7);
            int lineNumber1 = randomNumber.nextInt(10);
            int lineNumber2 = randomNumber.nextInt(10);
            int lineNumber3 = randomNumber.nextInt(10);
            int lineNumber4 = randomNumber.nextInt(10);

            System.out.println("Phone Number #" + phoneNumber + " is " + "(" + areaCode1 + areaCode2 + areaCode3 + ") " +
                    prefix1 + prefix2 + prefix3 + " - " +
                    lineNumber1 + lineNumber2 + lineNumber3 + lineNumber4);

            phoneNumber++;
        }

    }
}
