package com.Chiselon.ColourClassifieds.UItest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Chiselon.ColourClassifieds.Utilities.Baseutils;
import com.Chiselon.ColourClassifieds.Utilities.TC_exceldata;

import ObjectRepository.HomepageObjects;
import ObjectRepository.LoginPageObjects;
import ObjectRepository.postadpage;



public class TC2_postad extends TC_exceldata
{
	Baseutils commons=new Baseutils();
    public String filepath; 
	
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
	public void TC2_postadd() throws Exception
	{
		
		postadpage postpage=new postadpage(driver);
		
		postpage.newad().click();
		
		postpage.dropdown().click();
		//dropdownsel(driver, postpage.dropdown());
		Select sel=new Select(postpage.dropdown());
		sel.selectByValue("2");
		titledata=titledata();
		postpage.title().sendKeys(titledata);
		descriptiondata=descriptiondata();
		postpage.description().sendKeys(descriptiondata);
		postpage.register().click();
		postpage.uploadpicxp().click();
		postpage.choosefile().click();
		Robot r=new Robot();
		filepath=adlocation();
		StringSelection selection = new StringSelection(filepath);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(selection, selection);

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		postpage.finalupload().click();
		postpage.finishad().click();
	}
	
	
	
	
	
	
}
