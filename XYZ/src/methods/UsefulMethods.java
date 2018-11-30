package methods;

import java.util.HashSet;

public class UsefulMethods {

	// sum Method
	public void sum(int x, int y) {
		int a = x;
		int b = y;
		int sum = a + b;
		System.out.println("sum of two numbers: " + sum);
	}

	// 2. sum of natural numbers
	public void sumOfNaturalNumbers(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("The sum of " + n + " natural numbers is: " + sum);
	}

	// 3. Sum of even natural numbers
	public void sumOfEvenNaturalNumbers(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i = i + 2) {
			sum = sum + i;
		}
		System.out.println("The sum of even natural numbers upto  " + n + " is: " + sum);
	}

	// 4. Sum of Odd natural numbers
	public void sumOfOddNaturalNumbers(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i = i + 2) {
			sum = sum + i;
		}
		System.out.println("The sum of odd natural numbers upto  " + n + " is: " + sum);
	}

	// 5. Factorial of a given number
	public void findFactorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of : " + n + " is " + fact);
	}

	// 6.swap two numbers
	public void swap(int a, int b) {
		int x = a;
		int y = b;
		int temp;
		temp = x;
		x = y;
		y = temp;
		System.out.println("Numbers after swaping are: x = " + x + "  y = " + y);
	}

	// 7. check whether a given string is an anagram or not
	public void checkAnagram(String s) {
		// String p =s;
		String q = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			q = q + s.charAt(i);
		}
		// System.out.println(q + " is the reverse of " + s);
		if (s.equals(q)) {
			System.out.println(s + " is Anagram");
		} else {
			System.out.println(s + " is not Anagram");
		}
	}

	// 8. Fibonacci Series
	public void fibonacci(int n) {
		int num1 = 0;
		int num2 = 1;
		System.out.print(num1 + " " + num2 + " ");
		for (int i = 2; i <= n; i++) {
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			System.out.print(sum + " ");
		}
		System.out.println();
	}

	// 9. check Armstrong Number
	public void checkArmstrong(int a) {
		int num1 = a;
		int total = 0;
		int temp;
		while (num1 != 0) {
			temp = num1 % 10;
			total = total + temp * temp * temp;
			num1 = num1 / 10;
		}
		if (a == total) {
			System.out.println(a + " is an Armstrong Number");
		} else {
			System.out.println(a + " is not an Armstrong Number");
		}
	}

	// 10. Find Minimum, Maximum of an array
	public void MinMax(int[] a) {

		int min = a[0];
		int max = a[0];
		for (int i = 0; i < a.length; i++) {

			// Minimum of array
			if (min > a[i]) {
				min = a[i];
			}

			// maximum of array
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("Maximum number in the array is: " + max);
		System.out.println("minimum number in the array is: " + min);
	}

	// 11. sum the array elements
	public void sumArray(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("Sum of the array is: " + sum);
	}

	// 12. Check even/Odd
	public void checkEvenOdd(int i) {
		if (i % 2 == 0) {
			System.out.println(i + " is an even number");
		} else {
			System.out.println(i + " is an oddd number");
		}
	}

	// 13.check Negative/positive
	public void checkNegativePositive(int j) {
		if (j > 0) {
			System.out.println(j + " is a positive number");
		} else if (j < 0) {
			System.out.println(j + " is a negative number");
		} else {
			System.out.println(j + " is equal zero");
		}
	}

	// 14. Reversing number
	public void reverseNum(int i) {
		int num = i;
		int reverse = 0;
		while (num != 0) {
			reverse = reverse * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(reverse + " is the reverse of : " + i);
	}

	// 15. Reversing a String
	public void reverseString(String a) {
		String rev = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			rev = rev + a.charAt(i);
		}
		System.out.println(rev + " is the reverse of the given string " + a);
	}

	// 16. Swaping two String
	public void swapString(String a, String b) {
		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		System.out.println("Value of a: " + a + " value of b: " + b);
	}

	// 17. Digit count in a given number
	public void digitCount(int a) {
		int count = 0;
		int num = a;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		System.out.println(count + " is the number of digits of the given number:" + a);
	}

	// 18. Finding Missing number in an array
	public int getMissingNumber(int a[], int n) {
		int i, total;
		total = (n + 1) * (n + 2) / 2;
		for (i = 0; i < n; i++)
			total -= a[i];
		return total;
	}

	// 19. Finding duplicate String values of an array
	public void findDuplicateString(String[] names) {
		String duplicate = null;
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if ((names[i].equals(names[j])) && (i != j)) {
					duplicate = names[j];
					System.out.println("The duplicate element is: " + duplicate);
				}

			}
		}
	}

	// 20. Finding duplicate int values of an array
	public void findDuplicateInt(int[] a) {
		int duplicate;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if ((a[i] == (a[j])) && (i != j)) {
					duplicate = a[j];
					System.out.println("The duplicate element is: " + duplicate);
				}
			}
		}

	}

	// 21. finding common elements of two arrays
	public static void commonElement(int[] a, int[] b) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == (b[j])) {
					set.add(a[i]);
				}
			}
		}
		System.out.println("The common elements are: " + set);
	}

	// 22 Finding common elements of two arrays
	public void commonElements(int[] a, int[] b) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					set.add(a[i]);
				}
			}
		}
		System.out.println("The common elements are: " + set);
	}

	// 23. Finding are of a triangle given a,b, c are three sides of a triangle
	public void areaOfTriangle(double a, double b, double c) {
		double area = 1 / 2 * (a * b * c);
		System.out.println("Area of given triangle is: " + area);
	}

	// 24. Area of a rectangle
	public void areaOfRectangle(double length, double width) {
		double area = length * width;
		System.out.println("Area of Rectangle is: " + area);
	}

	// 25. Area of Square
	public void areaOfSquare(double side) {
		double area = side * side;
		System.out.println("Area of square is: " + area);
	}

	// 26. Area of circle
	public void areaOfCircle(double radius) {
		double area = Math.PI * radius * radius;
		System.out.println("Area of circle is: " + area);
	}

	// 27. Printing all elements of a string array
	public void printArrayElements(String[] a) {
		for (String b : a) {
			System.out.print(b + " ");
		}
		System.out.println();
	}

	// 28. Printing the elements of an Integer array
	public void printArray(int[] a) {
		for (int b : a) {
			System.out.print(b + " ");
		}
		System.out.println();
	}

	// 29. Using HashSet finding duplicate elements in an array
	public void duplicateElementsOfArray(int[] a) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int arrayElement : a) {
			if (!set.add(arrayElement)) {
				System.out.println("Duplicate elements are: " + arrayElement);
			}
		}
	}

	// 29. Using HashSet finding duplicate elements in an array
	public static void duplicateElementsOfArray(String[] a) {
		HashSet<String> set = new HashSet<String>();
		for (String arrayElement : a) {
			if (!set.add(arrayElement)) {
				System.out.println("Duplicate Element is : " + arrayElement);
			}
		}
	}

	// 30. Check prime number or not a prime number
	public static void checkPrime(int a) {
		int num = a;
		boolean flag = false;
		for (int i = 2; i <= num / 2; ++i) {
			// condition for non-prime number
			if (num % i == 0) {
				flag = true;
				break;
			}
		}

		if (!flag)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
	}
	
	
	

}
