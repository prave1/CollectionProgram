package Collection.com;
//Write a program to sort ArrayList in descending order?

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLisDescendingSort {
	
	public static void main(String[] args) {
		
		ArrayList<String> arraylist= new ArrayList<String>();
		arraylist.add("Apple");
		arraylist.add("Banana");
		arraylist.add("Pear");
		arraylist.add("Mango");
		
		System.out.println("ArrayList Before Sorting:");
		for(String str: arraylist)
		{
			
			
			System.out.println(str);
		}
		Collections.sort(arraylist,Collections.reverseOrder());
		
		System.out.println("ArrayList in Descending Order:");
		for(String str: arraylist)
		{
			System.out.println(str);
		}
	}

}
