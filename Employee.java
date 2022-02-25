package com.assignment2.training;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
	public String name;
	public String add;
	public double Salary;
	public int id;

	public Employee() {
		super();

	}

	public Employee(String name, String add, double salary, int id) {
		
		this.name = name;
		this.add = add;
		Salary = salary;
		this.id = id;
	}

	public static void main(String[] args) {
		Employee CEO = new Employee("Emauel", "Kolkata", 150000, 101);
		Employee ProjectManager = new Employee("Jhon", "Mumbai", 35000, 201);
		Employee TeamLeader = new Employee("Joe", "Delhi", 25000, 301);
		HR hr = new HR();
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(CEO);
		emp.add(ProjectManager);
		emp.add(TeamLeader);
		hr.setEmps(emp);
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter Emp id to  check for Employee details:");
		int id=sc.nextInt();
		for(Employee e:emp) {
			if(e.id==id) {
				System.out.println("Emp Name:"+e.name);
				System.out.println("Old Salary:"+e.Salary);
				System.out.println("location:"+e.add);
				System.out.println("new Salary:"+hr.calculateSalary(id));
				
			}
		}
		
		
		
		

	}

}
