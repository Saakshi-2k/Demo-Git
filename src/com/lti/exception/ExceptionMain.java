package com.lti.exception;

import java.util.Scanner;

public class ExceptionMain {

	static int res = 0;
	static int[] arr = new int[] { 10, 20, 30, 40, 50 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2, pos;
		Scanner sc = new Scanner(System.in);

		System.out.println("Main Begins");

		System.out.println("Enter two Numbers: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		System.out.println(divide(num1, num2));

		System.out.println("Enter the position");
		pos = sc.nextInt();

		int value = getElement(pos);
		if (value != 0) {
			System.out.println(value);
		}

		System.out.println("Main Ends");
	}

	public static int divide(int num1, int num2) {

		try {
			res = num1 / num2;
		} catch (Throwable e) {
			System.out.println("Cannot divide by zero");
			System.out.println(e.getMessage());
		}
		return res;
	}

	public static int getElement(int index) {
		int value = 0;
		try {
			value = arr[index];
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Position not found");
		}
		return value;
	}

}
