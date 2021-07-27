package com.lti.exception;

public class ExceptionMain2 {

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
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} catch (Throwable e) {
			// TODO: handle exception
		}

		System.out.println("Main Ends");

	}

}
