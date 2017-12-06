class Syn{
	String message;
	Syn(String message){
		this.message=message;
	}	
}
class Test1 implements Runnable{
    Syn syn;
	Test1(Syn syn){
		this.syn=syn;
	}
	@Override
	public void run() {
		test(syn);
	}
	void print(){
		System.out.println("djhh");
	}
	 void test(Syn syn){
		System.out.println("test out of sync..");
		synchronized (syn) {
			for(int i=0;i<100;i++){
				System.out.println(i+" ="+Thread.currentThread().getName()+" "+syn.message);
			}
		}
	}
}
public class SynchTest {	
	public static void main(String[] args) {
		Syn syn=new Syn("nirala fatu");
		Test1 test1=new Test1(syn);
		Thread t1=new Thread(test1);
		Thread t2=new Thread(test1);
		t1.setName("nirala gandu");
		t1.setPriority(5);
		
		test1.print();
		t2.setName("abhishek ladchat");
		t2.setPriority(10);
		t1.start();
		t2.start();
	}
}
