package com.demo.Assignment1_Modified;

import java.util.Scanner;

public abstract class Employee {
	private String name;
	private int age;
	private int salary;
	private String designation;
	public Employee(int salary, String designation) {
		this.salary = salary;
		this.designation = designation;
		this.getDetails();
	}
	
	public void getDetails()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name:");
		this.name = scan.next();
		System.out.println("Enter age:");
		this.age = scan.nextInt();
		
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", designation=" + designation + "]";
	}
	
	public void raiseSalary()
	{
		System.out.println("Enter amount of salary to be raised "+this.name+":");
		int amt= new Scanner(System.in).nextInt();
		this.salary+=amt;
	}
}
