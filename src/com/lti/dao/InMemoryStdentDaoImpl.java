package com.lti.dao;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import com.lti.model.Courses;
import com.lti.model.Student;

public class InMemoryStdentDaoImpl implements StudentDao {

	static List<Student> students = new ArrayList<Student>();
	static Set<Courses> courses = new HashSet<Courses>();
	static Map<Student, Courses> enrollments = new HashMap<>();

	public InMemoryStdentDaoImpl() {
		students.add(new Student(1001, "John", LocalDate.of(2000, 07, 12)));
		students.add(new Student(1001, "Jack", LocalDate.of(2001, 05, 29)));
		students.add(new Student(1001, "Steve", LocalDate.of(2000, 10, 22)));
		students.add(new Student(1001, "Bob", LocalDate.of(2002, 02, 03)));
		students.add(new Student(1001, "Ricky", LocalDate.of(1999, 11, 12)));

		courses.add(new Courses(10001, "Java", 4, 3000));
		courses.add(new Courses(10002, "Javascript", 3, 3500));
		courses.add(new Courses(10003, "Python", 5, 5000));

	}

	// write code to find a course

	@Override
	public boolean addStudent(Student student) {
		return students.add(student);
	}

	@Override
	public void updateStudent(Student student) {
		Student existingStudent = findAStudent(student.getId()); // checking if student with that id is present or nor

		if (existingStudent != null) {
			int position = students.indexOf(existingStudent); // checking the position where that student is there.
			students.set(position, student);
			System.out.println("Student details updated");
		} else {
			System.out.println("Student not found");
		}
	}

	@Override
	public void removeStudent(int id) {
		Student existingStudent = findAStudent(id);

		if (existingStudent != null) {
			int position = students.indexOf(existingStudent);
			students.remove(position);
			System.out.println("Student unregistered");
		} else {
			System.out.println("Student not found");
		}
	}

	@Override
	public Student findAStudent(int id) {
		for (Student st : students) {
			if (st.getId() == id) {
				return st;
			}
		}
		return null;
	}

	@Override
	public List<Student> viewAllStudents() {

		return students;
	}

	public Courses findACourse(int courseId) {
		for (Courses courses : courses) {
			if (courses.getcId() == courseId) {
				return courses;
			}
		}
		return null;
	}

	@Override
	public void enroll(int studentId, int courseId) {
		Student student = findAStudent(studentId);
		Courses courses = findACourse(courseId);
		if (student == null || courses == null) {
			System.out.println("Either course or student not found");
		}else {
			enrollments.put(student, courses);
			System.out.println("Enrolled successfully");
		}
	}
	
	@Override
	public Set<Entry<Student,Courses>> viewEnrollments(){
		return enrollments.entrySet();
	}
	

}
