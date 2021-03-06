package com.ho.functions;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee("E1", "ADMIN", "Gaurav", "test");
		Employee emp2 = new Employee("E2", "TESTER", "Rahul", "test");
		Employee emp3 = new Employee("E3", "ADMIN", "Raj", "test");
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);

		Consumer<Employee> empCon = emp -> {
			System.out.printf("Employee Name-%s, Employee Role-%s ", emp.getName(), emp.getRole());
		};
		empList.forEach(emp -> empCon.accept(emp));
	}
}
