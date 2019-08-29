public class StringManipulation1 {
    /*
    Assignment: Write a program to do the following: ** Print out all 14 output prompts.
    */
    public static void main(String[] args) { // BTW The assignment says to print out all 14 output prompts but there are only 13
        // a. Create a String called word and give it a value. The value should be "Briar Woods High School".
        String word = "Briar Woods High School";
        System.out.println(word);

        // b. Print out the character at position 4 in the String. Use the .charAt() method.
        System.out.println("The character at position 4 is " + word.charAt(4));

        // c. Print out the length of the string. Use the .length() method.
        System.out.println("The length of the string is: " + word.length());

        /*
        d. Concatenate " is my school." to the end of your String and store the new String into word.
        The resulting String should be "Briar Woods High School is my school."
        Use the .concat() method to do this. Print out the resulting String.
        */
        word = word.concat(" is my school.");
        System.out.println(word);

        /*
        e. Concatenate "Because I live in Loudoun County," to the beginning of your String and store the new String into
        word. The resulting String should read "Because I live in Loudoun County, Briar Woods High School is my school."
        Use the .concat() method to do this. Print out the resulting String.
        */
        word = "Because I live in Loudoun County, ".concat(word); // https://beginnersbook.com/2013/12/java-string-concat-method-example/
        System.out.println(word);

        // f. Print out the length of the String. Use the .length() method.
        System.out.println("The length of the string is: " + word.length());

        /*
        g. Print out the substring of your string starting with the character at position 23.
        (Remember that Strings start at position 0, so the first character in your string will be a "u".)
        */
        System.out.println("word.substring(23) is: " + word.substring(23));

        /*
        h. Print out the substring of your string starting with the character in position 23 and
        ending with the character in position 33. Be careful to use the substring method correctly.
        This should print out "un County".
        */
        System.out.println("word.substring(23, 33) is: " + word.substring(23, 33));

        // i. Print out the location of the word "school" in your String. Use the .indexOf() Method to do this.
        System.out.println("The location of the word \"school\" is at " + word.indexOf("school"));

        /*
        j. Print out the location of the word "School" in your String. Use the .indexOf() Method to do this.
        Notice this answer is not the same as the last one. Do you know why not?
        */
        System.out.println("The location of the word \"School\" is at " + word.indexOf("School"));

        /*
        k. Convert every occurrence of the letter "o" to "x" in your String. Use the .replace() method to do this.
        Print out the resulting String.
        */
        word = word.replace("o", "x");
        System.out.println("\"o\" is replaced with \"x\": " + word);

        // Convert your String to upper case. Print out the resulting String.
        System.out.println("Final Output: " + word.toUpperCase());

        // Print out the length of the final String using the .length() method.
        System.out.println("Final Length: " + word.length());

        /*
        Did you know... You can chain some methods together. For example:
        word.substring(3, 20).equals(otherWord.substring(6) + "hello");
        */
    }
}
