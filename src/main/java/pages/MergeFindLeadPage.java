package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MergeFindLeadPage extends ProjectMethods {
	
	public MergeFindLeadPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how = How.XPATH, using = "//input[@name ='id']")
	private WebElement eleLeadId;
	@And("Enter FMLead Id (.*)")
	public MergeFindLeadPage typeFLeadId(String data) {
		type(eleLeadId, data);
		return this;
	}
	
	@And("Enter TMLead Id (.*)")
	public MergeFindLeadPage typeTLeadId(String data) {
		type(eleLeadId, data);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "//button[text() ='Find Leads']")
	private WebElement eleFindId;
	@And("click FLead Button")
	public MergeFindLeadPage clickFindLead() {
		click(eleFindId);
		return this;
	}
	
	@FindBy(how = How.XPATH, using = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement eleSelectedIdLink;
	@And("click SelectedID Link")
	public MergeLeadPage clickSelectedIdLink() {
		clickWithNoSnap(eleSelectedIdLink);
		switchToWindow(0);
		return new MergeLeadPage();
	}
	
	
	
	
	}
