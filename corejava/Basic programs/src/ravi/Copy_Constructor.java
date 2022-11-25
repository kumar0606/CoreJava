package ravi;

public class Copy_Constructor {
int id; 
String name;
public Copy_Constructor(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
Copy_Constructor(Copy_Constructor r){
	id=r.id;
	name=r.name;		
}
 void display(){
	System.out.println("id :"+id+" name :"+name);
	//System.out.println("name :"+name);
}
 public static void main(String[] args) {
	 Copy_Constructor ct=new Copy_Constructor(12,"ravi");
	 Copy_Constructor ct1=new Copy_Constructor(ct);
//	 ct1.id=33;
//	 ct1.name="kumar";
	 ct.display();
	 ct1.display();
}
}
