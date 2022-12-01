package hospital;

public class patients {
String name;
int id;
String ward;
int age;
String room;
public patients(String name, int id, String ward, int age, String room) {
	super();
	this.name = name;
	this.id = id;
	this.ward = ward;
	this.age = age;
	this.room = room;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getWard() {
	return ward;
}
public void setWard(String ward) {
	this.ward = ward;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getRoom() {
	return room;
}
public void setRoom(String room) {
	this.room = room;
}
@Override
public String toString() {
	return "patients [name=" + name + ", id=" + id + ", ward=" + ward + ", age=" + age + ", room=" + room + "]";
}

}
