package com.lti.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionMain1 {

	public static void main(String[] args) {

		System.out.println("Main Begins");
		try {
			fileRead("^_^");
		} catch (Exception e) {
			System.out.println("File not found.");
		}
		System.out.println("Main ends");

	}

	public static void fileRead(String fileName) {
		FileReader reader = null;

		try {
			reader = new FileReader(fileName);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		char[] ch = new char[100];
		try {
			reader.read(ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(ch);

	}

}
