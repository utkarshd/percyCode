package mypkg;

import java.util.ArrayList;
import java.util.List;

public class CountStrings {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> wordList = new ArrayList<String>();
		int wordCount= 0, numCount=0;
		for(String str:args) {
			wordList.add(str);
		}
		
		for(String str:wordList) {
			wordCount++;
			
			try{
				Integer.parseInt(str);
				// validating if arg is numeric or non- numeric
			}
			catch(NumberFormatException ex) {
				numCount++;
				// if arg is non-numeric, this counter will add +1
			}
		}
		System.out.println("The number of strings in the argument is:" + wordCount);
		System.out.println("The number of non-numeric strings in the argument is:" + numCount);
	}

}
