public class StringManipulation2 { // Assignment: Create three string objects in your program. Their values should be: (not shown.)
    public static void main(String[] args) {
        String string1 = "This is a test.";
        String string2 = "For the next sixty seconds we will conduct a test of the emergency broadcast system.";
        String string3 = "This is only a test.";

        // a. Find the character at location 27 in string2. Print it out.
        System.out.println("The character at location 27 in string2 is: " + string2.charAt(27));

        /*
        b. Append string3 to the end of string2 to the end of string1. Store these
        in a 4th string called string4. Print out the resulting string.
        */
        StringBuilder string4 = new StringBuilder(string1); // https://www.tutorialspoint.com/java/lang/stringbuilder_append_string.htm
        string4.append(string2);
        string4.append(string3);
        System.out.println("string4: " + string4);

        // c. Compare string2 to string4 to see if they are EQUAL using .equals(). Print out the result.
        System.out.println("Compare string2 and string4 using .equals: " + string2.equals(string4)); // https://www.geeksforgeeks.org/difference-equals-method-java/

        /*
        d. Compare string2 to string3 to see which comes first using compareTo(). Print out the result
        (a negative number, 0 or a positive number).
        */
        System.out.println("Compare string2 and string3 using .compareTo: " + string2.compareTo(string3));

        // e. Create string5. Its value should be "this is only a test." Print out string5.
        String string5 = "this is only a test.";
        System.out.println("string5: " + string5);

        // f. Compare string3 to string5 to see if they are EQUAL using .equals(). Print out the result.
        System.out.println("Compare string3 to string5 using .equals: " + string3.equals(string5));

        // g. Compare string3 to string5 to see if they are equal if you ignore cases. Print out the result.
        System.out.println("Compare string3 and string5 ignore case: " + string3.equalsIgnoreCase(string5));

        // h. See if the string "he" exists in string1. Print out the numerical result.
        System.out.println("Does \"he\" exist in string1? " + string1.indexOf("he"));

        // i. See if the string "he" exists in string2. Print out the numerical result.
        System.out.println("Does \"he\" exist in string2? " + string2.indexOf("he"));

        // j. Replace all occurrences of "he" with "xyzzy" in string 2. Print out the result.
        string2 = string2.replace("he", "xyzzy");
        System.out.println("Replace \"he\" with \"xyzzy\" in string2: " + string2);

        // k. Determine the length of string 1 and print out the result.
        System.out.println("string1 length: " + string1.length());

        // l. Print out part of string1, starting at the 3rd character all the way to the end.
        System.out.println("string1 starting at the 3rd character: " + string1.substring(2));

        // m. Print out part of string2, starting at position 2 and going through position 10.
        System.out.println("string2 from position 2 to 10: " + string2.substring(2, 10));
    }
}
