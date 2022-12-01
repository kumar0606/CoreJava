package hospital;

public class doctor {
	String name;
	String specialization;
	patients p;
	public doctor(String name, String specialization, patients p,patients p1) {
		super();
		this.name = name;
		this.specialization = specialization;
		this.p = p;
		this.p=p1;
	}
	public void deatials() {
		System.out.println("PATIENT NAME: "+p.name);
		System.out.println("PATINT ID: "+p.id);
		System.out.println("PATIENT WAED:"+p.ward);
		System.out.println("PATIENT AGE:  "+p.age);
		System.out.println("PATIENT ROOM: "+p.room);
		System.out.println("DOCTOR NAME: "+name);
		System.out.println("DCOCTOR SPECIALIZATION: "+specialization);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public patients getP() {
		return p;
	}
	public void setP(patients p) {
		this.p = p;
	}

}
