package com.lti.model;

public class DegreeCourse extends Courses {

	DegreLevel degreeLevel;
	boolean isPlacementAvailable;

	public DegreeCourse() {
		super(); // calls the default constructor of the parent class-courses
	}

	public DegreeCourse(int id, String name, int duration, int fees, DegreLevel degreeLevel,
			boolean isPlacementAvailable) {
		super(id, name, duration, fees);
		this.degreeLevel = degreeLevel;
		this.isPlacementAvailable = isPlacementAvailable;
	}

	public DegreLevel getDegreeLevel() {
		return degreeLevel;
	}

	public void setDegreeLevel(DegreLevel degreeLevel) {
		this.degreeLevel = degreeLevel;
	}

	public boolean isPlacementAvailable() {
		return isPlacementAvailable;
	}

	public void setPlacementAvailable(boolean isPlacementAvailable) {
		this.isPlacementAvailable = isPlacementAvailable;
	}
//-------------
	public void calculateMonthlyFee() {
		System.out.println(super.getcId()+" "+super.getcName()+" "+super.getDuration());
		super.calculateMonthlyFee();// reused base class method

		if (isPlacementAvailable) {
			System.out.println("Total Fees: " + (super.getFees() * 1.1));
			System.out.println(
					"In addition to monthly fees, you need to pay " + (super.getFees() * 0.1 + "as placemnet fees"));
		} else {
			System.out.println("Total Fees: " + (super.getFees()));
		}

	}
}
