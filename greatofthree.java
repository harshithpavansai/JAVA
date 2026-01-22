import java.util.Scanner;

public class greatofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if (x > y && x > z) {
            System.out.println("biggest number is " + x);
        }
        if (y > x && y > z) {
            System.out.println("biggest number is " + y);
        }
        if (z > x && z > y) {
            System.out.println("biggest number is " + z);
        }
    }
}
