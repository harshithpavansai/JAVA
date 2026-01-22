public class coinsDenomination {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 5, 10, 50, 100 };
        int target = 256;
        int coins = 0;
        for (int i = nums.length - 1; i >= 0; i++) {
            if (target > i) {
                coins += target % i;
            }
        }
        System.out.println(coins);

    }
}
