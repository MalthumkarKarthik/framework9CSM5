package genariclibarary;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {
	private WebDriver driver;
	public void navigateToApp(String browser,String url,long time) {
		switch (browser) {
		case "chrome":
			driver=new ChromeDriver();
		break;
		case "firefox":
			driver=new FirefoxDriver();
		break;
		case "edge": 
			driver=new EdgeDriver();
		break;
		default:
			System.out.println("invalid browser info");
	    }
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
	}
	public void mouseHover(WebElement element) {
		Actions actions =new Actions(driver);
		actions.moveToElement(element).perform();
		
		
	}
	public void doubleClick(WebElement element) {
		Actions actions =new Actions(driver);
		actions.doubleClick(element).perform();
		
		
	}
	public void rightClick(WebElement element) {
		Actions actions =new Actions(driver);
		actions.contextClick(element).perform();
		
		
	}
	public void dragandDrop(WebElement element,WebElement target) {
		Actions actions =new Actions(driver);
		actions.dragAndDrop(element,target).perform();
		
		
	}
	public void selectfromDropdown (WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
		
	}
	//DROPDOWN
	public void selectfromDropdown (WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
		
	}
	public void selectfromDropdown (String text,WebElement element) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
		
	}
	//FRAMES
	public void switchtoFrames(int index) {
		driver.switchTo().frame(index);
	}
	public void switchtoFrames(String idorName) {
		driver.switchTo().frame(idorName);
	}
	public void switchtoFrames(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}
	//TO SCROLL
	public void scollTillElement(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("agument[0].scrollIntoview(true)",element);
	}
	public void handleAlert(String status) {
		Alert al=driver.switchTo().alert();
		if(status.equalsIgnoreCase("ok"))
		al.accept();
		else 
			al.dismiss();
	}
	public void switchtoChildBrowser(String id) {
      Set<String> set =driver.getWindowHandles();
		for(String s:set) {
			driver.switchTo().window(s);
		}		
	}
	public void switchToWindow(String id) {
		driver.switchTo().window(id);
	}
	public String getParentWindowID() {
		return  driver.getWindowHandle();
	}
	//CLOSING BROWSER
	public void closeSingleBrowser() {
		driver.close();
	}
	public void closeAller() {
		driver.quit(); 
	}
}
