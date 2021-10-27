package createPDF;


import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import java.util.Scanner;

public class scratch {
	
	
	static Scanner scan = new Scanner(System.in);
	static String term;
	static String definition;
	static String syntax;
	static String answer;
	static String answerdataCheck;
	static String answeranotherEntry;
	static Multimap<String, String> hashmapData = HashMultimap.create();

	

	public static void main(String[] args) {
	
		
		System.out.println("Let's make a table! \n" + "\n-----------------------------------------------\n");
		
		do {
			
			enterData.dataEntry();
		
			enterData.dataCheck();
		  
			enterData.anotherEntry();
		
		   
		} while (answer == "y" + "Y"); 
		// HOLY SHIT WHY DOESN"T THIS WORK :( big upsetty spaghetti
		
		
		
		
		
		scan.close();

		
		
	}

}








