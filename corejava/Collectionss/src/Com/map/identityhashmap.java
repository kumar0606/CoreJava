package Com.map;

import java.util.IdentityHashMap;

public class identityhashmap {
public static void main(String[] args) {
	IdentityHashMap i=new IdentityHashMap<>();
	Integer i1=new Integer(101);
	Integer i2=new Integer(101);
	i.put(i1, "ravi");
	i.put(i2, "kumar");
	System.out.println(i);
}
}
