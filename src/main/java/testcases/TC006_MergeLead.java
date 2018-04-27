package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_MergeLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC006_MergeLead";
		testDescription="Merge two given lead Ids and verify the merge";
		testNodes="Leads";
		category="regression";
		authors="luffy";
		browserName="chrome";
		dataSheetName="TC006";
	}
	@Test(dataProvider="fetchData")
	public void createLead(String uName,String pwd , String fromLeadId, String toLeadID) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFALink()
		.clickLeads()
		.clickMergeLead()
		.clickFromLeadimg()
		.typeFLeadId(fromLeadId)
		.clickFindLead()
		.clickSelectedIdLink()
		.clickToLeadimg()
		.typeTLeadId(toLeadID)
		.clickFindLead()
		.clickSelectedIdLink()
		.clickMergeLead()
		.clickFindLead()
		.typeLeadId(fromLeadId)
		.clickFindLead()
		.verifyNoDisplay();
	}

}
