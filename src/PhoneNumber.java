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

        int phoneNumber = 0;
        for (int i = 0; i < 21; i++) {
            System.out.println(phoneNumber);
        }

    }
}
