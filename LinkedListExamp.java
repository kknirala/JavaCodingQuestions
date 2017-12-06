import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExamp {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("kunal");
		ll.add("kishor");
		ll.add("nirala");
		ll.add("kunak3");
		ll.add("nirala");
		Iterator<String> itr = ll.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		LinkedList<EmpDetails> ed = new LinkedList<EmpDetails>();
		EmpDetails e1 = new EmpDetails(124, "Lakhmani", 875458855);
		EmpDetails e2 = new EmpDetails(157, "Kanchu", 542147854);
		ed.add(e1);
		ed.add(e2);
		Iterator<EmpDetails> ite = ed.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
	}
	
}
