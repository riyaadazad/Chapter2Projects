public class StringManipulation1 { // BTW The assignment says to print out all 14 output prompts but there are only 13
    public static void main(String[] args) {
        String word = "Briar Woods High School";
        System.out.println(word);

        System.out.println("The character at position 4 is " + word.charAt(4));

        System.out.println("The length of the string is: " + word.length());

        word = word.concat(" is my school.");
        System.out.println(word);

        word = "Because I live in Loudoun County, ".concat(word); // https://beginnersbook.com/2013/12/java-string-concat-method-example/
        System.out.println(word);

        System.out.println("The length of the string is: " + word.length());

        System.out.println("word.substring(23) is: ");

        System.out.println("word.substring(23, 33) is: ");

        System.out.println("The location of the word \"school\" is at ");

        System.out.println("The location of the word \"School\" is at ");

        System.out.println("\"o\" is replaced with \"x\": ");

        System.out.println("Final Output: ");

        System.out.println("Final Length: ");
    }
}
