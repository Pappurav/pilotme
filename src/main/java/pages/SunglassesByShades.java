package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.SeMethods;

public class SunglassesByShades extends SeMethods{
	
	public SunglassesByShades() {
		PageFactory.initElements(driver, this);
	}
	int count = 0;
	@And("find Unisex Glass and flat 40%")
	public SunglassesByShades findunisexglassndflat40()
	{
		List<WebElement> percentageList = driver.findElementsByClassName("product-productMetaInfo");
		for (WebElement percentage : percentageList) {
			if(percentage.getText().contains("Unisex"))
			{
				if(percentage.getText().contains("40"))
				{count++;}
			}
		}
		System.out.println(count);
		return this;
	}

	@FindBy(how=How.XPATH,using="//input[@value='green']/..")
	private WebElement greenColourglass;
	@And("select Green Color option from Colour")
	public SunglassesByShades clickGreenColourglass() throws InterruptedException {
		//driver.findElementByXPath("//input[@value='green']/..").click();
		click(greenColourglass);
		return this;
	}


	@FindBy(how=How.XPATH,using="(//*[@class = 'product-thumb'])[2]")
	private WebElement clickproduct;
	@And("select second displayed product")
	public ButRaybanMen clickProduct() {
		//driver.findElementByXPath("(//*[@class = 'product-thumb'])[2]").click();
		click(clickproduct);
		return new ButRaybanMen();
	}

}