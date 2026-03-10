package com.cg.main;

import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class MyConnection {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// forname method is a static method for class. It is used to load a class sin
			// runtime.
			System.out.println("Driver Class Loaded...");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Samar@013");
			// DriverManager.getConnection("url", "UserName", "Password");
			System.out.println("Connected..");

			Statement stat = con.createStatement();
//			ResultSet rs = stat.executeQuery("select * from employee");
//			// rs.next(); //pointer to the next row.
			
//			// if i read the all rows.//
//			while (rs.next()) {
//				// System.out.println(rs.getString(2));
//				// we can get from the column name also
//				System.out.println(rs.getString("emp_name") + "\t" + rs.getDouble("salary"));
//
//			}

			//i want to read data from emp_id		
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter Employee Id");
//			int e_id = sc.nextInt();
//			ResultSet rs = stat.executeQuery("select * from employee where emp_id = " +e_id); 
			
//			PreparedStatement ps = con.prepareStatement("select * from employee where emp_name = ? and salary = ?");
//			ps.setString(1, "Priya Verma");
//			ps.setDouble(2, 4500);
//			ResultSet rs = ps.executeQuery();			
//			
//		    if(rs.next())
//		    	System.out.println(rs.getString("emp_name") + "\t" + rs.getDouble("salary"));
//		    else
//		    	System.out.println("Employee Not Found");
			
			//HOW WE CREATE THE DATA, this code is not in the real database
			
//			PreparedStatement ps = con.prepareStatement("insert into employee values(?, ?, ?, ?, ?)");
//			// ? denote 1, 2, 3, 4, 5 column
//			ps.setInt(1, 11);
//			ps.setString(2, "Mansi");
//			ps.setString(3, "SoftwareDeveloper");
//			ps.setDouble(4, 500000);
//			ps.setString(5, "mansi@gmail.com");
//			int rows = ps.executeUpdate();
//			if(rows>0)
//				System.out.println("Employee Added..");
			
			
          // NOW I WANT TO DELETE THE DATA FROM EMPLOYEE ID
//		    Scanner sc = new Scanner(System.in);
//            System.out.println("Enter Employee Id to Delete:");
//            int e_id = sc.nextInt();
//
//            String query = "DELETE FROM employee WHERE emp_id = ?";
//            PreparedStatement ps = con.prepareStatement(query);
//
//            ps.setInt(1, e_id); 
//            int rows = ps.executeUpdate();
//
//            if (rows > 0) {
//                System.out.println("Employee Deleted...!");
//            } else {
//                System.out.println("Employee Not Found!");
//            }
            
            //NOW I WANT TO UPDATE THE DATA FROM EMPLOYEE TABLE
			 Scanner sc = new Scanner(System.in);

	            System.out.println("Enter Employee ID to Update:");
	            int e_id = sc.nextInt();
	            
	            System.out.println("Enter Salary : ");
	            double sal = sc.nextDouble();
	   
	            String query = "UPDATE employee SET salary = ? WHERE emp_id = ?";
	            PreparedStatement ps = con.prepareStatement(query);

	            ps.setDouble(1, sal); 
	            ps.setInt(2, e_id);        

	            int rows = ps.executeUpdate();

	            if (rows > 0) {
	                System.out.println("Employee Updated Successfully!");
	            } else {
	                System.out.println("Employee Not Found!");
	            }


			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			
		}
	}
}