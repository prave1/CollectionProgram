package Collection.com;
// Write a program to convert LinkedList to ArrayList?

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListToArrayList {
	public static void main(String[] args) {
		
		LinkedList<String> l= new LinkedList<String>();
		l.add("Mango");
		l.add("Banana");
		l.add("Orange");
		l.add("Apple");
		l.add("Pear");
	System.out.println(l);
		List<String> list= new ArrayList<String>(l);
		
System.out.println("----------Convert to linkedlisttoArraylis----------");
		for(String str: list)
		{
			System.out.println(str);
		}
		
	}

}
