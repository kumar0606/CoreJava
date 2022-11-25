package Inner_class;

public class Method_local_inner_class { //this is outer class
	int marks=30;
	int percentage=60;
	public void demo() { // this is outer class method 
 class inner{
	public void data() { // this is inner class method
		System.out.println("ravi marks"+marks+":percentage"+ percentage );
//		inner i=new inner();
//		i.data();
	}}
 inner i=new inner();
	i.data();
	
	
 }
	public static void main(String[] args) {
		Method_local_inner_class ob=new Method_local_inner_class(); // this is outer classs object creation
		//ob.demo(); //this is inner class object creation by using outer class method name 
		ob.demo();
	}
		
}
