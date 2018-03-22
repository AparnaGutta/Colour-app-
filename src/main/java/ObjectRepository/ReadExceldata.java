package ObjectRepository;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadExceldata
{
	public XSSFWorkbook wb;
	public XSSFSheet sheet;
	public XSSFRow row;
	public String[][] data=null;
	

	FileInputStream fis;
	
    @DataProvider(name="Testdata")
	
	public String[][] exceldata() throws Exception
	{
	   fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\ObjectRepository\\Testdata.xlsx");
	   wb=new XSSFWorkbook(fis);
	   sheet=wb.getSheet("testdata");
	   row=sheet.getRow(0);
	   data=new String[sheet.getLastRowNum()][row.getLastCellNum()];
	  
	   for(int i=0;i<sheet.getLastRowNum();i++)
	   {
		   for(int j=1;j<row.getLastCellNum();j++)
		   {
		 
			   data[i][j-1]=sheet.getRow(i).getCell(j).getStringCellValue();
		   
		  
		  
		   }
	   }
	   return data;
	
	
	   
	}
	
}

