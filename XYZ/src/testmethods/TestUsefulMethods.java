package testmethods;

import methods.UsefulMethods;

public class TestUsefulMethods {

	public static void main(String[] args) {
		
		int a [] = {10,20,30,40,50,60,-60, -50, -40, -30, 100};
		int b [] = {-20, -30, -40, -50, -60};
		int c [] = {100, 200, 300, 400, -1000};
		int d [] = {1,5,3,10,5,15,8, 20};
		int e [] = {5,10,15, 20, 30,15, 30};
		String[] x = {"hari", "mohan", "dinesh", "hari", "prakash"};

		UsefulMethods um = new UsefulMethods();

		um.sum(10, 20);
		um.sum(20, -30);

		um.sumOfNaturalNumbers(10);
		um.sumOfNaturalNumbers(20);
		um.sumOfNaturalNumbers(50);
		um.sumOfNaturalNumbers(100);

		um.sumOfEvenNaturalNumbers(10);
		um.sumOfEvenNaturalNumbers(20);
		um.sumOfEvenNaturalNumbers(50);
		um.sumOfEvenNaturalNumbers(100);

		um.sumOfOddNaturalNumbers(10);
		um.sumOfOddNaturalNumbers(20);
		um.sumOfOddNaturalNumbers(50);
		um.sumOfOddNaturalNumbers(100);

		um.findFactorial(0);
		um.findFactorial(1);
		um.findFactorial(6);
		um.findFactorial(10);

		um.swap(10, 20);
		um.swap(100, 200);
		um.swap(50, 500);

		um.checkAnagram("madam");
		um.checkAnagram("dad");
		um.checkAnagram("shyam");

		um.fibonacci(5);
		um.fibonacci(10);
		um.fibonacci(20);

		um.checkArmstrong(0);
		um.checkArmstrong(1);
		um.checkArmstrong(153);
		um.checkArmstrong(370);
		um.checkArmstrong(371);
		um.checkArmstrong(451);
		
		um.MinMax(a);
		um.MinMax(b);
		um.MinMax(c);
		
		um.sumArray(a);
		um.sumArray(b);
		um.sumArray(c);
		
		um.checkEvenOdd(0);
		um.checkEvenOdd(1);
		um.checkEvenOdd(2);
		um.checkEvenOdd(10);
		um.checkEvenOdd(11);
		
		um.checkNegativePositive(0);
		um.checkNegativePositive(1);
		um.checkNegativePositive(-1);
		um.checkNegativePositive(10);
		um.checkNegativePositive(-10);
		
		um.reverseNum(12345);
		um.reverseNum(102030405);
		um.reverseNum(654321);
		
		um.reverseString("MADAM");
		um.reverseString("HELLO");	
		um.reverseString("NewYork");
		
		um.swapString("Hello","how");
		um.swapString("Hari","Shyam");
		um.swapString("Prakash","sangu");
		
		um.digitCount(123456);
		um.digitCount(1);
		um.digitCount(20);
		um.digitCount(100);
		um.digitCount(4000);
		um.digitCount(100001);
		
		
		um.getMissingNumber(d, 7);
		
		um.findDuplicateInt(e);
		
		um.findDuplicateString(x);
		
		um.commonElements(d,e);
		
		um.areaOfTriangle(3.01, 4.15, 5.0);
		um.areaOfTriangle(10.0, 10.0, 15.0);
		um.areaOfTriangle(3.5, 4.16, 5.10);
		um.areaOfTriangle(6.0, 14.0, 15.5);
		
		um.areaOfRectangle(4.0, 12.0);
		um.areaOfRectangle(5.10, 12.20);
		um.areaOfRectangle(14.8, 13.10);
		um.areaOfRectangle(8.0, 22.10);
		
		um.areaOfSquare(4.0);
		um.areaOfSquare(12.10);
		um.areaOfSquare(11.12);
		um.areaOfSquare(13.0);
		
		um.areaOfCircle(4.0);
		um.areaOfCircle(14.50);
		um.areaOfCircle(5.0);
		um.areaOfCircle(5.0);
		
		
		
		
		
	}

}
