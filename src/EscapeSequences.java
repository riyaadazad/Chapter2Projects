public class EscapeSequences {
    /*
    Assignment: Write an application that displays the following lines (not shown) - using
    only ONE System.out.println statement. Your program should be readable
    (i.e. nothing goes off the right of the screen). That means you will have to
    use plus signs (+) to continue your System.out.println from line to line.
    */
    public static void main(String[] args) { // Prints out a statement with various tabs, special characters, and new lines
        System.out.println("This is simply a demonstration of \"quote marks\"." + // Added an additional \n to the beginning of the println() statement to match the example provided (i.e. when the program ran it had an extra nbsp;)
                "\n\tIt also demonstrates the use of a tab character." +
                "\n\tRemember that the \"\\\" has a special meaning in \njava." +
                "\nThis concludes this demonstration.");
    }
}
