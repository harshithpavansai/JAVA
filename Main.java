import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int x = 0;
        int y = 0;
        int[][] mat1 = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat1[i][j] = sc.nextInt();
                if (mat1[i][j] % 2 == 0) {
                    x += mat1[i][j];
                }
            }
        }
        int p = sc.nextInt();
        int q = sc.nextInt();
        int[][] mat2 = new int[p][q];
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                mat2[i][j] = sc.nextInt();
                if (mat2[i][j] % 2 != 0) {
                    y += mat2[i][j];
                }
            }
        }
        System.out.println(Math.abs(x - y));
    }
}