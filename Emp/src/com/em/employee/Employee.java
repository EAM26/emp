package com.em.employee;

public class Employee {
	
	
	private String firstName;
	private String lastName;
	private String phone_number;
	private String email;
	private String department;
	private double hourly_wage;
	
	public Employee(String firstName, String lastName, String phone_number,
					String email, String department, double hourly_wage) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone_number = phone_number;
		this.email = email;
		this.department = department;
		this.hourly_wage = hourly_wage;
		
		
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

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getHourly_wage() {
		return hourly_wage;
	}

	public void setHourly_wage(double hourly_wage) {
		this.hourly_wage = hourly_wage;
	}
	
	
	

}
