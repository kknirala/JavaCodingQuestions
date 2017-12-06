import java.time.temporal.WeekFields;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class mapExample {

	public static void main(String[] args) {
		// HashMap : Duplicate key is not allowed, but value can be duplicated. insertion order not preserved.
		HashMap<String, Integer> smap1 = new HashMap<String, Integer>();
		for(int i = 0;i<10;i++){
			smap1.put("d"+i, i);
		}
		Iterator iter = smap1.keySet().iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		Set s1 = smap1.entrySet();
		Iterator itr = s1.iterator();
		while(itr.hasNext()){
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println(m1.getKey() +"---->"+ m1.getValue());
		}
		System.out.println("HashMap: "+smap1.keySet()+" :"+smap1);
		// Linked hashMap: Insertion Order is preserved.
		LinkedHashMap<String, Integer> lmap1 = new LinkedHashMap<String, Integer>();
		for(int i = 0;i<10;i++){
			lmap1.put("d"+i, i);
		}
		System.out.println("LinkedHashMap: "+lmap1);
		// Sorted Map: Maintain sorting order ,based on key, not value.
		SortedMap<String, Integer> sortedMap = new TreeMap<String, Integer>();
		for(int i = 0;i<10;i++){
			sortedMap.put("d"+i, i);
		}
		System.out.println("SortedMap: "+sortedMap);
		System.out.println("SortedMap: First Key "+sortedMap.firstKey());
		System.out.println("SortedMap: Last Key "+sortedMap.lastKey());
		System.out.println("SortedMap: Head Map "+sortedMap.headMap("d3"));
		System.out.println("SortedMap: Tail Map "+sortedMap.tailMap("d4"));
		System.out.println("SortedMap: Sub Map "+sortedMap.subMap("d2", "d6"));
		// WeekHashmap
		WeakHashMap<String, Integer> weakHashMap = new WeakHashMap<>();
		for(int i = 0;i<10;i++){
			weakHashMap.put("d"+i, i);
		}
		System.out.println("WeakHashMap: "+weakHashMap);
		// IdentityHashMap
		IdentityHashMap<String, Integer> identityHashMap = new IdentityHashMap<>();
		for(int i = 0;i<10;i++){
			identityHashMap.put("d"+i, i);
		}
		System.out.println("IdentityHashMap: "+identityHashMap);
		
		// Tree Map: Underlay D.S is Red-Black Tree, all entries is inserted according to some sorting order.
		TreeMap<String, Integer> tmap = new TreeMap<>(new MyComprator2());
		tmap.put("d"+1, 1);
		for(int i = 2;i<10;i++){
			tmap.put("d"+i, i);
		}
		tmap.put("d"+0, 0);
		System.out.println("TreeMap: "+tmap);
		
		// HashTable: 
		Hashtable<String, Integer> hashtable = new Hashtable<String, Integer>();
		for(int i = 0;i<10;i++){
			hashtable.put("d"+i, i);
		}
		System.out.println("Hashtable: "+hashtable);
		
	}
}
class MyComprator2 implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		String str1 = arg0.toString();
		String str2 = arg1.toString();
		return str1.compareTo(str2);
	}
}