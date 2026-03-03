package com.cg.main;

import java.util.List;
import java.util.Scanner;

import com.cg.dao.EmployeeDao;
import com.cg.entity.Employee;

public class EmployeeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeDao dao = new EmployeeDao();

        while (true) {

            System.out.println("\n1. Add Employee");
            System.out.println("2. View Employee By ID");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Display All Employees");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter DOB: ");
                    String dob = sc.nextLine();

                    Employee emp = new Employee(name, email, dob);
                    dao.addEmployee(emp);
                    System.out.println("Employee Added!");
                    break;

                case 2:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    Employee e = dao.getEmployee(id);

                    if (e != null) {
                        System.out.println(e.getEmpid() + " " + e.getName() + " " + e.getEmail() + " " + e.getDob());
                    } else {
                        System.out.println("Employee Not Found");
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();

                    Employee updateEmp = dao.getEmployee(uid);

                    if (updateEmp != null) {
                        System.out.print("Enter New Name: ");
                        updateEmp.setName(sc.nextLine());

                        System.out.print("Enter New Email: ");
                        updateEmp.setEmail(sc.nextLine());

                        System.out.print("Enter New DOB: ");
                        updateEmp.setDob(sc.nextLine());

                        dao.updateEmployee(updateEmp);
                        System.out.println("Employee Updated!");
                    } else {
                        System.out.println("Employee Not Found");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID to delete: ");
                    int did = sc.nextInt();
                    dao.deleteEmployee(did);
                    System.out.println("Employee Deleted!");
                    break;

                case 5:
                    List<Employee> list = dao.getAllEmployees();
                    for (Employee empObj : list) {
                        System.out.println(empObj.getEmpid() + " " +
                                empObj.getName() + " " +
                                empObj.getEmail() + " " +
                                empObj.getDob());
                    }
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}