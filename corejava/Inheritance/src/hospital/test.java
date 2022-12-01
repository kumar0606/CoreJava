package hospital;

public class test {
	public void getbyname(String name) {
		patients p=new patients("surya", 301, "general", 32, "1st");
		patients p1=new patients("krishna", 302, "general ", 32, "1st");
		patients p2=new patients("ram", 303, "general", 32, "3rd");
		patients p3=new patients("karthik", 304, "icu", 32, "4th");
		
	   doctor d1=new doctor("ravi", "bones", p,p1);
	   doctor d2=new doctor("satya", "skin", p1,p1);
	   doctor d3=new doctor("pawan", "eye", p2,p2);
	   doctor d4=new doctor("ravi kumar", "psychiatrist", p3, p1);
	   doctor dd[]= {d1,d2,d3,d4};
	   for(doctor da:dd) {
		   if(da.getName()==name) {
			   da.deatials();
		   }}
	
	   
	   
	}
	public static void main(String[] args) {
		test t=new test();
		t.getbyname("ravi kumar");
	}
}