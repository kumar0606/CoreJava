package Comparable_Interface;

import java.util.Arrays;
import java.util.Comparator;

public class comparestudents {
	public static void main(String[] args) {
		student s=new student(124, "ravi", 2000, "zphighSchool");
		student s1=new student(122, "sunil", 2000, "zphighSchool");
		student s2=new student(123, "anil", 2000, "zphighSchool");
		student s3=new student(121, "kunal", 2000, "zphighSchool");
		student[]Students= {s,s1,s2,s3};
		Comparator<student> nameBasedSorting = new Comparator<student>() {

			@Override
			public int compare(student o1, student o2) {
				return o1.getName().compareTo(o2.getName());
				
			}
		};//System.out.println(nameBasedSorting.compare(s2, s3));
			Arrays.sort(Students);
		for(student Student:Students) {
			System.out.println(Student);
		}
	}

}
