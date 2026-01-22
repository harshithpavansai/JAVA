import java.util.Scanner;

public class isequal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String s1 = "abcdef";
        String s2 = "ABCDEF";

        boolean res = s1.equals(s2);
        boolean result = str1.equals(str2);
        System.out.println("for declared inputs " + res);
        System.out.println("for user input " + result);
    }
}