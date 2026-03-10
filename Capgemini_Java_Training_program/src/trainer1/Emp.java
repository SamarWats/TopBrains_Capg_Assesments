package trainer1;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class Emp {
	public static void filterEmp(List<Emp> emps, Predicate<Emp> p) {
		for(Emp emp: emps) {
			if(p.test(emp)) {
				System.out.println(emp);
			}
		}
		
		public static void main(String[] args) {
				List<Emp> li = new ArrayList<Emp>();
				
				li.add(new Emp("Durga", 34000);
				li.add(new Emp("Amit", 75000);
				li.add(new Emp("Esha", 25000);
				li.add(new Emp("Babli", 84000);
				li.add(new Emp("Sam", 33000);
				
				
				filterEmployee(li, e->e.getSalary()==25000);
		}
	}
}
