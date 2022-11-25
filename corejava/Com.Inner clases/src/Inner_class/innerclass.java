package Inner_class;

public class innerclass {  //this is outer class
	private class msg{     //this is inner class
		public void print() {// this is inner class method
			System.out.println("iam inner class");
			
		}
	}
	public void displaymsg() {
		//accessing the inner class details
	    // this is other way to creating inner class object
		msg m=new msg();
	m.print();
	}
	
 
	 public static void main(String[] args) {
		 innerclass i=new innerclass();
		//innerclass.msg m=i.new msg(); // this is other way to creating inner class object
		i.displaymsg();
	}
	 }
