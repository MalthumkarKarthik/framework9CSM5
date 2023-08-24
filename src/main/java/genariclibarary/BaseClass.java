package genariclibarary;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import PomPages.AddressFormPage;
import PomPages.CartPage;
import PomPages.HeadPhonePage;
import PomPages.HomePage;
import PomPages.MyAddressPage;
import PomPages.MyProfilePage;
import PomPages.ShopperLoginPage;
import PomPages.SignUpPage;
import PomPages.WelcomePage;

public class BaseClass {

	//generic libraries
	protected PropertiesUitility property;
	protected ExcelUtility excel;
	protected Javautility jUtil;
	protected WebDriverUtility webUtil;
	public WebDriver driver;
	public static WebDriver sdriver;
	//PomPages
	protected WelcomePage welcome;
	protected ShopperLoginPage login;
	protected HomePage home;
	protected SignUpPage signUp;
	protected MyProfilePage myProfile;
	protected MyAddressPage myAddress;
	protected HeadPhonePage headPhone;
	protected CartPage cart;
	protected AddressFormPage address;
	
	
	//@BeforeSuite
	//@BeforeTest
	@BeforeClass
	public void classConfiguration()
	{
		property = new PropertiesUitility();
		excel = new ExcelUtility();
		jUtil = new Javautility();
		webUtil = new WebDriverUtility();
		
		property.PropertiesInit(IConstantPath.pROPERTIES_PATH);
		excel.excelInit(IConstantPath.EXCEL_PATH);
		
	}
	
	@BeforeMethod
	public void methodConfiguration()
	{
		//driver = webUtil.navigateToApp(property.getData("browser"),property.getData("url"),Long.parseLong(property.getData("time")));
		 
		driver = webUtil.navigateToApp(property.getData("browser"), 
				property.getData("url"),
				Long.parseLong(property.getData("time")));
		sdriver = driver;
		
		welcome = new WelcomePage(driver);
		login = new ShopperLoginPage(driver);
		home = new HomePage(driver);
		signUp= new SignUpPage(driver);
		myProfile = new MyProfilePage(driver);
		myAddress= new MyAddressPage(driver);
		headPhone=new HeadPhonePage(driver);
		cart= new CartPage(driver);
		address = new AddressFormPage(driver);
		
	}
	
	@AfterMethod
	public void methodTeardown()
	{
		home.ClickProfileButton();
		home.clickLogout();
		webUtil.closeAller();
	}
	
	@AfterClass
	public void classTeardown()
	{
		excel.closeExcel();
	}
	//@AfterTest
	//@AfterSuite
}
