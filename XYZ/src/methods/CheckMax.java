package methods;

public class CheckMax {
	// 39. Check two maximum values of the array
	public static void checkMaximum(int num[]) {
		int max1 = num[0];
		int max2 = num[0];
		for (int i = 0; i < num.length; i++) {
			if (max1 < num[i]) {
				max2 = max1;
				max1 = num[i];
			} else if (max2 < num[i]) {
				max2 = num[i];
			}
		}
		System.out.println("The max1 value is: " + max1);
		System.out.println("The max2 value is: " + max2);

	}

	// 40. Check two minimum values of the array
	public static void checkMin(int[] num) {
		int min1 = num[0];
		int min2 = num[0];
		for (int i = 0; i < num.length; i++) {
			if (min1 > num[i]) {
				min2 = min1;
				min1 = num[i];
			} else if (min2 > num[i]) {
				min2 = num[i];
			}
		}
		System.out.println("Minimum1 value is: " + min1);
		System.out.println("Minimum2 value is: " + min2);
	}

	public static void main(String[] args) {
		int[] numbers = { 10, 29, 80, 35, 100, 900, 1000, 2000, -100, -289, 3000 };
		CheckMax cm = new CheckMax();
		CheckMax.checkMaximum(numbers);
		CheckMax.checkMin(numbers);

	}
}
