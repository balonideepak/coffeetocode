package pdf;

import java.io.*;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.pdf.AcroFields.Item;

public class PdfModifierIText {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException, DocumentException {

        /* example inspired from "iText in action" (2006), chapter 2 */

        PdfReader reader = new PdfReader("D:/test.pdf"); // input PDF
        PdfStamper stamper = new PdfStamper(reader,
          new FileOutputStream("D:/Bubi_modified.pdf")); // output PDF
        BaseFont bf = BaseFont.createFont(
                BaseFont.HELVETICA, BaseFont.CP1252, BaseFont.NOT_EMBEDDED); // set font

        //loop on pages (1-based)
        for (int i=1; i<=reader.getNumberOfPages(); i++){

            // get object for writing over the existing content;
            // you can also use getUnderContent for writing in the bottom layer
            PdfContentByte over = stamper.getOverContent(i);
            
AcroFields acroFields = stamper.getAcroFields();
acroFields.setField("Oracle","Oraclee");
stamper.setFormFlattening(true);
acroFields.clearSignatureField("Oracle");
acroFields.setFieldRichValue("Oracle", "Oraclee");
Map<String, Item> fields = acroFields.getFields();
Set<Entry<String, Item>> entrySet = fields.entrySet();
for (Entry<String, Item> entry : entrySet) {
	System.out.println(entry.getKey()+" , "+entry.getValue());
}
//stamp.close();
            
            
            // write text
            over.beginText();
            over.setFontAndSize(bf, 10);    // set font and size
            over.setTextMatrix(107, 740);   // set x,y position (0,0 is at the bottom left)
            over.showText("I can write at page " + i);  // set text
            over.endText();

            // draw a red circle
            over.setRGBColorStroke(0xFF, 0x00, 0x00);
            over.setLineWidth(5f);
            over.ellipse(250, 450, 350, 550);
            over.stroke();
        }

        stamper.close();

    }
}
