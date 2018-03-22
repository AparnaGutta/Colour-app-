package com.Chiselon.ColourClassifieds.Utilities;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_exceldata extends Baseutils
{

	//public XSSFSheet sheetname;
	public String browservalue;
	public String url;
	public String titledata;
	public String userid;
	public String descriptiondata;
	public String pwd;
	public String adlocation;
	public WebElement submitlogin;
	
	
	public String browservalue() throws Exception
	{
		
		//sheet=wb.getSheet("Sheet2");
		//row=sheet.getRow(0);
		sheet=excelread();
		browservalue=sheet.getRow(0).getCell(1).getStringCellValue();
		System.out.println(browservalue);
		return browservalue;
		
		}

	public String titledata() throws Exception
	{
		sheet=excelread();
		titledata=sheet.getRow(4).getCell(1).getStringCellValue();
		System.out.println(titledata);
		return titledata;
		
	}
	
	public String descriptiondata() throws Exception
	{
		sheet=excelread();
		descriptiondata=sheet.getRow(5).getCell(1).getStringCellValue();
		
		return descriptiondata;
	}
	
	public String adlocation() throws Exception
	{
		sheet=excelread();
		adlocation=sheet.getRow(3).getCell(1).getStringCellValue();
		
		return adlocation;
	}
	
	public String url() throws Exception
	{
		sheet=excelread();
		url=sheet.getRow(2).getCell(1).getStringCellValue();
		
		return url;
	}
	
	public String userid() throws Exception
	{
		sheet=excelread();
		userid=sheet.getRow(6).getCell(1).getStringCellValue();
		
		return userid;
	}
	
	public String pwd() throws Exception
	{
		sheet=excelread();
		pwd=sheet.getRow(7).getCell(1).getStringCellValue();
		
		return pwd;
	}
	
	
	
	
	
}
