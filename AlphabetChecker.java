public class AlphabetChecker {

    // Static method to check and print based on character case
    public static void checkCharacter(char ch) {
        if (Character.isLowerCase(ch)) {
            System.out.println(1);
        } else if (Character.isUpperCase(ch)) {
            System.out.println(2);
        }
    }

    public static void main(String[] args) {
        checkCharacter('a'); // prints 1
        checkCharacter('Z'); // prints 2
        checkCharacter('G'); // prints 2
        checkCharacter('m'); // prints 1
        checkCharacter('4'); // prints nothing
    }
}