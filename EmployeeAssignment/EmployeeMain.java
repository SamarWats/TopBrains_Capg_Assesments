package EmployeeAssignment;

public class EmployeeMain {
	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();

        System.out.println("Average Salary: " + service.getAverageSalary());

        System.out.println("\nMax Salary By Department:");
        service.getMaxSalaryByDepartment()
                .forEach((dept, emp) -> 
                        System.out.println(dept + " -> " + emp.get().getFirstName()));

        System.out.println("\nTotal Salary By Department:");
        service.getTotalSalaryByDepartment()
                .forEach((dept, total) -> 
                        System.out.println(dept + " -> " + total));

        System.out.println("\nEmployee Name and Salary:");
        service.getEmployeeNameAndSalary()
                .forEach(System.out::println);

        System.out.println("\nSorted By Salary Desc:");
        service.getEmployeesSortedBySalaryDesc()
                .forEach(e -> System.out.println(e.getFirstName() + " " + e.getSalary()));
    }

}
