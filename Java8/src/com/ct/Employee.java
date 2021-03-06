package com.ct;

public class Employee {

	private int id;
	private String name;
	private int salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
            return true;
          
        if(obj == null || obj.getClass()!= this.getClass())
            return false;

        
        Employee emp = (Employee) obj;

        return (emp.name.equals(this.name)  && emp.id == this.id);
    
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id;
		}

}
