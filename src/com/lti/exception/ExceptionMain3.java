package com.lti.exception;

import java.util.Scanner;

public class ExceptionMain3 {

	public static void main(String[] args) {
		System.out.println("Main Begins");
		int[] num = { 1, 2, 3 };

		int[] num1 = { 10, 20, 30, 40, 50 };
		try {
			System.out.println(num[0]);
			System.out.println(num1[9]);
		} catch (NullPointerException e) {
			System.out.println("Array is not initialised.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage() + " Position not available");
		} finally {
			System.out.println("Finally Executed");
		}

		int age = 0;
		System.out.println("Enter the age: ");
		age = new Scanner(System.in).nextInt();

		if (age < 0)
			try {
				throw new NegativeAgeException("Age cannot be negative ");
			} catch (NegativeAgeException e) {
				System.out.println(e.getMessage());
			}
		else {
			System.out.println("You are " + age + " years old");
		}

		System.out.println("Main Ends");

	}

}
