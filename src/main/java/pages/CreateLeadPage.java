package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods {
	
	public CreateLeadPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_companyName")
	private WebElement eleCname;
	@And("Enter Comp_Name as(.*)")
	public CreateLeadPage typeCname(String cName) {
		type(eleCname, cName);
		return this;
	}

	@FindBy(how = How.ID, using = "createLeadForm_firstName")
	private WebElement eleFname;
	@And("Enter First Name as (.*)")
	public CreateLeadPage typeFname(String fName) {
		type(eleFname, fName);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_lastName")
	private WebElement eleLname;
	@And("Enter Last Name as (.*)")
	public CreateLeadPage typeLname(String lName) {
		type(eleLname, lName);
		return this;
	}
	
	@FindBy(how = How.CLASS_NAME, using = "smallSubmit")
	private WebElement eleCreateLead;
	@When("Click Create Lead")
	public ViewPage clickCreateLead() {
		click(eleCreateLead);
		return new ViewPage();
	}
	
}
