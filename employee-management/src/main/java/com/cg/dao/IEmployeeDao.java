package com.cg.dao;

import java.sql.Date;
import java.util.List;

import com.cg.bean.Employee;

public interface IEmployeeDao {
    public String saveEmployee(Employee emp);
    public Employee findEmployee(String empid);
    public List<Employee> getAll();
    public String updateEmployeeName(String empid, String newName);
    public String deleteEmployee(String empid);    
}
