import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionExp {

	public static void main(String[] args) {
		List<Integer> a1 = new ArrayList<Integer>();
		List<Integer> l1 = new LinkedList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		LinkedList l2 = new LinkedList();
		a2.add(12); a1.add(25);
		l1.add(2); l2.add(21);
		l2.addFirst("df");
		l2.addLast("dfa");
		l2.addFirst("dfb");
		l2.addLast("dfc");
		l2.addFirst("dfr");
		l2.addLast("dft");
		l2.removeLast();
		System.out.println(l2);
		System.out.println(l2.getFirst());
		System.out.println(l2.getLast());
		System.out.println(l2.get(3));
	}
}
