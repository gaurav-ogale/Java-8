package com.ho.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsAssignments {

	public static void main(String[] args) {
		List<EmployeeModel> empList = new ArrayList<EmployeeModel>();
		empList.add(new EmployeeModel("Test", 11, "Ron", "Clark", 100000));
		empList.add(new EmployeeModel("Test", 12, "Ronny", "Clark", 76667));
		empList.add(new EmployeeModel("Test", 13, "Johnny", "Smith", 40000));
		empList.add(new EmployeeModel("Test", 14, "David", "Clark", 25000));

		// Given a list of employees,Convert firstName and LastName to uppercase and Join them with comma
		List<String> empFullNames = empList.parallelStream().map(emp -> emp.getFirstName() + "," + emp.getLastName())
				.collect(Collectors.toList());
		empFullNames.forEach(str -> System.out.println(str));

		// Given a String, find the first repeated character in it using Stream functions
		empList.parallelStream().map(emp -> {
			HashSet<Character> charSet = new HashSet<>();
			char repeatChar = 0;
			char[] str = emp.getFirstName().toCharArray();
			for (Character ch : str) {
				if (!charSet.contains(ch))
					charSet.add(ch);
				else {
					repeatChar = ch;
					break;
				}
			}
			return repeatChar;
		}).forEach(str -> System.out.println(str));

		// Create a List of the square of all distinct numbers
		int[] nums = { 3, 3, 4, 5, 6, 4, 5, 8 };
		IntStream.of(nums).distinct().map(num -> num * num).forEach(num -> System.out.println(num));

		// Given a list of employees,Get count, min, max, sum, and the average for salary
		System.out.println(empList.stream().max(Comparator.comparingInt(EmployeeModel::getSalary)).get());
		System.out.println(empList.stream().min(Comparator.comparingInt(EmployeeModel::getSalary)).get());
		int sumOfSalary = empList.stream().mapToInt(emp -> emp.getSalary()).sum();
		System.out.println(sumOfSalary);
		OptionalDouble avg = empList.stream().mapToInt(emp -> emp.getSalary()).average();
		System.out.println(avg.toString());

	}

}
