package Demo1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelOperation {
	
	public static String readData(String sheetName,int rowNumber, int cellNumber)
	{
		
		try
		{
		FileInputStream fis=new FileInputStream("C:\\testdata\\userdata.xlsx");
		Workbook w1 = WorkbookFactory.create(fis);
		String data = w1.getSheet(sheetName).getRow(rowNumber).getCell(cellNumber).getStringCellValue();
         return data;
		}
		catch(Exception rv)
''		{
			
			return "";
		}
		
	}
	public static void writeData(String sheetName,int rowNumber, int cellNumber, String data)
	{
		try
		{
		FileInputStream fis=new FileInputStream("C:\\testdata\\userdata.xlsx");
	Workbook w1=WorkbookFactory.create(fis);
	w1.getSheet("Sheet3").createRow(3).createCell(3).setCellValue("selenium");
	 FileOutputStream fos =new FileOutputStream("C:\\testdata\\userdata.xlsx");
	    w1.write(fos);       
		}
		catch(Exception rv)
		{
			
			
		}
		
		
	}
}
