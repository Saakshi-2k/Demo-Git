package com.lti.dao;

import java.util.List;

import java.util.Set;

import com.lti.model.Courses;
import com.lti.model.Student;

public interface StudentDao {
	boolean addStudent(Student student);
	void updateStudent(Student student);
	void removeStudent(int id);
	Student findAStudent(int id);
	List<Student> viewAllStudents();
	void enroll(int studentId, int courseId);
	Set<java.util.Map.Entry<Student, Courses>> viewEnrollments();
}
