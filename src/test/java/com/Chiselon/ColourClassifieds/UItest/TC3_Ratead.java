package com.Chiselon.ColourClassifieds.UItest;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Chiselon.ColourClassifieds.Utilities.Baseutils;
import com.Chiselon.ColourClassifieds.Utilities.TC_exceldata;

import ObjectRepository.HomepageObjects;
import ObjectRepository.LoginPageObjects;
import ObjectRepository.TopRatedpage;

public class TC3_Ratead extends TC_exceldata
{
   WebDriver driver;
   String parwind;
   Baseutils commons=new Baseutils();
   
    @BeforeTest
	public void bftest() throws Exception
	{
		browservalue=browservalue();
		driver=openbrowser(browservalue);
		url=url();
		commons.geturl(driver, url);
		HomepageObjects hppost=new HomepageObjects(driver);
		hppost.logonclick().click();
		LoginPageObjects lppost=new LoginPageObjects(driver);
		userid=userid();
		lppost.username().sendKeys(userid);
		pwd=pwd();
		lppost.password().sendKeys(pwd);
		submitlogin=lppost.submit();
		submitlogin.click();
		
	} 
   
   
	@Test
	public void TC3_Rateadd()
	{
		TopRatedpage trp=new TopRatedpage(driver);
		trp.Toprated().click();
		trp.adselect().click();
		parwind = driver.getWindowHandle();
	    System.out.println(parwind);
		trp.Grade().click();
		Set<String> winds = driver.getWindowHandles();
		for(String wind:winds)
		{
			System.out.println(wind);
			if(parwind.equals(wind))
			{
				System.out.println("samewindow");				
			}
			else
			{
				driver.switchTo().window(wind);
				WebElement gd = trp.gradexp();				
				Select sel=new Select(gd);
				sel.selectByVisibleText("7");
				trp.ratethis().click();
				driver.close();
				driver.switchTo().window(parwind);
			}
		}
		trp.Grade().click();
		
		
		
		
		
		
			}
	@AfterTest
	public void afttest()
	{
		driver.close();
	}
	
	
}
