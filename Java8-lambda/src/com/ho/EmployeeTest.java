package com.ho;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee("Ron", 1);
		Employee e2 = new Employee("Sam", 1);
		Employee e3 = new Employee("Abhi", 1);
		Employee e4 = new Employee("Jay", 1);
		
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		
		System.out.println(empList.toString());
		
		Collections.sort(empList, (emp1,emp2)->emp1.empName.compareTo(emp2.empName));
		
		System.out.println(empList.toString());
	}

}
