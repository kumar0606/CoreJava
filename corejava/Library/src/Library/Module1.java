package Library;

public class Module1{
	String name,sname,clg_id,uid,sem;// it is global variables
	//int sem;
	public void getdata(String name,String sname, String clg_id,String uid,String sem ) {
		this.name=name;
		this.sname=sname;
		this.clg_id=clg_id;
		this.uid=uid;
		this.sem=sem;
	}
	public void setdata() {
		System.out.println("student name:"+name);
		System.out.println("student surname:"+sname);
		System.out.println("student college id:"+clg_id);
		System.out.println("student user id:"+uid);
		System.out.println("student semester:"+sem);
	}
}
