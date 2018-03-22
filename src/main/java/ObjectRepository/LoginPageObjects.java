package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects
{
	public WebDriver driver;

	By username=By.id("username");
	By password=By.name("password");
	By submit=By.xpath("//input[@value='Log in']");
	//By username=By.id("username");
	
	public LoginPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	
	
	public WebElement username()
	{
		return driver.findElement(username);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement submit()
	{
		return driver.findElement(submit);
	}
	
	
	
	
	
}


