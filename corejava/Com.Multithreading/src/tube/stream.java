package tube;

public class stream extends Thread {
@Override
public void run() {
	for (int i=1;i<=5;i++) {
		System.out.println("karthikeya:"+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
