
public class ChildParentC extends ChildParentP{

	public Integer show(int i){
		System.out.println("child");
		return 1;
	}
	public static void main(String[] args) {
		ChildParentC c = new ChildParentC();
		c.show(22);
	}
}
