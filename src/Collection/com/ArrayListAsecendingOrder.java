package Collection.com;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAsecendingOrder {
	public static void main(String[] args) {
		
		ArrayList<Integer> arraylist= new ArrayList<Integer>();
		arraylist.add(1);
		arraylist.add(2);
		arraylist.add(3);
		arraylist.add(4);
		arraylist.add(5);
		
		System.out.println("ArrayList Before Sorting:");
		for(int num: arraylist)
		{
			System.out.println(num);
		}
		Collections.sort(arraylist,Collections.reverseOrder());
		
		System.out.println("ArrayList in Descending Order:");
		for(int num: arraylist)
		{
			System.out.println(num);
		}
		
	}

}
