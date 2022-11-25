package Enum_classes;

enum if_conditions {
CHOCOLATE,VANNILA,STRAWBERRY;
	public static void main(String[] args) {
		if_conditions i=if_conditions.VANNILA;
		if(i==i.CHOCOLATE) {
			System.out.println("this is choclate flavor "+if_conditions.CHOCOLATE);
		}else if(i==i.VANNILA) {
			System.out.println("this is choclate flavor "+if_conditions.VANNILA);
		}else if(i==i.STRAWBERRY) {
			System.out.println("this is choclate flavor "+if_conditions.STRAWBERRY);
		}
	}
}
