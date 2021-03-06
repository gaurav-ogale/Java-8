package com.ho.functions;

import java.util.ArrayList;
import java.util.function.Function;

public class EmployeeFunctionTest {

	public static void main(String[] args) {
		Function<Employee, String> getNames = emp -> emp.getFirstname();
		Function<Employee, String> getAdmins = emp -> emp.getRole();

		Employee emp1 = new Employee("E1", "ADMIN", "Gaurav", "test");
		Employee emp2 = new Employee("E2", "TESTER", "Rahul", "test");
		Employee emp3 = new Employee("E3", "ADMIN", "Raj", "test");

		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);

		empList.forEach(emp -> {
			System.out.println(getNames.apply(emp));
		});
	}

}
