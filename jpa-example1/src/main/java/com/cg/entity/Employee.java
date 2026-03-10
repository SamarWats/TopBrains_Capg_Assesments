package com.cg.entity;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table(name="emp")
@Inheritance(strategy = InheritanceType.JOINED)
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Employee_type")
public class Employee {

    @Id
    private int empid;

    private String name;

    private LocalDate dob;

    @ManyToOne
    @JoinColumn(name="deptno")
    private Department dept;

    // getters setters
}
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}
}