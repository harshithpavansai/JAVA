import java.util.Scanner;

public class StaticMethod {
    static boolean isFactor(int a, int b) {
        if (b % a == 0) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(isFactor(a,b));
    }
}
