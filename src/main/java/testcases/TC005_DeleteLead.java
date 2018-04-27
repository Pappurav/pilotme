package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC005_DeleteLead";
		testDescription="Delete the given Lead ID";
		testNodes="Leads";
		category="regression";
		authors="luffy";
		browserName="chrome";
		dataSheetName="TC005";
	}
	@Test(dataProvider="fetchData")
	public void deleteLead(String uName,String pwd,String lId) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFALink()
		.clickLeads()
		.clickFindLead()
		.typeLeadId(lId)
		.clickFindLead()
		.clickLeadId()
		.clickDelete()
		.clickFindLead()
		.verifyNoDisplayonlyDeleteLead();
	}

}
