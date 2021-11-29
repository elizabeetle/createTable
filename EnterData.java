package createPDF;

import java.util.Scanner;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

public class EnterData{
	
	Scanner scan = new Scanner(System.in);
	String term;
	String definition;
	String syntax;
	String answer;
	String answerdataCheck;
	Multimap<String, String> hashmapData = HashMultimap.create();
	
	



	public void dataEntry() {
	
		
		System.out.println("\nEnter the command: " );
	    term = scan.nextLine();
	    
	    System.out.println("\nEnter the use/definition: ");
	    definition = scan.nextLine();
	    
	    System.out.println("\nEnter the syntax: ");
	    syntax = scan.nextLine();
	    
		dataCheck();

		
		
	}
	
	public void dataCheck() {
		
		System.out.println("Is this information correct?" + "\n\n" + term + "---" + definition + "---" + syntax + " \n");
	    answerdataCheck = scan.nextLine();
	
	    
	    //line 50 to 70 turn into do - while loop (might have to take pieces apart)
	    if(answerdataCheck.charAt(0) == 'Y' || answerdataCheck.charAt(0) == 'y') {
			//this makes it so that if the first character is 'y' or 'Y' it will execute
			//this is wrong... uppercase Y doesn't work...
			hashmapData.put(term, definition);
			hashmapData.put(term, syntax);
		
			
			System.out.println(hashmapData);
			//this is where the PDF template entry needs to go...
			
			anotherEntry();


			} else if(answerdataCheck.charAt(0) == 'N' || answerdataCheck.charAt(0) == 'n') {
				System.out.println("Please re-enter the information...\n");
				
				dataEntry();
			
			} else {
				dataCheck();
		    //recursion, try to avoid
		    //while loop; would get rid of recursion
	
		}


		
	} 
	
	public void anotherEntry() {
		
		
		System.out.println("\nWould you like to make another entry?");
	    answer = scan.nextLine();
	    
		
		if(answerdataCheck.charAt(0) == 'Y' || answerdataCheck.charAt(0) == 'y') {
//		can leave blank because the "answer" variable is "yes" and will 
//			automatically take you back to dataEntry via the "while" section of the loop in scratch 
			
		
		} else if(answerdataCheck.charAt(0) == 'N' || answerdataCheck.charAt(0) == 'n') {
			System.out.println("\nYour document has been created. Check the current work folder for a PDF file.\n");
			
		} else {
			anotherEntry();
			//another recursion issue, fix with do-while loop
		
		}
	}


	
	public void closeScanner() {
		
		scan.close();
	}

		
	
	
//	System.out.println("What would you like to name this PDF table?");
//	String documentName = scan.nextLine();
// the above needs to go at the start of the program

}
