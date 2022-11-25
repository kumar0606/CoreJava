package Multithreading;

public class demo extends Thread {
@Override
public void run() {
	for(int i=1;i<=10;i++) {
	System.out.println("thread :"+Thread.currentThread().getName());
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}}
public static void main(String[] args) {
	demo d=new demo();
	Thread t=new Thread(d);
	Thread t1=new Thread(d);
	Thread t2=new Thread(d);
	t.setName("marriage fixing");
	t1.setName("cards printing");
	t2.setName("cards distribution");
	t.start(); 
	
	t1.start();
	
	t2.start();
	
//		for(int i=1;i<=10;i++) {
//		System.out.println("marriage :"+Thread.currentThread().getName());
//		try {
//			d.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	//}
}
}
