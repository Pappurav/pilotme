package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="Create Leads and Verify Last Name";
		testNodes="Leads";
		category="regression";
		authors="luffy";
		browserName="chrome";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	public void createLead(String uName,String pwd , String cName, String fName, String lName, String verlName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFALink()
		.clickLeads()
		.clickCreateLead()
		.typeCname(cName)
		.typeFname(fName)
		.typeLname(lName)
		.clickCreateLead()
		.verifyLastName(verlName);
	}

}
