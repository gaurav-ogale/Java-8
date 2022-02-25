package com.ho.functions;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeePredicateTest {
	public static void main(String[] args) {
		Predicate<Employee> checkRole = emp -> (emp.getRole().equals("ADMIN"));

		Employee emp1 = new Employee("E1", "ADMIN","test","test");
		Employee emp2 = new Employee("E2", "TESTER","test","test");
		Employee emp3 = new Employee("E3", "ADMIN","test","test");

		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		// Get All Admin Employees

		empList.forEach(emp -> {
			if (checkRole.test(emp))
				System.out.println(emp.getName());
		});
	}
}
