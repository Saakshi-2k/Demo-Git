package com.lti.dao;

//import java.time.LocalDate;

//import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
//import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//import java.util.TreeSet;

//import com.lti.model.Student;

public class CollectionsDemo {

	public static void main(String[] args) {
		/*
		 * List: List<Student> students = new ArrayList<Student>();
		 * 
		 * students.add(new Student(1, "John", LocalDate.of(2000, 04, 12)));
		 * students.add(new Student(2, "Mike", LocalDate.of(2001, 05, 13)));
		 * students.add(new Student(3, "Kevin", LocalDate.of(2002, 06, 14)));
		 * students.add(new Student(4, "Peter", LocalDate.of(2003, 07, 15)));
		 * 
		 * Student st = new Student(3, "Kevin", LocalDate.of(2002, 06, 14));
		 * System.out.println(students.indexOf(st));
		 * 
		 * List<Integer> nums = new ArrayList<Integer>(); nums.add(10); nums.add(20);
		 * nums.add(30); nums.add(40);
		 * 
		 * System.out.println(nums.indexOf(70));
		 */

		/*
		 * Set<String> names = new HashSet<String>(); names.add(new String("Henry"));
		 * names.add(new String("Richie")); names.add(new String("John")); names.add(new
		 * String("Bravo")); names.add(new String("Donald")); names.add(null);
		 * 
		 * System.out.println(names);
		 * 
		 * System.out.println(names.contains("Henry"));
		 */

		/*
		 * Set<String> names = new TreeSet<String>(); names.add(new String("Henry"));
		 * names.add(new String("Richie")); names.add(new String("John")); names.add(new
		 * String("Bravo")); names.add(new String("Donald")); names.add(new
		 * String("Bravo")); // names.add(null);
		 * 
		 * System.out.println(names);
		 * 
		 * System.out.println(names.contains("Henry"));
		 * System.out.println(names.remove("Bravo"));
		 */
		// Map:
		Map<Integer, String> credentials = new HashMap<Integer, String>();
		credentials.put(1001, "pass@123");
		credentials.put(1002, "pass@113");
		credentials.put(1003, "pass@121");
		credentials.put(1004, "pass@131");
		credentials.put(1001, "pass@323");
		credentials.put(1005, "pass@123");
		// credentials.put(null, "pass@223");

		System.out.println(credentials);

		// there are two ways we can convert Map into set:1-entrySet() 2.keySet()

		Set<String> names = new HashSet<String>();
		Set<Entry<Integer, String>> entrySet = credentials.entrySet();

		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();

		while (iterator.hasNext()) {
			Map.Entry<Integer, String> items = iterator.next();
			System.out.println(items = iterator.next());
		}

		Iterator<String> allNames = names.iterator();
		while (allNames.hasNext()) {
			String name = allNames.next();
			System.out.println(name);
		}
	}

}
