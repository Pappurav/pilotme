package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.*;
import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class MytraWelcomePage extends SeMethods{
	
	public MytraWelcomePage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.CLASS_NAME,using="desktop-searchBar")
	private WebElement eleSearchField;
	@And("enter in Search field as (.*)")
	public SunglassesByShades enterSearch(String pName) {
		//driver.findElementByClassName("desktop-searchBar").sendKeys(itemName, Keys.ENTER);
		enter(eleSearchField, pName);
		return new SunglassesByShades();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
