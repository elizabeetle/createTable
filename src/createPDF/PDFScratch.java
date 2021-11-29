package createPDF;

import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class PDFScratch {
	
	
	public static void pdfTemplate() {
		
		  Document document = new Document();
		    
		    try
		    {
		        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("TerminalCommands.pdf"));
		        // for "TerminalCommands.pdf" I want to put in a variable to be able to name it each time
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
		        
		       
		        
		        
		 
		        table.addCell(cell1);
		        table.addCell(cell2);
		        table.addCell(cell3);

		 
		        document.add(table);
		 
		        document.close();
		        writer.close();
		    } catch (Exception e)
		    {
		        e.printStackTrace();
		    }
	}
	

}
