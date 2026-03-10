//package Trainer3;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class setDemo {
//	public static void main(String[] args) {
////		Set<Employee> s = new HashSet<Employee>();
//		Set s = new HashSet();
//		s.add(new Employee("Samar"));
//		s.add(new Employee("Sam"));
//		s.add(new Employee("Samar"));
//		s.add(new Employee("Sam"));
//		
//		System.out.println(s.size());
//	}
//}

package trainer1;
import java.util.*;
public class setDemo {
	public static void main(String[] arg) {
//		Employee e=new Employee("shreshtha");
//		Employee e1=new Employee("shreshtha");
//		
//		System.out.println(e);
//		System.out.println(e1);
//		
//		String s=new String("aaaa");
//		System.out.println(e.equals(s));
		Set<Employee>s=new HashSet<Employee>();
		s.add(new Employee("Amit"));
		s.add(new Employee("Sam"));
		s.add(new Employee("Amit"));
	}
}