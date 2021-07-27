
//formatting shortcut: ctrl+shift+f

package com.lti.main;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lti.model.Courses;
import com.lti.model.DegreLevel;
import com.lti.model.DegreeCourse;
import com.lti.model.DiplomaCourse;
import com.lti.model.Student;
import com.lti.model.Type;

public class App {

	public static void main(String[] args) {
		// scenario2();
		// scenario3();
		// scenario9();
	}

	public static void scenario1() {
		Student student = new Student();
		String[] student2phoneNumbers = { "9848484", "8273674" };
		String[] student3phoneNumbers = { "9858484", "8273574" };
		Student student2 = new Student(101, "John", LocalDate.now(), student2phoneNumbers);
		Student student3 = new Student(102, "Mark", LocalDate.of(2003, 12, 31), student3phoneNumbers);

		InfoClass info = new InfoClass();
		info.display(student2);
		info.display(student3);
		info.display(student);
	}

	public static void scenario2() {

		Student[] students = new Student[3];
		String[] student1phoneNumbers = { "7645383", "2538468" };
		String[] student2phoneNumbers = { "2534373", "1928392" };
		String[] student3phoneNumbers = { "1628363", "1784829" };

		students[0] = new Student(101, "John", LocalDate.now(), student1phoneNumbers);
		students[1] = new Student(102, "Mark", LocalDate.now(), student2phoneNumbers);
		students[2] = new Student(103, "Bob", LocalDate.now(), student3phoneNumbers);

		InfoClass info = new InfoClass();
		info.display(students);
	}

	public static void scenario3() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of students:");
		int noOfStudents = sc.nextInt();

		Student[] students = new Student[noOfStudents];
		// noOfStudents=400
		for (int i = 0; i < students.length; i++) {
			System.out.println("Enter your id,name,date of birth(dd/MM/yyyy) and Number of phone Numbers");
			int id = sc.nextInt();
			String name = sc.next();
			String date = sc.next();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate dateOfBirth = LocalDate.parse(date, formatter);
			students[i] = new Student(id, name, dateOfBirth);
		}

		InfoClass.display(students);
	}

	public static void scenario4() {
		List<Student> students = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter your id,name,date of birth(dd/MM/yyyy) and Number of phone Numbers");
			int id = sc.nextInt();
			String name = sc.next();
			String date = sc.next();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate dateOfBirth = LocalDate.parse(date, formatter);
//storing student object in collections.
			students.add(new Student(id, name, dateOfBirth));

			System.out.println("Press 0 to stop");
			int num = sc.nextInt();
			if (num == 0)
				break;

		} while (true);
		InfoClass.display(students);
	}

//string is a special class in java as it comes with lots of features
	/*
	 * Final class cannot be inherited, String is an immutable class,it cannot be
	 * modified.
	 */

	/*
	 * Create Course class (id, name, duration, fees) - Modify Info class by adding
	 * one more method: public void display(Course course) { //Code here to display
	 * the details of given course }
	 */

	/*
	 * public static void scenario5() { Courses c1 = new Courses(101, "RDBMS", 3,
	 * 1000); Courses c2 = new Courses(102, "Java", 4, 1500); Courses c3 = new
	 * Courses(101, "Angular", 5, 2000);
	 * 
	 * InfoClass.display(c1); InfoClass.display(c2); InfoClass.display(c3); }
	 * 
	 * public static void scenario6() {
	 * 
	 * Courses[] courses = new Courses[3]; courses[0] = new Courses(101, "RDBMS", 3,
	 * 1000); courses[1] = new Courses(102, "Java", 4, 1500); courses[2] = new
	 * Courses(101, "Angular", 5, 2000);
	 * 
	 * InfoClass.display(courses); }
	 * 
	 * public static void scenario7() { Scanner sc1 = new Scanner(System.in);
	 * 
	 * System.out.println("Enter number of courses:"); int noOfCourses =
	 * sc1.nextInt();
	 * 
	 * Courses[] courses = new Courses[noOfCourses];
	 * 
	 * for (int i = 0; i < courses.length; i++) { System.out.
	 * println("Enter your course id, course name,Duration of course and Fees of course"
	 * ); int cId = sc1.nextInt(); String cName = sc1.next(); int duration =
	 * sc1.nextInt(); int fees = sc1.nextInt(); courses[i] = new Courses(cId, cName,
	 * duration, fees); }
	 * 
	 * InfoClass.display(courses); }
	 * 
	 * public static void scenario8() { List<Courses> courses = new
	 * ArrayList<Courses>(); Scanner sc1 = new Scanner(System.in); do { System.out.
	 * println("Enter your course id, course name,Duration of course and Fees of course"
	 * ); int cId = sc1.nextInt(); String cName = sc1.next(); int duration =
	 * sc1.nextInt(); int fees = sc1.nextInt(); courses.add(new Courses(cId, cName,
	 * duration, fees));
	 * 
	 * System.out.println("Press 0 to stop"); int num = sc1.nextInt(); if (num == 0)
	 * break;
	 * 
	 * } while (true); InfoClass.displayCourse(courses); }
	 */

	public static void scenario9() {
		DegreeCourse degreeCourse = new DegreeCourse(101, "Btech", 96, 100000, DegreLevel.Bachelors, true);
		InfoClass.displayCourse(degreeCourse);

		DiplomaCourse diplomaCourse = new DiplomaCourse(102, "Agri", 38, 50000, Type.Academics);
		InfoClass.displayCourse(diplomaCourse);

	}

}
