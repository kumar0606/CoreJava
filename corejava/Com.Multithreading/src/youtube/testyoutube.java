package youtube;

public class testyoutube {
public static void main(String[] args) {
	playingthread pt=new playingthread();
	streaming st=new streaming();
	Thread t=new Thread(pt);
	Thread t1=new Thread(st);
	//t.start();
	t1.start();
	pt.start();
	
}
}
