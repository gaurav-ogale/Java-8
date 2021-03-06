package com.ho.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.ho.functions.Employee;

public class StreamExample {

	public static void main(String[] args) {
		Employee emp1 = new Employee("E1", "ADMIN", "Gaurav", "test");
		Employee emp2 = new Employee("E2", "TESTER", "Rahul", "test");
		Employee emp3 = new Employee("E3", "ADMIN", "Raj", "test");

		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);

		List<Employee> s1 = empList.stream().filter((emp) -> emp.getRole().equalsIgnoreCase("TESTER"))
				.collect(Collectors.toList());
		empList.stream().map((emp) -> {
			if (!emp.getRole().equalsIgnoreCase("ADMIN")) {
				return null;
			}
			return emp;
		}).filter(emp -> emp != null).forEach(System.out::println);
		System.out.println(s1.toString());
	}

}
