package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	//Declaration
		@FindBy(xpath="//div[@class='cart_productDetails__pKWBD']/h3")
		private WebElement CartItems;
		
		//initialization
		public CartPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
			
		}
		//utilization
		public String getCartitem()
		{
			return CartItems.getText();
		}
}
