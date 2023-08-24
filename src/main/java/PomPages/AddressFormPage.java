package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genariclibarary.WebDriverUtility;

public class AddressFormPage {
	//Declaration
	@FindBy(id="Name")
	private WebElement NameTF;
	@FindBy(id="House/Office Info")
	private WebElement HouseOfficeInfoTF;
	@FindBy(id="Street Info")
	private WebElement StreetInfoTF;
	@FindBy(id="Landmark")
	private WebElement LandmarkTF;
	@FindBy(id="Country")
	private WebElement CountryTF;
	@FindBy(id="State")
	private WebElement StateTF;
	@FindBy(id="City")
	private WebElement CityTF;
	@FindBy(id="Pincode")
	private WebElement PincodeTF;
	@FindBy(id="Phone Number")
	private WebElement PhoneNumberTF;
	@FindBy(xpath ="//button [text()='Add Address']")
	private WebElement AddAddressButtonTF;
	
	//Initialization
	public AddressFormPage(WebDriver driver)
	{
		PageFactory.initElements( driver, this);
	}
	//Utilization
	public void addAddressDetails(WebDriverUtility web,String name,String HouseOfficeInfo,String StreetInfo,String Landmark,String Country,String State,String City,String Pincode,String PhoneNumber,String AddAddressButton)
	{
		NameTF.sendKeys(name);
		HouseOfficeInfoTF.sendKeys(HouseOfficeInfo);
		StreetInfoTF.sendKeys(StreetInfo);
		LandmarkTF.sendKeys(Landmark);
		CountryTF.sendKeys(Country);
		StateTF.sendKeys(State);
		CityTF.sendKeys(City);
		PincodeTF.sendKeys(Pincode);
		PhoneNumberTF.sendKeys(PhoneNumber);
		AddAddressButtonTF.sendKeys(AddAddressButton);
		
		
	}

}
