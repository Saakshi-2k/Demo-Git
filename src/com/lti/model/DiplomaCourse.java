package com.lti.model;

public class DiplomaCourse extends Courses {

	private Type type;

	public DiplomaCourse() {
		super();
	}

	public DiplomaCourse(int id, String name, int duration, int fees, Type type) {
		super(id, name, duration, fees);
		this.type = type;

	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	public void calculateMonthlyFee() {
		System.out.println(super.getcId()+" "+super.getcName()+" "+super.getDuration());
		super.calculateMonthlyFee();// reused parent class method

		if (type.name().equals("Professional")) {
			System.out.println("Total Fees: " + (super.getFees() * 1.1));
		}
		else {
			System.out.println("Total Fees: "+(super.getFees()*1.05));
		}
	}
}
