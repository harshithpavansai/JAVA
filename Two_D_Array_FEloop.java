public class Two_D_Array_FEloop {
    public static void main(String[] args) {
        int[][] A = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
        for (int[] eachArray : A) {
            for (int eachValue : eachArray)

            {
                System.out.print(eachValue + " ");
            }
            System.out.println();
        }
    }

}
