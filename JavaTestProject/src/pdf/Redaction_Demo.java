package pdf;

import java.awt.Color;
import java.io.IOException;

import com.gnostice.pdfone.PdfDocument;
import com.gnostice.pdfone.PdfException;
import com.gnostice.pdfone.PdfSearchMode;
import com.gnostice.pdfone.PdfSearchOptions;
import com.gnostice.pdfone.graphics.PdfBrush;
import com.gnostice.pdfone.graphics.PdfPen;

public class Redaction_Demo
{
    public static void main(String[] args) throws IOException, PdfException, Exception {
        
        // Create brush for fill the redacted regions
        PdfBrush pbRedactBrush = new PdfBrush();
        pbRedactBrush.fillColor = Color.YELLOW;
        
        // Create pen to stroke the redacted regions
        PdfPen pnRedactPen = new PdfPen();
        pnRedactPen.strokeColor = Color.MAGENTA;

        // Load a PDF document
        PdfDocument doc = new PdfDocument();
        doc.load("D:/test_input.pdf");       
        
        // Redact all instance of the text "gnostice" in pages 1 and 2
        doc.redactText("1-44",
                      "Oracle", 
                      PdfSearchMode.LITERAL, 
                      PdfSearchOptions.NONE, 
                      pnRedactPen, 
                      pbRedactBrush, 
                      true, 
                      true);
        
        // Save the redacted document to specified file
        doc.setOpenAfterSave(true);
        doc.save("D:/redacted_doc.pdf");        
        doc.close();      
    }       
}