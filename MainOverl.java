
public class MainOverl {
	/*public static void main(String args[]){
		System.out.println("main method string..");
	}
	public static void main(int args[]){
		System.out.println("main method int..");
	}*/
	void setName(String name){
		this.name= name;
	}
	String getName(){
		return name;
	}
	String name;
	public void examp(int i){
		System.out.println("parent");
	}
	static{
		System.out.println("Static block");
		System.exit(0);
	}
}
/*class MainOver2 extends MainOverl{

	public void examp(){
		System.out.println("child:  public static void main(String args)");
	}
	public static void main(String arg[]){
		MainOverl ma = new MainOverl();
		MainOver2 maa = new MainOver2();
		ma.setName("kunal");
		System.out.println(ma.getName());
		maa.examp(
				 );
	}
}
*/