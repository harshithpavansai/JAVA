public class stringEquals {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "ABCD";
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.compareTo(b));
        System.out.println(a.compareToIgnoreCase(b));
    }

}
