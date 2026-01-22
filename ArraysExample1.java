public class ArraysExample1 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60 };
        System.out.println(arr.length);
        System.out.println(arr[5]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "-->" + arr[i]);
        }

        String[] names = { "harry", "ron", "hermonie" };
        System.out.println(names.length);
        System.out.println(names[1]);
        for (int j = names.length - 1; j >= 0; j--) {
            System.out.println(names[j]);
        }
    }

}
