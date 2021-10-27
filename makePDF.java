package createPDF;



import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;

import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;


 
public class makePDF
{
	public static void main(String[] args)
	{
	    Document document = new Document();
	    try
	    {
	        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("TerminalCommands.pdf"));
	        document.open();
	 
	        PdfPTable table = new PdfPTable(3); // 3 columns.
	        table.setWidthPercentage(100); //Width 100%
	        table.setSpacingBefore(25f); //Space before table
	        table.setSpacingAfter(25f); //Space after table
	        
	        
	        table.completeRow();
	 
	        //Set Column widths
	        float[] columnWidths = {1f, 1f, 1f};
	        table.setWidths(columnWidths);
	 
	        PdfPCell cell1 = new PdfPCell(new Paragraph("Command: "));
	        cell1.setBorderColor(BaseColor.BLACK);
	        cell1.setPaddingLeft(10);
	        cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
	 
	        PdfPCell cell2 = new PdfPCell(new Paragraph("Use: "));
	        cell2.setBorderColor(BaseColor.BLACK);
	        cell2.setPaddingLeft(10);
	        cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell2.setVerticalAlignment(Element.ALIGN_MIDDLE);
	 
	        PdfPCell cell3 = new PdfPCell(new Paragraph("Syntax: "));
	        cell3.setBorderColor(BaseColor.CYAN);
	        cell3.setPaddingLeft(10);
	        cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell3.setVerticalAlignment(Element.ALIGN_MIDDLE);
	        
	        PdfPCell cell4 = new PdfPCell(new Paragraph("mkdir"));
	        cell4.setBorderColor(BaseColor.BLACK);
	        cell4.setPaddingLeft(10);
	        cell4.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell4.setVerticalAlignment(Element.ALIGN_MIDDLE);
	 
	        
	        PdfPCell cell5 = new PdfPCell(new Paragraph("mkdir"));
	        cell5.setBorderColor(BaseColor.BLACK);
	        cell5.setPaddingLeft(10);
	        cell5.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell5.setVerticalAlignment(Element.ALIGN_MIDDLE);
	        
	        
	        
	        PdfPCell cell6 = new PdfPCell(new Paragraph("mkdir"));
	        cell6.setBorderColor(BaseColor.CYAN);
	        cell6.setPaddingLeft(10);
	        cell6.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell6.setVerticalAlignment(Element.ALIGN_MIDDLE);
	       
	        
	        
	 
	        table.addCell(cell1);
	        table.addCell(cell2);
	        table.addCell(cell3);
	        table.addCell(cell4);
	        table.addCell(cell5);
	        table.addCell(cell6);
	 
	        document.add(table);
	 
	        document.close();
	        writer.close();
	    } catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	}
}




//  want to create a template version of this that uses Scanner to read keyboard inputs
//	the template version will most likely use a Hashmap and ask for (K,V) formatted Scanned inputs
//				-how to make a third column?
//	want entries to be prompted...
//			-want the process to loop forever until you ask the process to stop (while loop?)
//				-"Would you like to add another entry?" Y/N
//				-Once you say N, then the PDF will be created
//			-only problem w/this is if you make a mistake you have to go through the process from start to finish
//				-Could make this better by asking "Is this correct?" Y/N each time?
//					-Could become annoying, but worth...





