package Exception_propagation;

public class propagation {
	
		
		public void m1() {
			
			System.out.println("this is method m1");
	}
	
	public void m2() {
//	m1();
		System.out.println("this is method m3");
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(c);
		
		
	}
	public void m3() {
		System.out.println("this is method m2");
		m1();
         m2();
		
	}
	public static void main(String[] args) {
		propagation p=new propagation();
		try {
		p.m3();
		}
		catch(ArithmeticException a) {
			a.printStackTrace();
		}
		System.out.println("ravi kuamr");
	}
	

}
