package com.ho.streams;

public class EmployeeModel {

	private String name;
	private int age;
	private String firstName;
	private String lastName;
	private int salary;

	public EmployeeModel(String name, int age, String firstName, String lastName, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public EmployeeModel(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeModel [name=" + name + ", age=" + age + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", salary=" + salary + "]";
	}

}
