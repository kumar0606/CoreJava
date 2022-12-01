package Com.Has_A_Relation_names;

public class Test {
	public static void main(String[] args) {
		
		Name n=new Name("ravi", "kumar", "kalavala");
		
		Employe e=new Employe(100, "mech",n, 15000.00);
		e.displaydetails();
		}

}
