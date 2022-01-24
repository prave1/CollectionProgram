package Collection.com;
// Write a program to reverse ArrayList in java?

import java.util.ArrayList;
import java.util.Collections;

public class ReverseToArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> alist= new ArrayList<String>();
		alist.add("Apple");
		alist.add("Amazon");
		alist.add("Facebook");
		alist.add("Google");
		alist.add("IBM");
		
		alist.add("Tesla");
		
		System.out.println("Before Reverse Arraylist");
		System.out.println(alist);
		
		Collections.reverse(alist); // Reversing the list using collection.reverse() method
		
		System.out.println("After Reverse Arraylsit");
		
		System.out.println(alist);
	}

}
