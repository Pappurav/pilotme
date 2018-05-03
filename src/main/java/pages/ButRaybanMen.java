package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.SeMethods;

public class ButRaybanMen extends SeMethods {

	public ButRaybanMen() {
		PageFactory.initElements(driver, this);
	}




	@FindBy(how=How.XPATH,using="//*[@class = 'pdp-title']")
	private WebElement ProductName;
	@And("get Product Name")
	public ButRaybanMen getproductname() {
		productName = getText(ProductName);
		System.out.println(productName);
		return this;
	}

	@FindBy(how=How.XPATH,using="//*[@class = 'pdp-price']")
	private WebElement Productprice;
	@And("get Product Price")
	public ButRaybanMen getproductprice() {
		prices = getText(Productprice);
		System.out.println(prices);

		return this;
	}

	@FindBy(how=How.XPATH,using="//button[@class = 'pdp-add-to-bag pdp-button']")
	private WebElement Addtobagbutton;
	@And("click AddtoBag")
	public ButRaybanMen Addtobagbutton() throws InterruptedException {
		clickWithNoSnap(Addtobagbutton);
		//driver.findElementByXPath("//button[@class = 'pdp-add-to-bag pdp-button']").click();
		Thread.sleep(3000);
		return this;

	}
	
	@FindBy(how=How.XPATH,using="//*[@class = 'pdp-goToCart pdp-add-to-bag pdp-button']")
	private WebElement goToBag;
	@And("click GotoBag")
	public MytraCheckOutCartPage clickGoToBag() throws InterruptedException {
		//driver.findElementByXPath("//*[@class = 'pdp-goToCart pdp-add-to-bag pdp-button']").click();
		clickWithNoSnap(goToBag);
		Thread.sleep(3000);
		return new MytraCheckOutCartPage();

	}

}