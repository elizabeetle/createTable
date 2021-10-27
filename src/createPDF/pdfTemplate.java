package createPDF;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class pdfTemplate {
	
		static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		String s = "";
		System.out.print("Please enter some Strings: ");
		while (true){
		    String input = scan.nextLine();
		    if(input.equalsIgnoreCase("stop"))
		        break;
		    s += input + " not ";
		}
		if (s.length() >= 5)
		    s = s.substring(0, s.length() - 5);
		System.out.println(s);
		
		
		
		

	}

}
