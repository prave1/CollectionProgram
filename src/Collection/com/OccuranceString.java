package Collection.com;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class OccuranceString {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Character:");
		
		String s = sc.next();
		
		//String s="";
		s=s.replace("", "");
		char a[]= s.toCharArray();
		int count=0;
		
		Map<Character, Integer> map = new TreeMap<>();
		for(int i=0; i<a.length; i++)
		{
			count=0;
			for(int j=0; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					
					count++;
				}
				
			}
			map.put(a[i], count);
		}
		System.out.println(map);
	}

}
