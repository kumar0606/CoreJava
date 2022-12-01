package If_else_excersises;

public class Employe_Salary {
	
public static void main(String[] args) {
	double basicsalary=5000;
    double da=0.0;
	double hra=0.0;
	if(basicsalary<=10000) {
		da=basicsalary*0.8;
		hra=basicsalary*0.2;
	}
	else if(basicsalary<=20000) {
		da=basicsalary*0.9;
		hra=basicsalary*0.3;
	}
	else {
		da=basicsalary*0.95;
		hra=basicsalary*0.3;
	}
	 double grosssalary=basicsalary+da+hra;
	 System.out.println("monthly salary="+grosssalary);
	
}
}
