package ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Topadspage 
{

	WebDriver driver;
	
	@FindBy(xpath="//a[contains(@title,'Top ads')]")
	WebElement Topadsxp;
	
	/*@FindBy(how=How.XPATH,using="//a[contains(@title,'Top ads')]")
	WebElement Topadsxp;*/
	
	@FindBy(xpath="//u[starts-with(text(),'Colour')]")
	WebElement home;
	
	@FindAll(@FindBy(how=How.XPATH,using="(//table[3])//tr/td[2]"))
	List<WebElement> topadslist;
	
	public Topadspage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement Topadsxp()
	{
		return Topadsxp;
	}
	public WebElement home()
	{
		return home;
	}
	public List<WebElement> topadslist()
	{
		return topadslist;
	}
	
	
	
	
}
