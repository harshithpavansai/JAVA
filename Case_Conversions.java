import java.util.Arrays;

public class Case_Conversions {
    public static void main(String[] args) {
        String s = "ADITYO";
        String tolowercase = s.toLowerCase();
        String touppercase = tolowercase.toUpperCase();
        System.out.println(tolowercase);
        System.out.println(touppercase);
        char[] arr = s.toCharArray();
        System.out.println(Arrays.toString(arr));
        arr[5] = 'A';
        System.out.println(Arrays.toString(arr));
        String st = new String(arr);
        System.out.println(st.toLowerCase());
    }

}
