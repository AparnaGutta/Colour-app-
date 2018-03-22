package com.Chiselon.ColourClassifieds.UItest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.Chiselon.ColourClassifieds.Utilities.Baseutils;
import ObjectRepository.HomepageObjects;
import ObjectRepository.LoginPageObjects;

public class TC1_Login extends Baseutils

{
	/*public XSSFWorkbook wb;
	public XSSFSheet sheet;
	public XSSFRow row;*/
	public String[][] data=null;
	//public	FileInputStream fis;
	
	@Test(dataProvider="Testdata")
	public void TC1_Loginn(String Browser, String url, String un, String pwd, String dropdown_xpath) 
	{
		
		System.out.println(System.getProperty("user.dir"));
		testdata(System.getProperty("user.dir")+"\\"+"src\\test\\Testdata\\Testdata.properties");
		System.out.println(Browser);
		driver=openbrowser(Browser);
		driver.manage().window().maximize();
		geturl(driver, url);
		HomepageObjects hp=new HomepageObjects(driver);
		hp.logonclick().click();
		LoginPageObjects lp1=new LoginPageObjects(driver);
		lp1.username().sendKeys(un);
		lp1.password().sendKeys(pwd);
		lp1.submit().click();
		//hp.logoutclick().click();
	}
	
	 @DataProvider(name="Testdata")
	 public String[][] exceldata() throws Exception
		{
		   /*fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\ObjectRepository\\Testdata.xlsx");
		   wb=new XSSFWorkbook(fis);*/
		   excelread();
		   sheet=wb.getSheet("testdata");
		   row=sheet.getRow(0);
		   System.out.println(sheet.getLastRowNum());
		   System.out.println(row.getLastCellNum());
		  // data=new String[sheet.getLastRowNum()][row.getLastCellNum()];
		   
		   data=new String[1][5];
		  
		  /* for(int i=1;i<=1;i++)
		   {*/
			   for(int j=0;j<row.getLastCellNum();j++)
			   {
			 
				   data[0][j]=sheet.getRow(1).getCell(j).getStringCellValue();
				  // System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			  
			   }
		   //}
		   
		   return data;
			

}}
