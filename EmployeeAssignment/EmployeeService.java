package EmployeeAssignment;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeService {
	private List<Employee> employees = EmployeeRepo.getEmployees();
	
	// it calculates the average salary of the employee
	public double getAverageSalary() {
        return employees.stream().collect(Collectors.averagingDouble(Employee::getSalary));
    }
	

	//it finds the employee with the highest salary in each department
	public Map<String, Optional<Employee>> getMaxSalaryByDepartment() {
        return employees.stream().filter(e -> e.getDepartment() != null)
                .collect(Collectors.groupingBy(e -> e.getDepartment().getDepartmentName(),
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
                        ));
    }
	
	
	public Map<String, Double> getTotalSalaryByDepartment() {
        return employees.stream()
                .filter(e -> e.getDepartment() != null)
                .collect(Collectors.groupingBy(
                        e -> e.getDepartment().getDepartmentName(),
                        Collectors.summingDouble(Employee::getSalary)
                ));
    }

    public List<String> getEmployeeNameAndSalary() {
        return employees.stream()
                .map(e -> e.getFirstName() + " " + e.getLastName() + " - " + e.getSalary())
                .collect(Collectors.toList());
    }


    public List<Employee> getEmployeesSortedBySalaryDesc() {
        return employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .collect(Collectors.toList());
    }
}
