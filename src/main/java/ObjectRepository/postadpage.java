package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class postadpage 
{

	WebDriver driver;
	
	By dropdown=By.xpath("//select[contains(@name,'catid')]");
	By newad=By.xpath("//a[contains(text(),'New Ad   ')]");
	By title=By.xpath("//input[@name='ad_title']");
	By description=By.xpath("//*[@name='ad_description']");
	By register=By.xpath("//input[@name='submit']");
	By uploadpicxp=By.xpath("//a[contains(text(),'Upload Picture')]");
	By uploadvideo=By.xpath("//a[contains(text(),'Upload Video')]");
	By uploaddocs=By.xpath("//a[contains(text(),'Upload Docs')]");
	By returnhome=By.xpath("//a[contains(text(),'Return')]");
	By addanotherad=By.xpath("//a[contains(text(),'Add another')]");
	By choosefile=By.xpath("//input[@type='file']");
	By finalupload=By.xpath("(//input[@name='submit'])[1]");
	By finishad=By.xpath("(//input[@name='submit'])[2]");
	
	public postadpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public WebElement dropdown()
	{
		return driver.findElement(dropdown);
	}
	
	public WebElement newad()
	{
		return driver.findElement(newad);
	}
	public WebElement title()
	{
		return driver.findElement(title);
	}
	
	public WebElement description()
	{
		return driver.findElement(description);
	}
	public WebElement register()
	{
		return driver.findElement(register);
	}
	
	public WebElement uploadpicxp()
	{
		return driver.findElement(uploadpicxp);
	}
	public WebElement uploadvideo()
	{
		return driver.findElement(uploadvideo);
	}
	
	public WebElement uploaddocs()
	{
		return driver.findElement(uploaddocs);
	}
	public WebElement returnhome()
	{
		return driver.findElement(returnhome);
	}
	
	public WebElement addanotherad()
	{
		return driver.findElement(addanotherad);
	}
	public WebElement choosefile()
	{
		return driver.findElement(choosefile);
	}
	
	public WebElement finalupload()
	{
		return driver.findElement(finalupload);
	}
	public WebElement finishad()
	{
		return driver.findElement(finishad);
	}
	
}
