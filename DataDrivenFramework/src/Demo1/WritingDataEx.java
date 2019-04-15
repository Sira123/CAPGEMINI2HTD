package Demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
 
public class WritingDataEx {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		FileInputStream fis=new FileInputStream("C:\\testdata\\userdata.xlsx");
		Workbook w1=WorkbookFactory.create(fis);
		w1.getSheet("Sheet3").createRow(3).createCell(3).setCellValue("selenium");
                  
		
		
		
		
	}

}
