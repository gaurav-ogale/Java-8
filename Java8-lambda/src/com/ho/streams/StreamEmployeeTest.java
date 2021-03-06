package com.ho.streams;

import java.util.ArrayList;
import java.util.Comparator;

public class StreamEmployeeTest {

	public static void main(String[] args) {
		EmployeeModel e1 = new EmployeeModel("Sun", 25);
		EmployeeModel e2 = new EmployeeModel("Ron", 15);
		EmployeeModel e3 = new EmployeeModel("Tim", 20);
		EmployeeModel e4 = new EmployeeModel("David", 40);
		EmployeeModel e5 = new EmployeeModel("Sunil", 67);
		EmployeeModel e6 = new EmployeeModel("Roy", 43);

		ArrayList<EmployeeModel> empList = new ArrayList<EmployeeModel>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);

		// Given a list of employees, you need to filter all the employee whose age is
		// greater than 20 and print the employee names
		empList.stream().filter(emp -> emp.getAge() > 20).forEach(emp -> System.out.println("Age > 20 - " + emp.getName()));

		// Given the list of employees, find the employee with name ?Sun?
		empList.stream().filter(emp -> emp.getName().startsWith("Sun"))
				.forEach(emp -> System.out.println("Name : " + emp));

		// Given a list of employee, find maximum age of employee?
		System.out.println("Employee With MAX age - "
				+ empList.stream().max(Comparator.comparingInt(EmployeeModel::getAge)).get().toString());
		System.out.println("Employee With MIN age - "
				+ empList.stream().min(Comparator.comparingInt(EmployeeModel::getAge)).get().toString());
		
		
	}

}
