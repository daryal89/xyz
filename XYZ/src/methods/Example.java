package methods;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int num = sc.nextInt();
		sc.close();
		if (isPrime(num)) {
			System.out.println(num + "  is a prime number");
		} else
			System.out.println(num + " is not a prime number");

	}

	public static boolean isPrime(int a) {
		if (a <= 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(a); i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

}
