import java.util.Scanner;

class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println(name);
		System.out.println("the entered number is " + x);
	}
}