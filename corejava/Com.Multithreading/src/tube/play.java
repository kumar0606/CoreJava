package tube;



public class play extends Thread {
@Override
public void run() {
	for(int i=1;i<=5;i++) {
		System.out.println("seetharamam:"+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}}


