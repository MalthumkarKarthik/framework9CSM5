package TestScripts;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import genariclibarary.BaseClass;

public class AddToCartTest extends BaseClass {
	
	@Test
	public void addToCartTest() {
		Map<String,String> map = excel.getData("Sheet1", "Add Address");
		welcome.clickLoginButton();
		login.loginToApp(map.get("email"), map.get("password"));
		Thread.sleep(2000);
		home.mouseHoverToElectronic(webUtil);
		Thread.sleep(2000);
		home.clickHeadPhoneLink();
		headPhone.clickAddToCart();
		Thread.sleep(2000);
		Assert.assertEquals(headPhone.getAddToCartText(), "ADDED");
		String itemName = headPhone.getItemName();
		headPhone.clickCartIcon();
		Assert.assertTrue(cart.getCartItem().equalsIgnoreCase(itemName));
	}
	}

}
