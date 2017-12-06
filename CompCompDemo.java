import java.util.Comparator;
import java.util.TreeSet;

class Employee1 implements Comparable{
	int eid;
	Employee1(int eid){
		this.eid = eid;
	}
	public String toString(){
		return "E-" +eid;
	}
	public int compareTo(Object obj){
		int eid1 = this.eid;
		Employee1 e2 = (Employee1)obj;
		int eid2 = e2.eid;
		if(eid1>eid2){
			return -1;
		}
		else if(eid1<eid2){
			return 1;
		}
		else
			return 0;
	}
}
public class CompCompDemo {
	public static void main(String[] args) {
		Employee1 e1 = new Employee1(12);
		Employee1 e2 = new Employee1(14);
		Employee1 e3 = new Employee1(15);
		Employee1 e4 = new Employee1(16);
		Employee1 e5 = new Employee1(17);
		Employee1 e6 = new Employee1(18);
		TreeSet t1 = new TreeSet();
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		System.out.println(t1);
		TreeSet t11 = new TreeSet(new MyComprator1());
		t11.add(e1);
		t11.add(e2);
		t11.add(e3);
		t11.add(e4);
		t11.add(e5);
		System.out.println(t1);
	}
}
class MyComprator1 implements Comparator{
	public int compare(Object obj1, Object obj2){
		Employee1 e1 = (Employee1)obj1;
		Employee1 e2 = (Employee1)obj1;
		return e1.compareTo(e2);
	}
}
