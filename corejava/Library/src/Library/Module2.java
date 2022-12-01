package Library;

public class Module2 {
public void chemistry() {
	System.out.println(" ");
	String chem[]= {"organic chemistry","physical chemistry","bio chemitry","inorganic chemistry"};
	
	System.out.println("the books available in chemistry department");
	for(int i=0; i<chem.length;i++) {
		System.out.println(chem[i]);
	}
}
public void physics() {
	System.out.println(" ");
	String phy[]= {"mechanics","solid works","dynamics","fem"};
	System.out.println("the books available in physics department");
	for(int j=0;j<phy.length;j++) {
		System.out.println(phy[j]);
		
	}
}
public void mechanical() {
	System.out.println(" ");
	String mech[]= {"kom","dom","or","dom","robotics","thermodynamics"};
	System.out.println("the books availabe in mechanical department");
	for(int k=0; k<mech.length;k++) {
		System.out.println(mech[k]);
	}
}
}
