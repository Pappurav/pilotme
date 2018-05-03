package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.*;
import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class MytraCheckOutCartPage extends SeMethods{
	
	public MytraCheckOutCartPage() {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(how = How.CLASS_NAME, using = "prod-name")
	private WebElement eleProductName;
	@And("verify selected product's name")
	public MytraCheckOutCartPage verifyProductName() {
		if (getText(eleProductName).equals(productName)) {
			System.out.println("The product name matches");
		}else {System.out.println("The product Name not matched");}
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "//*[@class = 'c-dblue total-rupees']")
	private WebElement elePriceName;
	@And("verify selected product's price")
	public MytraCheckOutCartPage verifyPriceName() {
		if (getText(elePriceName).replaceAll("[,]", "").equals(prices)) {
			System.out.println("The price value matches");
		}
		return this;
	}
	
	public void closeBrowser() {
		driver.close();
	}
		

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


