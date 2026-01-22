public class CloneOfArray {
    public static void main(String[] args) {
        int[] A = { 10, 20, 30, 40, 50 };
        int[] B = A.clone();
        B[1] = 200;
        System.out.println(A[1]);
        System.out.println(B[1]);
    }
}