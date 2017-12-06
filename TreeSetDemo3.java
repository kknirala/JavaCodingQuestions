import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComprator());
		t.add("hkdf");
		t.add("kunal");
		t.add("abhisk");
		t.add(new StringBuffer("goldi"));
		t.add(new StringBuffer("lakhmani"));
		System.out.println(t);
	}
}
class MyComprator implements Comparator {
	public int compare(Object obj1, Object obj2){
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		int l1 = s1.length();
		int l2 = s2.length();
		if(l1>l2){
			return +1;
		}
		else if(l1<l2){
			return -1;
		}
		else{
			return -s1.compareTo(s2);
		}
			
	/*	String i1 = (String)obj1;
		String i2 = (String)obj2;
		return i1.compareTo(i2);*/
	}
}