package Library;

import java.util.Scanner;

public class Library {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int choice=0;
		while (true ){
			System.out.println("enter 1 for module-1\n enter 2 for module-2");
			choice=Sc.nextInt();
			if(choice==1) {
				Module1 Sc1=new Module1();
				System.out.println("enter student name");
				Sc1.name=Sc.nextLine(); 
				Sc1.name=Sc.nextLine(); 
				System.out.println("enter student sur name");
				Sc1.sname=Sc.nextLine();
				System.out.println("enter student college id");
				Sc1.clg_id=Sc.nextLine();
				System.out.println("enter student user id");
				Sc1.uid=Sc.nextLine();
				System.out.println("enter student semester");
				Sc1.sem=Sc.nextLine();
				 
				Sc1.getdata(Sc1.name,Sc1.sname,Sc1.clg_id,Sc1.uid,Sc1.sem);
				
				Sc1.setdata();
					
				}
			else if(choice==2) {
				Module2 Sc2=new Module2();
				Sc2.chemistry();
				Sc2.physics();
				Sc2.mechanical();
			}
		}
	}

}
