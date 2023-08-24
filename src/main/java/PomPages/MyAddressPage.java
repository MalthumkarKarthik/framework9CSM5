package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddressPage {
	//Declaration 
		@FindBy(xpath = "//button [text()='Add Address']")
		private WebElement AddAddressButton;
		
		//INITIALTION
		public MyAddressPage(WebDriver driver) {
			PageFactory.initElements( driver,this);
		}
		//Utilization
		public void ClickMyAddress() {
			AddAddressButton.click();

		}


}
