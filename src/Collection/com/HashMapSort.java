package Collection.com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
// Write a program to sort HashMap by keys ?

public class HashMapSort {
	


	public static void main(String[] args) {
		
		HashMap<Integer,String> hasmap= new HashMap<Integer,String>();
		hasmap.put(22, "A");	
		hasmap.put(55, "B");
		hasmap.put(33, "C");
		hasmap.put(44, "D");
		hasmap.put(99, "E");
		hasmap.put(88, "F");
		
		System.out.println("Beore Sorting");
	   Set	set=hasmap.entrySet();
	  Iterator iterator = set.iterator();
	  while(iterator.hasNext())
	 {
		Map.Entry pair = (Map.Entry)iterator.next();
		System.out.print(pair.getKey()+" : ");
		System.out.println(pair.getValue());
		
	 }
	Map<Integer,String> map= new TreeMap<Integer,String>(hasmap);
	System.out.println("After Sorting");
    Set	set1=map.entrySet();
    
	
    Iterator iterator1 = set1.iterator();
    while(iterator1.hasNext())
    {
    	Map.Entry pair = (Map.Entry)iterator1.next();
    	System.out.print(pair.getKey()+" : ");
    	System.out.println(pair.getValue());
    }
		
	}

}
