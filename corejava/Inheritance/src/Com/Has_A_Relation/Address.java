package Com.Has_A_Relation;

public class Address {
 String location;
 String state;
Employee Address;
public Address(String location, String state, Employee address) {
	super();
	this.location = location;
	this.state = state;
	this.Address = address;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public Employee getAddress() {
	return Address;
}
public void setAddress(Employee address) {
	Address = address;
}
public void display() {
	System.out.println("employe id: "+Address.getId());
	System.out.println("employe name: "+Address.getName());
	System.out.println("employe salary: "+Address.getSalary());
	System.out.println("employe location: "+location);
	System.out.println("employe state: "+state);
}


}
