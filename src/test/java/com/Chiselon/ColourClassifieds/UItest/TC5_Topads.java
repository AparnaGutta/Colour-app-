package com.Chiselon.ColourClassifieds.UItest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Chiselon.ColourClassifieds.Utilities.Baseutils;
import com.Chiselon.ColourClassifieds.Utilities.TC_exceldata;

import ObjectRepository.HomepageObjects;
import ObjectRepository.LoginPageObjects;
import ObjectRepository.Topadspage;

public class TC5_Topads extends TC_exceldata
{

	WebDriver driver;
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
	public void TC5_Topadds()
	{
		Topadspage tap=new Topadspage(driver);
		tap.Topadsxp().click();
		List<WebElement> adscount = tap.topadslist();
		//System.out.println(adscount.size());
		for(int i=1;i<=adscount.size();i++)
		{
			String adname=driver.findElement(By.xpath("((//table[3])//tr/td[2])["+i+"]")).getText();
			String adviews=driver.findElement(By.xpath("((//table[3])//tr/td[4])["+i+"]")).getText();
			System.out.println("The number of views for "+adname+" is :"+adviews);
		}
		
	}
	
	
}
