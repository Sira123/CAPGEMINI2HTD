package Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
// TODO Auto-generated method stub
FileInputStream fis=new FileInputStream("C:\\testdata\\userdata.xlsx");
Workbook w1=WorkbookFactory.create(fis);
    String s=w1.getSheet("Sheet1").getRow(7).getCell(4).getStringCellValue();
		System.out.println(s);

	}

}
