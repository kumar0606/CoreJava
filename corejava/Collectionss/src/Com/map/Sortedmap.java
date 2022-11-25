package Com.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class Sortedmap {
public static void main(String[] args) {
	SortedMap s=new TreeMap();
	s.put(101, "a");
	s.put(102, "b");
	
	s.put(104, "d");
	s.put(103, "c");
	s.put(105, "e");
	s.put(106, "f");
	s.put(107, "g");
	System.out.println(s);
	System.out.println(s.firstKey());
	System.out.println(s.lastKey());
	System.out.println(s.headMap(104));
	System.out.println(s.tailMap(104));
	System.out.println(s.subMap(102, 106));
}
}
