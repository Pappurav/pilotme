package mytra;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SunGalssesPercentage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		driver.findElementByClassName("desktop-searchBar").sendKeys("sunglasses", Keys.ENTER);
		int count = 0;
		//To find the number of glasses with 40% discount and Unisex
		List<WebElement> percentageList = driver.findElementsByClassName("product-productMetaInfo");
		//Set<String> percentageSet = new TreeSet<>();
		for (WebElement percentage : percentageList) {
			if(percentage.getText().contains("Unisex"))
			{
				if(percentage.getText().contains("40"))
				{count++;}
			}
			//if(percentage.getText().contains("40")) {count++;}
		}
		System.out.println(count);
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElementByXPath("//input[@value='green']/..").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//*[@class = 'product-thumb'])[2]").click();
		/*js.executeScript("arguments[0].scrollIntoView();", Element);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@class='colour-checkbox'])[4]")));
		*/
		
		
		

		
				
		//Printing the name of the product after clicking the item
		String productName = driver.findElementByXPath("//*[@class = 'pdp-title']").getText();
		System.out.println(productName);
		String productPrice = driver.findElementByXPath("//*[@class = 'pdp-price']").getText();
		System.out.println(productPrice);
		driver.findElementByXPath("//button[@class = 'pdp-add-to-bag pdp-button']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@class = 'pdp-goToCart pdp-add-to-bag pdp-button']").click();
		Thread.sleep(3000);
		String productVerifier = driver.findElementByClassName("prod-name").getText();
		System.out.println(productVerifier);
		String priceVerifier = driver.findElementByXPath("//*[@class = 'c-dblue total-rupees']").getText();
		System.out.println(priceVerifier.replaceAll("[,]", ""));
		driver.close();
		
		
		
		
		
		

	}

}
