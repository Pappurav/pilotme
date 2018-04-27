package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLead";
		testDescription="Edit Lead name Details";
		testNodes="Leads";
		category="regression";
		authors="luffy";
		browserName="chrome";
		dataSheetName="TC004";
	}
	@Test(dataProvider="fetchData")
	public void editLead(String uName,String pwd,String fName, String cName, String vercName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFALink()
		.clickLeads()
		.clickFindLead()
		.typeFirstName(fName)
		.clickFindLead()
		.clickLeadId()
		.clickEdit()
		.clearCompanyName()
		.typeCompanyName(cName)
		.clickUpdate()
		.verifyComName(vercName);
	}

}
