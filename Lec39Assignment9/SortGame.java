package Lec39Assignment9;
import java.util.*;
public class SortGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int ne     = sc.nextInt();
		ArrayList<Employee> al = new ArrayList<>();
		while(ne-->0) {
			String name = sc.next();
			int sal     = sc.nextInt();
			if(sal>=n)
			al.add(new Employee(name,sal));
		}
		Collections.sort(al,new EmployeeSort());
		for(Employee e:al) {
			System.out.println(e);
		}
	}

}

class Employee{
	Integer salary;
	String name;
	Employee(String name,Integer salary){
		this.salary = salary;
		this.name   = name;
	}
	public String toString() {
		
		return this.name+" "+this.salary;
	}
}
class EmployeeSort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.salary==o2.salary) {
			return o1.name.compareTo(o2.name);
		}
		
		return o2.salary.compareTo(o1.salary);
	}
	
}