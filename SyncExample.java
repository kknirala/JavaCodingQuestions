
class Display{
	public synchronized void wish(String name){
		for(int i = 0;i<2;i++){
			System.out.println("Good Morning..");
			try{
				Thread.sleep(3000);
			}catch(Exception e){
			}
			System.out.println(name);
		}
	}
}
class MyThread extends Thread{
	Display d;
	String name;
	public MyThread(Display d, String name) {
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.wish(name);
	}
}
class ThreadImpl implements Runnable{
	public void run(){
		System.out.println("Runnable Run..");
		try {
			for(int i = 0;i<10;i++){
				System.out.println("Lazy Thrad..");
				Thread.sleep(3000);
			}
		} catch (Exception e) {
			System.out.println("Thread interrputed..");
		}
	}
	void test(ThreadImpl threadImpl1){
		System.out.println("test method");
		synchronized(threadImpl1){
			System.out.println("sync method...");
		}
	}
}
public class SyncExample {
	public static void main(String[] args) {
		Display d = new Display();
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setName("nirala");
		System.out.println(Thread.currentThread().getName());
		ThreadImpl threadImpl = new ThreadImpl();
		Thread t = new Thread(threadImpl);
		t.start();
		t.interrupt();
		threadImpl.test(threadImpl);
		ThreadImpl threadImpl1 = new ThreadImpl();
		threadImpl1.test(threadImpl1);
		MyThread t1 = new MyThread(d, "Dhoni");
		MyThread t2 = new MyThread(d, "Goldi");
		t1.setName("kunal");
		t2.setName("kishor");
		t1.start();
		t2.start();
		System.out.println("C.T"+Thread.currentThread().getName());
		System.out.println("T1 name"+t1.getName());
		System.out.println("T2 name"+t2.getName());
	}	
}