package TestScripts;

import java.util.Map;

import javax.security.auth.login.LoginContext;

import org.testng.annotations.Test;

import PomPages.WelcomePage;
import genariclibarary.BaseClass;

public class RegisterShopperTest extends BaseClass {
	
	@Test
	public void createAccountTest()
	{
		welcome.clickLoginButton();
		login.clickCreateAccountButton();
		
		Map<String , String> map=excel.getData("Sheet1","Shopper Registation");
		int randomNum
		
	}
}

