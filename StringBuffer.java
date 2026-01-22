public class StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        System.out.println("Original String: " + sb);
        sb.delete(5, 11);
        System.out.println("After delete(5, 11): " + sb);
        sb.insert(5, " World");
        System.out.println("After inserting back: " + sb);
        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt(5): " + sb);
    }
}
