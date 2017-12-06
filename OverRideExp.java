interface itf{
	void m1();
}
public class OverRideExp {
	public static void P(){
		System.out.println("Hi Goldi..");
	}
	protected void p1(){
		System.out.println("p1");
	}
	public static void main(String[] args) {
		OverRideExp o = new B();
		
			o.P();
		
		o.p1();
	}
}
/*abstract class A extends OverRideExp{
	abstract public void P();
}*/
class B extends OverRideExp implements itf{
	public void m1(){
		System.out.println("m1");
	}
	public static void P() throws NullPointerException{
		System.out.println("Hi Goldi !");
	}
	public void p1(){
		System.out.println("p1 child.");
	}
}