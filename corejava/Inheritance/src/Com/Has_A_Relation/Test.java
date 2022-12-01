package Com.Has_A_Relation;



public class Test {
	
		public void getbystate(String state) {
		Employee e1=new Employee("101", "ravi", 2000.00);
		Employee e2=new Employee("102", "pawan", 30000.00);
		Employee e3=new Employee("103", "satya", 40000.00);
		Employee e4=new Employee("104", "vv", 5000.00);
		Employee e5=new Employee("105", "mani", 6000.00);
		Address a1=new Address ("nlp", "ap", e1);
		Address a2=new Address ("nlp1", "ap", e2);
		Address a3=new Address("burja", "ts", e3);
		Address a4=new Address ("vavam", "ka", e4);
		Address a5=new Address ("kollivalasa", "tn", e5);
		Address[] add= {a1,a2,a3,a4,a5};
		for(Address A: add) {
			if(A.getState()==state) {
			A.display();
		}
			
		}
		
				

}public static void main(String[] args) {
	Test ab=new Test();
ab.getbystate("ka");

}
}