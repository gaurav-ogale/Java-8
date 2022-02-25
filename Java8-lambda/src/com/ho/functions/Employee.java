package com.ho.functions;

public class Employee {

	private String name;
	private String role;

	private String firstname;
	private String lastName;

	public Employee(String name, String role, String firstname, String lastName) {
		super();
		this.name = name;
		this.role = role;
		this.firstname = firstname;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", role=" + role + ", firstname=" + firstname + ", lastName=" + lastName
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
