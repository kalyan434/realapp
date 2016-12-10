package com.pdf;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.List;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.PdfCell;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class DemoPdf {

	public static void main(String[] args) throws FileNotFoundException, DocumentException {
		// TODO Auto-generated method stub

		Document doc=new Document();
		PdfWriter pdfWriter=PdfWriter.getInstance(doc, new FileOutputStream("test.pdf"));
		doc.open();
		
		/*PdfPTable table1 = new PdfPTable(1);
		PdfPCell cell1=new PdfPCell(new Paragraph("cell1"));
		cell1.setBorder(Rectangle.NO_BORDER);
		cell1.setBackgroundColor(new Color(211,211,211));;
		table1.addCell(cell1);
		doc.add(table1);*/
		
		float[] coln={5,1,5,1,5,1,5,1};
		
		PdfPTable p1=new PdfPTable(coln);
		p1.setWidthPercentage(100);
		p1.getDefaultCell().setHorizontalAlignment(Rectangle.ALIGN_LEFT);
		PdfPCell dcell = new PdfPCell(new Paragraph("Deck"));
		dcell.setColspan(2);
		p1.addCell(dcell);
		PdfPCell cell = new PdfPCell(new Paragraph("Superstructure"));
		cell.setColspan(2);
		p1.addCell(cell);
		
		
		PdfPCell cell3 = new PdfPCell(new Paragraph("Substructure"));
		
		cell3.setColspan(2);
		p1.addCell(cell3);
		
		PdfPCell cell4 = new PdfPCell(new Paragraph("General"));
		
		cell4.setColspan(2);
		p1.addCell(cell4);
		
		p1.getDefaultCell().setMinimumHeight(2f);
		p1.addCell(" ");
		p1.addCell("");
		p1.addCell("");
		p1.addCell("");
		p1.addCell("");
		p1.addCell("");
		p1.addCell("");
		p1.addCell("");
		
		for(int i=0;i<2;i++)
		{
		PdfPCell cell5 = new PdfPCell(new Paragraph("deckcomp"));
		p1.addCell(cell5);
		}
		
		for(int i=0;i<2;i++)
		{
		PdfPCell cell5 = new PdfPCell(new Paragraph("deckcomp"));
		p1.addCell(cell5);
		}
		for(int i=0;i<2;i++)
		{
		PdfPCell cell5 = new PdfPCell(new Paragraph("deckcomp"));
		p1.addCell(cell5);
		}
		for(int i=0;i<1;i++)
		{
		PdfPCell cell5 = new PdfPCell(new Paragraph("deckcomp"));
		p1.addCell(cell5);
		}
		for(int i=0;i<2;i++)
		{
		PdfPCell cell5 = new PdfPCell(new Paragraph("deckcomp"));
		p1.addCell(cell5);
		}
		for(int i=0;i<2;i++)
		{
		PdfPCell cell5 = new PdfPCell(new Paragraph("deckcomp"));
		p1.addCell(cell5);
		}
		for(int i=0;i<2;i++)
		{
		PdfPCell cell5 = new PdfPCell(new Paragraph("deckcomp"));
		p1.addCell(cell5);
		}
		for(int i=0;i<2;i++)
		{
		PdfPCell cell5 = new PdfPCell(new Paragraph("deckcomp"));
		p1.addCell(cell5);
		}
		
		
		
		
		
		
		
System.err.println("p1.getRow(1).getCells().length"+p1.getRow(1).getCells().length);		
		
p1.getRow(1).getCells()[0].addElement(new Paragraph("Open Deck"));
		
		PdfPTable p2=new PdfPTable(2);
		PdfPCell cell1 = new PdfPCell(new Paragraph("Open Deck"));
		PdfPCell cell2 = new PdfPCell(new Paragraph(""));
		
		p2.addCell(cell1);
		p2.addCell(cell2);
		p1.addCell( p2);
		
		 
		
		p1.addCell(new Paragraph("Superstructure"));
		p1.addCell(new Paragraph("Substructure"));
		p1.addCell(new Paragraph("General"));

		
		doc.add(p1);
		
		
		/*for(int j=0;j<3 ;j++)
		{
			List a = new List();
			Paragraph paragraph=new Paragraph();
			paragraph.setAlignment(Element.ALIGN_RIGHT);
		doc.add(paragraph);
		a.add("loop"+j);
		PdfPTable table = new PdfPTable(5);
		addHeader(table);
		for(int i=0;i<5;i++)
		{
			
			table.addCell("one"+i);
			table.addCell("two"+i);
			table.addCell("three"+i);
			table.addCell("four"+i);
			table.addCell("five"+i);	
		}
		doc.add(a);
		doc.add(table);
		}
		 */

		 
		
		 
		doc.close();
		pdfWriter.close();
	}
	
	public static void addHeader(PdfPTable table)
	{
		
		PdfPCell cell1=new PdfPCell(new Paragraph("cell1"));
		PdfPCell cell2=new PdfPCell(new Paragraph("cell2"));
		PdfPCell cell3=new PdfPCell(new Paragraph("cell3"));
		PdfPCell cell4=new PdfPCell(new Paragraph("cell4"));
		PdfPCell cell5=new PdfPCell(new Paragraph("cell5"));
		
		
		table.addCell(cell1);
		table.addCell(cell2);
		table.addCell(cell3);
		table.addCell(cell4);
		table.addCell(cell5);
				
		
		
	}
	

}
