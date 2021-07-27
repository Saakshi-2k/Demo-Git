package com.lti.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import com.lti.model.Courses;
import com.lti.model.Student;

public class PersistentStudentDaoImpl implements StudentDao {

	Connection conn;
	String sql;
	PreparedStatement stmt;
	ResultSet rs;
	CallableStatement cstmt;

	public PersistentStudentDaoImpl() {
		conn = ConnectionFactory.getConnection();
	}

	//@Override
	//public boolean addStudent(Student student) {

		/*
		 * sql = "insert into student values(seq_student.nextval,?,?)"; // ? is used for
		 * dynamic entries. try { stmt = conn.prepareStatement(sql); stmt.setString(1,
		 * student.getName()); stmt.setDate(2, Date.valueOf(student.getDateOfBirth()));
		 * // converted java.time.LocalDate(java8) to // java.sql.Date(old) int rec =
		 * stmt.executeUpdate(); if (rec > 0) { return true; } } catch (SQLException e)
		 * { e.printStackTrace(); } return false;
		 */
		// insert student using procedure

		@Override
		public boolean addStudent(Student student) {

		sql = "{call insertStudent(?,?)}";
		int rec;
		try {
			cstmt = conn.prepareCall(sql);
			cstmt.setString(1, student.getName());
			cstmt.setDate(2, Date.valueOf(student.getDateOfBirth())); // converted java.time.LocalDate(java8) to
			// java.sql.Date(old)
			rec=cstmt.executeUpdate();
			
			if(rec>0)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		sql = "update student set name=?, dob=? where id=?";

		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, student.getName());
			stmt.setDate(2, Date.valueOf(student.getDateOfBirth()));
			stmt.setInt(3, student.getId());

			int rec = stmt.executeUpdate();
			if (rec > 0) {
				System.out.println("Record updated successfully");
			} else {
				System.out.println("No record found!!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void removeStudent(int id) {
		sql = "delete student where id=?";

		try {
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);

			int rec = stmt.executeUpdate();
			if (rec > 0) {
				System.out.println("Record removed successfully");
			} else {
				System.out.println("No record found!!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Student findAStudent(int id) {
		sql = "select * from student where id=?";

		try {
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			// int rec = stmt.executeUpdate();
			if (rs.next()) {
				int id1 = rs.getInt(1);
				String name = rs.getString(2);
				Date dob = rs.getDate(3);
				Student st = new Student(id1, name, dob.toLocalDate());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Student> viewAllStudents() {
		List<Student> students = new ArrayList<Student>();
		sql = "select * from student";
		try {
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();

			while (rs.next()) {
				int id1 = rs.getInt(1);
				String name = rs.getString(2);
				Date dob = rs.getDate(3);
				Student st = new Student(id1, name, dob.toLocalDate());
				students.add(st);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return students;
	}

	@Override
	public void enroll(int studentId, int courseId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Set<Entry<Student, Courses>> viewEnrollments() {
		// TODO Auto-generated method stub
		return null;
	}

}
