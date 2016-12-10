package com.pdf;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Image;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

@ManagedBean
@ViewScoped
public class PDFGeneratorBean implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void generatePDF() throws DocumentException, IOException
	{
		ExternalContext externalContext=FacesContext.getCurrentInstance().getExternalContext();
		System.err.println("*************");
		String fileName="test";
		Document doc=new Document();
//		Image image=Image.getInstance(ClassLoader.getSystemResource("/images/Koala.jpg").getPath());
		
		InputStream is=externalContext.getResourceAsStream("/images/Koala.jpg");
		Image image=Image.getInstance(inputStreamToByte(is));
		 image.setAbsolutePosition(150f, 150f);
	//	image.scaleToFit(300, 200);
		
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		PdfWriter pdfWriter=PdfWriter.getInstance(doc, bos );
		doc.open();
		doc.add(new Paragraph("test doce"));
		doc.add(image);
		doc.close();
		
		pdfWriter.close();
		
	//	System.err.println("******isssss"+is);
    	externalContext.responseReset();
		externalContext.setResponseContentType("application/pdf");
		externalContext.setResponseHeader("Content-Disposition", "attachment; filename=\""
                + fileName + ".pdf\"");
		bos.writeTo(externalContext.getResponseOutputStream());
		FacesContext.getCurrentInstance().responseComplete();

		externalContext.responseFlushBuffer();

		
		
		
		
		
		
	}
	
	public static byte[] inputStreamToByte(InputStream is) throws IOException {
	    if (is == null) {
	        return null;
	    }
	    // Define a size if you have an idea of it.
	    ByteArrayOutputStream r = new ByteArrayOutputStream(2048);
	    byte[] read = new byte[512]; // Your buffer size.
	    for (int i; -1 != (i = is.read(read)); r.write(read, 0, i));
	    is.close();
	    return r.toByteArray();
	}
	
}
