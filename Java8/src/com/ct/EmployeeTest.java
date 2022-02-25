package com.ct;

import java.util.HashMap;

public class EmployeeTest {
	public static void main(String[] args) {
		HashMap<Employee,String> emloyeeMap = new HashMap<>();
		//Before HashCode and Equals
		emloyeeMap.put(new Employee(1,"Ron",112),"test");
		emloyeeMap.put(new Employee(2,"Ron1",112),"test");
		emloyeeMap.put(new Employee(3,"Ron2",112),"test");
		emloyeeMap.put(new Employee(2,"Ron1",112),"test2");
		
		//OUTPUT - 4 entries
		//{com.ct.Employee@7852e922=test, com.ct.Employee@15db9742=test, com.ct.Employee@6d06d69c=test, com.ct.Employee@4e25154f=test}
		
		System.out.println(emloyeeMap.toString());
		
		//After Equals And Hashcode
		//{com.ct.Employee@1=test, com.ct.Employee@2=test, com.ct.Employee@2=test, com.ct.Employee@3=test}
		
		System.out.println(emloyeeMap.get(new Employee(2,"Ron1",112)));
		
	}

}
