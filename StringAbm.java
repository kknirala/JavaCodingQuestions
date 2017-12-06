
public class StringAbm {


	public void append(Float i){
		System.out.println(i+"=Integer");
	}
	public void append(Double i){
		System.out.println(i+"=Integer");
	}
/*	public void append(long snb){
		System.out.println(snb+"=stringbufer");
	}
	public void append(float snb){
		System.out.println(snb+"=stringbufer");
	}
	public void append(double snb){
		System.out.println(snb+"=stringbufer");
	}*/
	public static void main(String[] args) {
		StringAbm s = new StringAbm();
		s.append(0.0f);
	}
}
