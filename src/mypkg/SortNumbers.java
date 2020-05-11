package mypkg;

import java.util.ArrayList;
import java.util.Collections;

public class SortNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		
		for(String str:args) {
			try {
				intlist.add(Integer.parseInt(str));
				// if the arg is numeric, it will convert to int
			}
			catch(NumberFormatException ex) {
				// if the arg is non - numeric, it will not covert to int
			}
		
		}
		
		System.out.println("The numbers before sorting: " + intlist);
		Collections.sort(intlist);
		Collections.reverse(intlist);
		System.out.println("the reverse sorted numbers are: " + intlist);
		System.out.println("the third highest nmber in the list is: " + intlist.get(2));
	}

}
