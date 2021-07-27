package com.lti.polymorphism;

import java.util.Scanner;

public class InterfaceMain {

	public static void main(String[] args)
	{
		System.out.println("1. ICICI \n2. SBI\nSelect your card:");
		Scanner sc=new Scanner(System.in);
		int ch = sc.nextInt();
		
		ATM atm=null;
		if(ch==1)
			atm=new IciciAtm();
		if(ch==2)
			atm=new SBIAtm();
		
		atm.withdraw(5000);
		System.out.println(atm.checkBalance());
	}
}
