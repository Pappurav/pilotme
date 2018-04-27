package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MergeLeadPage extends ProjectMethods {
	
	public MergeLeadPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how = How.XPATH, using = "//*[@src ='/images/fieldlookup.gif'][1]")
	private WebElement eleFromLead;
	@And("click From Lead img")
	public MergeFindLeadPage clickFromLeadimg() {
		clickWithNoSnap(eleFromLead);
		switchToWindow(1);
		return new MergeFindLeadPage();
	}
	
	@FindBy(how = How.XPATH, using = "(//*[@src ='/images/fieldlookup.gif'])[2]")
	private WebElement eleToLead;
	@And("click To Lead img")
	public MergeFindLeadPage clickToLeadimg() {
		clickWithNoSnap(eleToLead);
		switchToWindow(1);
		return new MergeFindLeadPage();
	}
	
	@FindBy(how = How.CLASS_NAME, using = "buttonDangerous")
	private WebElement eleMergeLead;
	@And("click Mmerge Button")
	public ViewPage clickMergeLead() {
		click(eleMergeLead);
		acceptAlert();
		return new ViewPage();
	}
	
	}
