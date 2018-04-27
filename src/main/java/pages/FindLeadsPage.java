package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods {
	
	public FindLeadsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "(//input[@name ='firstName'])[3]")
	private WebElement eleFirstName;
	@And("enter First Name (.*)")
	public FindLeadsPage typeFirstName(String data) {
		type(eleFirstName, data);
		return this;
	}

	@FindBy(how = How.XPATH, using = "//input[@name = 'id']")
	private WebElement eleLeadId;
	@And ("Enter Lead Id as (.*)")
	public FindLeadsPage typeLeadId(String data) {
		type(eleLeadId, data);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Find Leads')]")
	private WebElement eleFindLeads;
	@And("click Find lead button")
	public FindLeadsPage clickFindLead() {
		click(eleFindLeads);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "(//div[@class ='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	private WebElement eleLeadIdLink;
	public static String verifyiD;
	@And("click ID Link")
	public ViewPage clickLeadId() {
		verifyiD = getText(eleLeadIdLink);
		click(eleLeadIdLink);
		return new ViewPage();
	}	
	
	@FindBy(how = How.XPATH, using = "//div[@class='x-paging-info']")
	private WebElement eleverifyNoDisplay;
	
	public FindLeadsPage verifyNoDisplayonlyDeleteLead() {
		type(eleLeadId, verifyiD);
		click(eleFindLeads);
		verifyPartialText(eleverifyNoDisplay, "No records to display");
		return this;
	}
	@Then("Verify No Display Lead Message is Displayed")
	public FindLeadsPage verifyNoDisplay() {
		verifyPartialText(eleverifyNoDisplay, "No records to display");
		return this;
	}

}
