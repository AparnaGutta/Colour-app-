package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Chiselon.ColourClassifieds.UItest.TC4_TopRated;

public class TopRatedpage extends TC4_TopRated
{
	WebDriver driver;
	
	By Toprated=By.xpath("//a[contains(@title,'Top Rated')]");
	By home=By.xpath("//u[starts-with(text(),'Colour')]");
	By Grade=By.xpath("//a/u[text()='Grade']");
    By soldgrade=By.xpath("//a/u[contains(text(),'Grade ')]");
    By addtofav=By.xpath("//a[contains(text(),'Add to your Favorites')]");
    By moreads=By.xpath("//a[contains(text(),'More ads in this category')]");
    By Adsseller=By.xpath("//a[contains(text(),'Ads from this seller')]");
    By contactseller=By.xpath("(//a[contains(text(),'Contact seller')])[1]");
    By tellfriend=By.xpath("//a[contains(text(),'Tell')]");
    By print=By.xpath("//a[contains(text(),'Print')]");
    By adselect=By.xpath("//a[contains(text(),'Medical Transcriptionists?')]");
    By ratethis=By.xpath("//input[@value='Rate this']");
	By gradexp=By.xpath("//select[@name='grade']");
	By Toprateadsxp=By.xpath("(((//table[3]/tbody/tr["+i+"]))/td[2])");
	
	By totalads=By.xpath("(((//table[3]/tbody/tr))/td[4])");
	
	public TopRatedpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement Toprated()
	{
		return driver.findElement(Toprated);
	}
	public WebElement home()
	{
		return driver.findElement(home);
	}
	public WebElement Grade()
	{
		return driver.findElement(Grade);
	}
	public WebElement soldgrade()
	{
		return driver.findElement(soldgrade);
	}
	public WebElement addtofav()
	{
		return driver.findElement(addtofav);
	}
	public WebElement moreads()
	{
		return driver.findElement(moreads);
	}
	public WebElement Adsseller()
	{
		return driver.findElement(Adsseller);
	}
	public WebElement contactseller()
	{
		return driver.findElement(contactseller);
	}
	public WebElement tellfriend()
	{
		return driver.findElement(tellfriend);
	}
	public WebElement print()
	{
		return driver.findElement(print);
	}
	public WebElement adselect()
	{
		return driver.findElement(adselect);
	}
	public WebElement ratethis()
	{
		return driver.findElement(ratethis);
	}
	public WebElement gradexp()
	{
		return driver.findElement(gradexp);
	}
	
	public List<WebElement> Toprateadsxp()
	{
		return driver.findElements(Toprateadsxp);
	}
	
	public List<WebElement> totalads()
	{
		return driver.findElements(totalads);
	}
}
