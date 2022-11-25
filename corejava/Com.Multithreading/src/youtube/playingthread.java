package youtube;

public class playingthread extends Thread {
@Override
public void run() {
	for(int i=1;i<10;i++) {
		System.out.println("playing");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
