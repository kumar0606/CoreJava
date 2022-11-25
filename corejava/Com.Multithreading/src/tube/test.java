package tube;

public class test {
public static void main(String[] args) {
	play p=new play();
	stream s=new stream();
//	Thread t=new Thread(p);
//	Thread t1=new Thread(p);
//	Thread t2=new Thread(s);
//	Thread t3=new Thread(s);
//	t.setName("director ravi");
//	t1.setName("director kumar");
//	t2.setName("direcor anil");
//	t3.setName("director madhav");
//	t.start();
//	t1.start();
//	t2.start();
//	t3.start();
	p.setName("director ravi");
	p.setName("director kumar");
	p.setName("director cva");
	s.setName("director kunal");
	s.setName("director abhi");
	s.setName("director ramana");
	p.start();
	p.start();
	p.start();
	s.start();
	s.start();
	s.start();
}
}
