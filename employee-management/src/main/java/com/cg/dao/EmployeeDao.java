package com.cg.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.cg.bean.Employee;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EmployeeDao implements IEmployeeDao{
	private static Connection con;
	static {
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Samar@013");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public String saveEmployee(Employee emp) {
		try {
			PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?)");
			ps.setString(1, emp.getEmpid());
			ps.setString(2, emp.getName());
			ps.setString(3, emp.getEmail());
			ps.setString(4, emp.getDob());
			int rows=ps.executeUpdate();
			if(rows>0)
				return "Employee Created";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Employee Not Created";
	}

	@Override
	public Employee findEmployee(String empid) {
	    try {
	        PreparedStatement ps = con.prepareStatement(
	                "select * from employee where empid=?");
	        ps.setString(1, empid);

	        ResultSet rs = ps.executeQuery();

	        if (rs.next()) {
	            Employee emp = new Employee(
	                    rs.getString("name"),
	                    rs.getString("email"),
	                    rs.getString("dob"));
	            emp.setEmpid(rs.getString("empid"));
	            return emp;
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return null;
	}


	@Override
	public List<Employee> getAll() {
	    List<Employee> list = new ArrayList<>();
	    try {
	        PreparedStatement ps = con.prepareStatement("select * from employee");
	        ResultSet rs = ps.executeQuery();

	        while (rs.next()) {
	            Employee emp = new Employee(
	                    rs.getString("name"),
	                    rs.getString("email"),
	                    rs.getString("dob"));
	            emp.setEmpid(rs.getString("empid"));
	            list.add(emp);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return list;
	}


	@Override
	public String updateEmployeeName(String empid, String newName) {
	    try {
	        PreparedStatement ps = con.prepareStatement(
	                "update employee set name=? where empid=?");
	        ps.setString(1, newName);
	        ps.setString(2, empid);

	        int rows = ps.executeUpdate();

	        if (rows > 0)
	            return "Employee Updated";
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return "Employee Not Updated";
	}

	@Override
	public String deleteEmployee(String empid) {
	    try {
	        PreparedStatement ps = con.prepareStatement(
	                "delete from employee where empid=?");
	        ps.setString(1, empid);

	        int rows = ps.executeUpdate();

	        if (rows > 0)
	            return "Employee Deleted";
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return "Employee Not Deleted";
	}

}
