package EmployeeAssignment;

public class EmployeesMain {
	public static void main(String[] args) {
		EmployeeService emp = new EmployeeService();
		
		System.out.println("Average Salary of the Employees are: " + emp.getAverageSalary());
		
		System.out.println("\n Max. Salary  by Department: ");
		emp.getMaxSalaryByDepartment().forEach((dept, employee) -> System.out.println(dept + " -> " + employee.get().getFirstName()));
	
		
		System.out.println("\n Total Salary By Department: ");
		emp.getTotalSalaryByDepartment().forEach((dept, total)-> System.out.println(dept + "->" + total));
		
		System.out.println("\n Employee Name And Salary: ");
		emp.getEmployeeNameAndSalary().forEach(System.out::println);
		
		System.out.println("\n Employees Sorted By Salary Desc: ");
		emp.getEmployeesSortedBySalaryDesc().forEach(e-> System.out.println(e.getFirstName() +" " + e.getSalary()));
	}
}
