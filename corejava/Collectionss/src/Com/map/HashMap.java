package Com.map;

public class HashMap {
public static void main(String[] args) {
	java.util.HashMap h=new java.util.HashMap<>();
	Integer i1=new Integer(101);
	Integer i2=new Integer(101);
	h.put(i1, "ravi");
	h.put(i2, "kumar");
	System.out.println(h);
}
}
