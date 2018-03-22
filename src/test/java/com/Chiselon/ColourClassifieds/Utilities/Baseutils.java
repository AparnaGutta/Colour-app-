package com.Chiselon.ColourClassifieds.Utilities;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Baseutils 
{
	
	public WebDriver driver;
	public FileInputStream file;
	//public static FileInputStream file1;
	public Properties prop;
	public WebElement dropdown;
	public XSSFWorkbook wb;
	public XSSFSheet sheet;
	public XSSFRow row;
	public	FileInputStream fis;
	public String dropdown_xpath;
	
	
	public  Properties testdata(String propertiesfile)
	{
		try
		{
	    file =new FileInputStream(propertiesfile);
		prop=new Properties();
		prop.load(file);
		return prop;
		
		
		}
		catch (Exception e)
		{

			System.out.println("Test data method failed------>"+e.getMessage());
			return null;
		}
		
	}
	
	public WebDriver openbrowser(String Browservalue)
	{
		try
		{
		if(Browservalue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(Browservalue.equalsIgnoreCase("firefox"))
		{
			//System.setProperty("webdriver.gecko.driver", "Drivers//geckodriver.exe");
			driver= new FirefoxDriver();
			
		}
		else if(Browservalue.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "Drivers//IEDriverServer.exe");
			driver= new InternetExplorerDriver();
		}
		else
		{
			System.out.println(Browservalue+" "+"browser is in valid");
		}
		
		}
		catch(Exception e)
		{
			System.out.println("openbrowser failed---->"+e.getMessage());
		}
		return driver;
	}
	public static WebDriver closebrowser(WebDriver driver)
	{
		try
		{
			driver.close();
		}
		catch(Exception e)
		{
			System.out.println("closebrowsert failed"+ e.getMessage());
		}
		return null;
	}
	public WebDriver geturl(WebDriver driver,String urlvalue)
	{
		try
		{
			driver.get(urlvalue);
		}
		catch(Exception e)
		{
			System.out.println("url not found----->"+e.getMessage());
		}
		return driver;
	}
	
	
	public static WebDriver click(WebDriver driver,String xpathvalue)
	{
		try
		{
			driver.findElement(By.xpath(xpathvalue)).click();
			
		}
		catch(Exception e)
		{
			System.out.println("xpath failed");
			System.out.println(e.getMessage());
		}
		return driver;
		
	}
	
	public WebDriver sendkeys(WebDriver driver,String xpathvalue,String keyvalue)
	{
		try
		{
			driver.findElement(By.xpath(xpathvalue)).clear();
			driver.findElement(By.xpath(xpathvalue)).sendKeys(keyvalue);
		}
		catch(Exception e)
		{
			System.out.println("sendkeys method failed");
			System.out.println(e.getMessage());
		}
		return driver;
		
	}
	
	public XSSFSheet excelread() throws Exception
	{
		fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\ObjectRepository\\Testdata.xlsx");
		   wb=new XSSFWorkbook(fis);
		   sheet=wb.getSheet("Sheet2");
		   return sheet;
	}
	
	public void dropdownsel(WebDriver driver, String xpath)
	{
		dropdown=driver.findElement(By.xpath("//select[contains(@name,'catid')]"));
		
	}
	
}
