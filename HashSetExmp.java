import java.util.HashSet;
import java.util.Iterator;

public class HashSetExmp {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("kunal");
		hs.add("Kishor");
		hs.add("nirala");
		hs.add("kunal");
		hs.add("kunalk30");
		HashSet<String> hs1 = new HashSet<String>();
		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("kunal");
		hs2.add("Kishor");
		hs2.add("nirala");
		hs1.addAll(hs);
		System.out.println(hs1.size());
		//hs1.clear();
		System.out.println(hs1.contains(hs2));
		hs1.removeAll(hs2);
		Iterator<String> itr = hs1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
