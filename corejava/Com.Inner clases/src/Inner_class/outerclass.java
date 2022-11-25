package Inner_class;

public class outerclass {
	 private String id;
	private String name;
	private static int marks=100;
	
	public outerclass(String id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks=marks;
	}
	
	

	@Override
	public String toString() {
		return "outerclass [id=" + id + ", name=" + name + ", marks=" +marks+"]";
	}



	static class inner{   // this is inner class
		 private int leaves;
		 private int workingdays;

	

		public inner(int leaves, int workingdays) {
			super();
			this.leaves = leaves;
			this.workingdays = workingdays;
		}



		@Override
		public String toString() {
			return "inner [leaves=" + leaves + ", workingdays=" + workingdays + "]";
		}

		
		
		
	}
	public static void main(String[] args) {
//		//this is normal class object creation
	outerclass o=new outerclass("326","ravi", marks);
	
		System.out.println(o);
	
//		//this is inner class object creation
	outerclass.inner in=new inner(6,23);
		System.out.println(in);
	}
}
