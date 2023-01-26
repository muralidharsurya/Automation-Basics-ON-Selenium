package prepairedataDrivenFramWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excel_SheetConnectionFramWork {
	public static void main(String[] args) throws Exception {
		
		FileInputStream fs= new FileInputStream("E:\\excelfolder\\sample.xlsx");
Workbook book =	 WorkbookFactory.create(fs);
Sheet sh= book.getSheet("Sheet1");
      //String data =  sh.getRow(0).getCell(1).getStringCellValue();// optimized method
		//System.out.println(data);
		
   // Row r= sh.getRow(1);
    //Cell c= r.getCell(2);
    
   // String dat =c.getStringCellValue();
    //System.out.println(dat);
    

//Numaric value is taking from excel
	DataFormatter df= new DataFormatter() ;
	String numaric= df.formatCellValue(sh.getRow(4).getCell(1));
	System.out.println(numaric);
	
    sh.createRow(5).createCell(1).setCellValue("876543");
    FileOutputStream fos= new FileOutputStream("E:\\\\excelfolder\\\\sample.xlsx");
     book.write(fos);
    System.out.println("values are pass");
		
	
		
		
	
    
    
	
	
	
		 
	}


}
