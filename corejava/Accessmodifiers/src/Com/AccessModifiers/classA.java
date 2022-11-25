package Com.AccessModifiers;

public class classA {
	//private access modifier is used to access the data with in the class
	// public access modifier is used to access the data any where
	//protected access modifier is used to access the data with in package
	//default access modifier is used to access the data with in current package
private int id;
//private data access in other class we using setter and getter methods
static String ceo;
 private String name;
// public classA() {   //this is default constructor
//}	

public void setdata(int id) {
	this.id=id;
}
public void getdata() {
	this.id=id;
}
public void setname(String name) {
	this.name=name;
}
public void getname() {
	this.name=name;
}
public void setceo(String name) {
	this.name=name;
} 
public void getceo() {
	this.ceo=ceo;
}
public void data() {  // this is method
	System.out.println("id:"+id+" name:"+name+" ceo:"+ceo);
	
}
public static void main(String[] args) {
	classA b=new classA() ;
	b.id=100;
	b.name="kk";
	b.id=102;
	b.ceo="ravi";
	b.data();
	classA c=new classA();
	c.id=333;
	c.name="trdrtc";
	c.ceo="mahesh";
	c.id=444;
	c.name="ferf";
	c.ceo="kumar";
	c.ceo="surya";
	c.data();
	}

}
