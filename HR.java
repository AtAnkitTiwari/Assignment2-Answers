package com.assignment2.training;

import java.util.List;

public class HR extends Employee {
	public List<Employee> emps;

	public double calculateSalary(Integer id) {
		double sal=0d;
		for(Employee e:emps) {
			if(e.id==id) {
				sal=e.Salary;
			}
		}
		final float hikePercent = 10;
		double newSal = sal + (sal * hikePercent) / 100;
		return newSal;
	}

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}

}
