package com.Chiselon.ColourClassifieds.Pages;

import org.testng.annotations.Test;

import com.Chiselon.ColourClassifieds.Utilities.Baseutils;

import ObjectRepository.LoginPageObjects;

public class Loginpage_PO extends Baseutils
{

	@Test
	public static void Login()
	{
		
		LoginPageObjects lp=new LoginPageObjects(driver);
		lp.username().sendKeys("abc@gmail.com");
		lp.password().sendKeys("123456");
		lp.submit().click();
		
	}
	
	
	
	
	
	
	
	
}
