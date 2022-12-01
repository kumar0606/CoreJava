package Book_has_a_relation;

public class bookApp {
	public void getbygender(String gender) {
		Author a=new Author("ravi kumar", "ravi.@gmail.com", "male", 23);
		Author b= new Author("pawan", "pawan@gmail.com", "male", 17);
		Author c=new Author("satya", "satya@gmail.com", "female", 21);
		book a1=new book("mechatronics", 300, 3, a);
		book b1=new book("robotics", 200, 2, a);
		book c1=new book("metralogy", 400, 4, a);
		
		Author aa[]= {a,b,c};
		for(Author A:aa) {
			if(A.getGender()==gender) {
				//System.out.println(".............");
				A.display();
				System.out.println("..................");
			}else {
				System.out.println("book is not available");
				break;
			}
		
	
	}}
		
public static void main(String[] args) {
	bookApp app=new bookApp();
	
	app.getbygender("smale");
}
}
