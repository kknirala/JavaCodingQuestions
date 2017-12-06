import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExmp {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("kunal");
		list.add("kishor");
		list.add("nirala");
		list.add("kishor");
		list.add("nirala");
		list.add("kunalk30");
		ArrayList<String> al = new ArrayList<String>();
		al.addAll(list);
		System.out.println(list.lastIndexOf("nirala"));
		ListIterator<String> itr = list.listIterator();
		while(itr.hasNext()){
			
			System.out.println(itr.next());
			list.remove("kunal");
		}
		System.out.println();
		list.clear();
		Iterator<String> itr1 = al.iterator();
		System.out.println("java "+ list.size());
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
		
		ArrayList<EmpDetails> ed = new ArrayList<EmpDetails>();
		EmpDetails ep = new EmpDetails(450, "kunal", 814778592);
		EmpDetails ep1 = new EmpDetails(451, "Dhokewaz Goldi", 814778332);
		EmpDetails ep2 = new EmpDetails(452, "Masum Kanchan Bhabhi", 814774492);
		ed.add(ep1);
		ed.add(ep2);
		ed.add(ep);
		Iterator<EmpDetails> itr3 = ed.iterator();
		while(itr3.hasNext()){
			System.out.println(itr3.next().toString());
		}
	}
}
