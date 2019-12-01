package dataDriven.excelDataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
	
	// with the hep on TestNG data Provider we can send multiple sets of data.
	//TestNG sends each dataset as Array
	// TO do this we need to create a multidimensional array object
	
	//Use the dataprovider for the method to listen
	
	// DataFormatter is used to pass any type of data which is converted to string
	DataFormatter formatter = new DataFormatter();
	
	@Test(dataProvider = "driveTest" )
	public void testCaseData(String ip1, String ip2, String ip3)
	{
		System.out.println(ip1 + ip2 + ip3);
	}
	
	
	@DataProvider(name = "driveTest")
	public Object[][] getData() throws IOException
	{
		//create a multidimensional array object
		//Object data [][] = {{"hello1", "hello2", "text1"},{"hello1", "hello2", "text2"},{"hello1", "hello2","text3"}};
		//every row of excel is one array
		FileInputStream fis = new FileInputStream("C:\\Users\\anandjyesth\\Documents\\Excel Driven.xlsx");
		// define workbook instance
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//Get the sheet where the data is present. USE GETSHEETAT method
		XSSFSheet sheet = wb.getSheetAt(0);
		//Get no of rows
		int rowCount =  sheet.getPhysicalNumberOfRows();
		//Get nos of columns
		//Get into any row and count the last column
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		
		Object [][] data = new Object[rowCount -1 ][colCount];
		
		for (int i = 0; i<rowCount -1; i++) {
			row = sheet.getRow(i+1);
			
			for (int j = 0; j<colCount; j++) {
				XSSFCell cell = row.getCell(j);
				
				data [i][j] = formatter.formatCellValue(cell);
			}
		}
		
		return data;
		
		
		
		//return data;

}
}