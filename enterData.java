package createPDF;


public class enterData extends scratch{
	

	public static void dataEntry() {
	
		
		System.out.println("\nEnter the command/term: ");
	    term = scan.nextLine();
	    
	    System.out.println("Enter the use/definition: ");
	    definition = scan.nextLine();
	    
	    System.out.println("Enter the syntax: ");
	    syntax = scan.nextLine();
		
		
	}
	
	
	
	public static void dataCheck() {
		
		System.out.println("Is this information correct?" + "\n\n" + term + "| " + definition + "| " + syntax + " \n");
	    answerdataCheck = scan.nextLine();
	    
		
		if(answerdataCheck == "y" + "Y") {
			//this makes it so that if the first character is 'y' or 'Y' it will execute
			hashmapData.put(term, definition);
			hashmapData.put(term, syntax);
			enterData.anotherEntry();

		} else if(answerdataCheck == "n" + "N") {
			System.out.println("Please re-enter the information...\n");
			enterData.dataEntry();
			
		} else {
		    enterData.dataCheck();
	
		}
	}
	
	public static void anotherEntry() {
		
		System.out.println("\nWould you like to make another entry?");
	    answer = scan.nextLine();
	    
		
		if(answer.charAt(0) == 'y' + 'Y') {
			enterData.dataEntry();
		
		} else if(answer.charAt(0) == 'n' + 'N') {
			System.out.println("\nYour document has been created. Check the current work folder for a PDF file.\n");
			
		} else {
			enterData.anotherEntry();
		
		}
	}




}
