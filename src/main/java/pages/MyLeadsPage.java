package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods {
	
	public MyLeadsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.LINK_TEXT, using = "Create Lead")
	private WebElement eleCreateLead;
	@And("click Create Lead")
	public CreateLeadPage clickCreateLead() {
		click(eleCreateLead);
		return new CreateLeadPage();
	}
	
	@FindBy(how = How.XPATH, using = "//a[text() ='Find Leads']")
	private WebElement eleFindLead;
	@And("click Find Lead")
	public FindLeadsPage clickFindLead() {
		click(eleFindLead);
		return new FindLeadsPage();
	}
	
	@FindBy(how = How.LINK_TEXT, using = "Merge Leads")
	private WebElement eleMergeLead;
	@And("click Merge Lead")
	public MergeLeadPage clickMergeLead() {
		click(eleMergeLead);
		return new MergeLeadPage();
	}

}
