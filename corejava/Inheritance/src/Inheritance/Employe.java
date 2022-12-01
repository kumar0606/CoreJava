package Inheritance;

public class Employe extends Human{
	
@Override
public void eat() {
	System.out.println("employe can eat");
}
@Override
	public void talk() {
		System.out.println("employe can talk");
		}
@Override
	public void sleep() {
		System.out.println("employe can sleep");
	}

}
