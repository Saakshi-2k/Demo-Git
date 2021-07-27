package com.lti.main;

import java.util.Arrays;
//import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.lti.model.Courses;
import com.lti.model.DegreeCourse;
import com.lti.model.Student;

public class InfoClass {

	public static void display(Student student) // call by reference
	{
		// System.out.println(student.getId()+" "+student.getName()+"
		// "+student.getDateOfBirth()+" "+student.getCollegeName());
		System.out.println(student.getId() + " " + student.getName() + " " + student.getDateOfBirth() + " "
				+ Student.getCollegeName() + " " + Arrays.toString(student.getPhoneNumbers()));
	}

	public static void display(Student[] students) {
		/*
		 * for(i=0;i<student.length;i++) { display(student[i]); }
		 */
		for (Student st : students) {
			display(st);
		}

	}

	public static void display(List<Student> students) {

		/*
		 * for(Student st:students) { display(st);}
		 */

		// Iterator<Student> studs= students.iterator();
		ListIterator<Student> studs = students.listIterator();
		while (studs.hasNext()) {
			Student st = studs.next();
			display(st);
		}
		System.out.println("-----------");

		while (studs.hasPrevious()) {
			Student st1 = studs.previous();
			display(st1);
		}

	}

//************************************************************Courses
	/*
	 * Create Course class (id, name, duration, fees) - Modify Info class by adding
	 * one more method: public void display(Course course) { //Code here to display
	 * the details of given course }
	 */
	/*
	 * public static void display(Courses course) {
	 * 
	 * System.out.println( course.getcId() + " " + course.getcName() + " " +
	 * course.getDuration() + " " + course.getFees()); }
	 * 
	 * public static void display(Courses[] courses) {
	 * 
	 * for (Courses cr : courses) { display(cr); }
	 * 
	 * }
	 * 
	 * public static void displayCourse(List<Courses> courses) {
	 * ListIterator<Courses> crs = courses.listIterator(); while (crs.hasNext()) {
	 * Courses cr = crs.next(); display(cr); } System.out.println("-----------");
	 * 
	 * while (crs.hasPrevious()) { Courses cr1 = crs.previous(); display(cr1); }
	 * 
	 * }
	 */

	public static void displayCourse(Courses course) {
		course.calculateMonthlyFee();
	}

}
