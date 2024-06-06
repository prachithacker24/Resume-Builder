import java.io.FileOutputStream;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;

public class templates {
    templates() throws Exception{
        Document doc =new Document();
        PdfWriter pw=PdfWriter.getInstance(doc, new FileOutputStream("D://exmp.pdf"));
        doc.open();
        PdfImportedPage page=pw.getImportedPage(new PdfReader("D:/JAVA_RESUME_PRACHI/Ressume_Builder/Data/creame_color.jpg"), 1);
        PdfContentByte pb=pw.getDirectContent();
        pb.addTemplate(page, 0,0);

    }
    public static void main(String[] args) throws Exception{
        new templates();
    }
}
