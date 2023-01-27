package retriveDataFromExcel;

import java.io.FileInputStream;

import java.util.Properties;


import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility {
	public String getDataFromProperties(String data) throws Exception {
		 FileInputStream fis = new FileInputStream("E:\\New folder\\Acti.properties");
		  Properties pos = new Properties();
		  pos.load(fis);
		  String commondata = pos.getProperty(data);
		  
		  return commondata;	   
	}
	
	public String getDataFromExcel(String sheetName, int rowNum, int cellNum) throws Exception {
		FileInputStream fis = new FileInputStream("E:\\excelfolder\\sample.xlsx");
		Workbook book = WorkbookFactory.create(fis);
	          Sheet sh =book.getSheet(sheetName);
		DataFormatter df =new DataFormatter(); 
		String testData= df.formatCellValue(sh.getRow(rowNum).getCell(cellNum));
		 
		return testData;
		
	}
	
}


