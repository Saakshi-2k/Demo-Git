package com.lti.string;

public class StringDemo {

	public static void main(String[] args) {
		/*System.out.println("*********");
		String str1 = new String("LTI");
		String str2 = new String("LTI");

		System.out.println(str1 == str2); // check the reference(points to diff memory location) o/p-false
		System.out.println(str1.equals(str2)); // checks the value o/p-true

		System.out.println("*********");
		String str3 = "Hello World";
		String str4 = "Hello World";
		String str5= new String("Hello World");
		
		System.out.println(str3 == str4); // check the reference(points to diff memory location) o/p-false
		System.out.println(str3.equals(str4)); // checks the value o/p-true

		System.out.println(str3 == str5); // check the reference(points to diff memory location) o/p-false
		System.out.println(str3.equals(str5)); // checks the value o/p-true

		System.out.println("*********");
		String str6=new String("Hello");
		String str7="Hello";
		
		System.out.println(str6 == str7); // check the reference(points to diff memory location) o/p-false
		System.out.println(str6.equals(str7)); // checks the value o/p-true

		String str8="Hello";
		System.out.println(str7==str8);
		System.out.println(str7.equals(str8));
		
		System.out.println("*********");
		str8="Hello World";
		System.out.println(str4==str8);
		
		
		System.out.println("*********");
		String st1="LTI";
		String st2="LTI";
		
		st1="L&T";
		String st3="LTI";
		System.out.println(st1==st2);
		System.out.println(st2==st3);
	*/
		String str1="LTI";
		System.out.println(str1);
		//str1+=" is L&T Infotech";
		//str1.concat(" is L&T Infotech");- this will return lti as it is immutable
		//str1=str1.concat(" is L&T Infotech");- this will return complete statement
		System.out.println(str1);
		
		
	}

}


//why string is immutable:
/*-because string is immutable it can be reused from the string pool.
 * -when the class is loading in the memory during runtime,the class names are passed as an string argument.
 * In this case if string is mutable, then anyone can change the class name and run malicious code.
 * 
 * 
 */
