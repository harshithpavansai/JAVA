public class foreachloop {
    public static void main(String[] args) {
        int[] A = { 10, 20, 30, 40, 50 };
        for (int i : A) {
            System.out.println(i);
        }
        int[] names = { "charlie", "bob", "alice" };
        for (String eachname : names) {
            System.out.println(eachname.charAt(0));
        }
    }
}
