package com.lti.model;

public class Courses {

	private int cId;
	private String cName;
	private int duration;
	private int fees;

	public Courses() {

	}

	public Courses(int cId, String cName, int duration, int fees) {
		//System.out.println("Parameterized Constructor");
		this.cId = cId;
		this.cName = cName;
		this.duration = duration;
		this.fees = fees;
	}

	public Courses(int cId, String cName, int fees) {
		// System.out.println("Parameterized Constructor");
		this.cId = cId;
		this.cName = cName;
		this.fees = fees;
	}

	// Getter and Setter
	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public void calculateMonthlyFee() {
		System.out.println("Monthly Fee: " + (fees / duration));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cId;
		result = prime * result + ((cName == null) ? 0 : cName.hashCode());
		result = prime * result + duration;
		result = prime * result + fees;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Courses other = (Courses) obj;
		if (cId != other.cId)
			return false;
		if (cName == null) {
			if (other.cName != null)
				return false;
		} else if (!cName.equals(other.cName))
			return false;
		if (duration != other.duration)
			return false;
		if (fees != other.fees)
			return false;
		return true;
	}

}
