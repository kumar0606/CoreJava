package Multithreading;

public class Threademo extends Thread{

	@Override
	public void run() {
		System.out.println("it is multithreading controlled by jvm");
		super.run();
	}
public static void main(String[] args) {
	Threademo td=new Threademo();
	 //Thread t=new  Thread(td);
	 td.start();
}
}
