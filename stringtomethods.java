import java.util.*;

public class stringtomethods {
    public static void main(String[] args) {
        String[] names = { "abc", "def", "ghi", "jkl" };
        String answerString = "";
        for (String eachString : names) {
            answerString += eachString;
        }
        System.out.println(answerString);
    }

}
