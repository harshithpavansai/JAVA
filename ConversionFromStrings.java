import java.util.Scanner;

public class ConversionFromStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(Integer.parseInt("33", 8));
        System.out.println(Integer.parseInt("1011", 2));
        System.out.print("enter a number: ");
        int x = sc.nextInt();
        System.out.println(Integer.toString(x, 2));

        String hexString = "1f";

        int x = Integer.parseInt(hexString, 16);
        System.out.println(Integer.parseInt(hexString, 16));
        System.out.println(Integer.toString(x, 2));

        // System.out.println(Integer.toBinaryString(Integer.parseInt(hexString, 16)));
    }

}
