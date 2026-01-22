import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i = 1;
        while (i <= x) {
            System.out.print(i + " ");
            i++;
        }
        int y = sc.nextInt();
        for (int j = 0; j <= y; j++) {
            System.out.print(j + " ");
        }
    }
}
