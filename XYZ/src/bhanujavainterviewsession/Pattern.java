package bhanujavainterviewsession;

public class Pattern {

	public static void main(String[] args) {
		// 1. Increasing (column) Pattern
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println("---------pattern2----------");
		// 2. Decreasing (column) Pattern
		for (int i = 6; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println("---------pattern2----------");

		// 2. Decreasing (column) Pattern
		for (int i = 6; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println("---------pattern2----------"); 

	}

}
