package com.cg.entity;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("per-Employee")
public class PEmployee extends Employee{
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
