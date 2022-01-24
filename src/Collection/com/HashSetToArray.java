package Collection.com;

import java.util.HashSet;

//Write a program to convert HashSet to Array? 

public class HashSetToArray {

	public static void main(String[] args) {
		HashSet<String> set= new HashSet<String>();  
		set.add("Pear");
		set.add("Apple");
		set.add("Orange");
		set.add("Papaya");
		set.add("Banana");
		
		System.out.println("HashSet contains="+set);
		
		String a[]= new String[set.size()];  // creating an array of hashset
		
		set.toArray(a);      // converting set to array using toArray() method
		
		System.out.println("Array of Contains:");    // showing Array Elementss
		
		for(String str: a)
		{
			System.out.println(str);
		}
	}
}
