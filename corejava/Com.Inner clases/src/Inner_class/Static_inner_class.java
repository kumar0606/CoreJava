package Inner_class;

public class Static_inner_class { //this is outer class
	static int id;
	static	String name;
		

	
	

	
	static class B{
		String branch="mech";;

		@Override
		public String toString() {
			return " [branch=" + branch + "]";
		}
		
	}
	public static void main(String[] args) {
		 
		Static_inner_class.id=10;
		Static_inner_class.name="ravi";
		System.out.println(Static_inner_class.id+" "+name);
		Static_inner_class.B a=new Static_inner_class.B(); //this is Static inner class object creation 
		
		System.out.println(Static_inner_class.id+" "+name+a.toString());
	}

}
