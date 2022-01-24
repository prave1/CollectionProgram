package Collection.com;
// Write a program to iterate TreeMap in java? 

import java.util.*;
public class TreeMapIteratorEx {
	
	public static void main(String[] args) {
		
		 TreeMap<String, String> tmap= new TreeMap<String,String>();  // Declaring a treemap of string keys and string values
		 
		 //Add Key-value Pairs to TreeMap
		 tmap.put("Key1", "Pear");
		 tmap.put("Key2", "Apple");
		 tmap.put("Key3", "Orange");
		 tmap.put("Key4", "Papaya");
		 tmap.put("Key5", "Banana");
		 
		 Set s= tmap.entrySet();  //get set of entries
		 Iterator it= s.iterator(); // get iterator
		 
		 System.out.println("TreeContains:"); // show the elements
		 
		 while(it.hasNext())
		 {
			 Map.Entry pair = (Map.Entry)it.next();
			 
			 System.out.print("Key is: "+pair.getKey()+"and");
			 
			 System.out.println(" Value is:  "+pair.getValue());
		 }
		 
		 
		 
		 
	}

}
