
package pdf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfReader;


 
public class PdfToDocx {
 
 
	public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
		
		PdfReader reader = new PdfReader("/home/mujafar/Desktop/NPTEL Transcription Guidelines.pdf");
        int n = reader.getNumberOfPages();
        System.out.println("total no of pages:::"+n);
 
         Document document = new Document();
         com.lowagie.text.Document arg0;
		OutputStream arg1;
		com.lowagie.text.rtf.RtfWriter2.getInstance(arg0, arg1);
         
         System.out.println("file created");
         document.open();
         byte[] bytes;
         {
        	 
             bytes= ContentByteUtils.getContentBytesForPage(reader, i);
  
             String s= new String(bytes);
             document.add(new Paragraph(s));
  
             document.newPage();
  
  
             }
         
	}
 
}