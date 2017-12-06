import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setEmpno(10);
		e1.setEname("kunal");
		Employee e2=new Employee();
		e2.setEmpno(10);
		e2.setEname("kunal");
	    Set<Employee> set=new HashSet<>();
		set.add(e1);
		set.add(e2);
		System.out.println(set);
		
/*		Set<Integer> set=new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(10);
		set.add(30);
		set.add(40);
		System.out.println(set);*/
		
		
	}
}
