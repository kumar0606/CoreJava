package Com.SSCE_college;

public class Constructor_shortcut_keys {
int id;
String name;
double fees;
int eheels;
//if intialize the parametrized constructor with shortcut key word is (alt+shift+s+o)
public Constructor_shortcut_keys(int id, String name, double fees, int eheels) {
	super();
	this.id = id;
	this.name = name;
	this.fees = fees;
	this.eheels = eheels;
}
 public Constructor_shortcut_keys() {
	// TODO Auto-generated constructor stub
}
 //alt+shift+s+s shortcut keyword used for print the display details
@Override
public String toString() {
	return "Constructor_shortcut_keys [id=" + id + ", name=" + name + ", fees=" + fees + ", eheels=" + eheels + "]";
}
public void Constructor_shortcut_keys() {
	 System.out.println("name"+name);
	 System.out.println("id"+id);
	 System.out.println("fees"+fees);
	 System.out.println("eheels"+eheels);
	 
	}
 public static void main(String[] args) {
	 Constructor_shortcut_keys k=new Constructor_shortcut_keys()	;
	 k.eheels=5;
	 k.fees=100;
	 k.name="dfwe";
	 k.id=2;
	 k.Constructor_shortcut_keys();
}
 
}