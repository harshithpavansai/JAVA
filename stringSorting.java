import java.util.*;

public class stringSorting {
    public static void main(String[] args) {
        String a = "university";
        char[] arr = a.toCharArray();
        Arrays.sort(arr);
        String result = new String(arr);
        System.out.println(result);
    }
}
