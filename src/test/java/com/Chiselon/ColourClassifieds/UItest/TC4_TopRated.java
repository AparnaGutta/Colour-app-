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
import ObjectRepository.TopRatedpage;

public class TC4_TopRated extends TC_exceldata
{

	WebDriver driver;
	Baseutils commons=new Baseutils();
	public int i;
	
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
	public void TC4_TopRatedd()
	{
		TopRatedpage trp=new TopRatedpage(driver);
		trp.Toprated().click();
		List<WebElement> totalads = trp.totalads();
		System.out.println(totalads.size());
		for(i=1;i<=totalads.size();i++)
		{
			String singlead =driver.findElement(By.xpath("(((//table[3]/tbody/tr["+(i+1)+"]))/td[2])")).getText();
			//List<WebElement> fullgrade = trp.fullgrade();
			List<WebElement> fullgrade = driver.findElements(By.xpath("((((//table[3]/tbody/tr))/td[4]))["+i+"]//img[contains(@src,'full')]"));
			int fullgradesize = fullgrade.size();
			//List<WebElement> halfgrade = trp.halfgrade();
			List<WebElement> halfgrade = driver.findElements(By.xpath("((((//table[3]/tbody/tr))/td[4]))["+i+"]//img[contains(@src,'half')]"));
			int halfgradesize = halfgrade.size();
			//List<WebElement> emptygrade = trp.emptygrade();
			List<WebElement> emptygrade = driver.findElements(By.xpath("((((//table[3]/tbody/tr))/td[4]))["+i+"]//img[contains(@src,'empty')]"));
			int emptygradesize = emptygrade.size();
			int totalgradeforad=((fullgradesize*2)+(halfgradesize*1)+(emptygradesize*0));
			System.out.println("The grade given forr "+singlead+" add is : "+totalgradeforad);
			
		}
		
	}
	
	
	
	
}
