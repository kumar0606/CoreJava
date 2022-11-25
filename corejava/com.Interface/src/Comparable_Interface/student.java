package Comparable_Interface;

import java.util.Arrays;
import java.util.Comparator;

public class student implements Comparable<student>{
	int id;
	String name;
	int fees;
	String Schoolname;
	public student(int id, String name, int fees, String schoolname) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
		Schoolname = schoolname;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", fees=" + fees + ", Schoolname=" + Schoolname + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public String getSchoolname() {
		return Schoolname;
	}
	public void setSchoolname(String schoolname) {
		Schoolname = schoolname;
	}
	@Override
	public int compareTo(student o) {
		
		return -1;
	}


}
