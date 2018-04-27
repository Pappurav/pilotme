package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class ViewPage extends ProjectMethods {
	
	public ViewPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how = How.ID, using = "viewLead_lastName_sp")
	private WebElement eleLastNameveri;
	@Then("Verify Lead is created successfully as (.*)")
	public ViewPage verifyLastName(String lName) {
		verifyPartialText(eleLastNameveri, lName);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Edit')]")
	private WebElement eleEdit;
	@And("click Edit button")
	public EditLeadPage clickEdit() {
		click(eleEdit);
		return new EditLeadPage();
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id ='viewLead_companyName_sp']")
	private WebElement eleCompanyName;
	@Then("verify Updated Company Name (.*)")
	public ViewPage verifyComName(String data) {
		verifyPartialText(eleCompanyName, data);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Delete')]")
	private WebElement eleDelete;
	@And ("click Delete Button")
	public MyLeadsPage clickDelete() {
		click(eleDelete);
		return new MyLeadsPage();
	}
	
	@FindBy(how = How.LINK_TEXT, using = "Find Leads")
	private WebElement eleFindLead;
	
	public FindLeadsPage clickFindLead() {
		click(eleFindLead);
		return new FindLeadsPage();
	}
	
}
