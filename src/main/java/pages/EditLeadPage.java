package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods {
	
	public EditLeadPage() {
		PageFactory.initElements(driver, this);
		
	}
		
	@FindBy(how = How.XPATH, using = "(//input[@name = 'companyName'])[2]")
	private WebElement eleCompanyName;
	@And("clear Company Name")
	public EditLeadPage clearCompanyName() {
		eleCompanyName.clear();
		return this;
	}
	
	@And("Enter Company Name (.*)")
	public EditLeadPage typeCompanyName(String data) {
		type(eleCompanyName, data);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "//input[@class = 'smallSubmit']")
	private WebElement eleUpdate;
	@When("click Update")
	public ViewPage clickUpdate() {
		click(eleUpdate);
		return new ViewPage();
	}
}
