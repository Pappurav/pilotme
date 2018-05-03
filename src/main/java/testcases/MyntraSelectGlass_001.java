package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MytraLaunchPage;
import pages.MytraWelcomePage;
import utils.DataInputProvider;
import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class MyntraSelectGlass_001 extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC001_MyntraProductSunGlasses";
		testDescription="Verify ProductName and Price";
		testNodes="SunGlasses";
		category="Smoke";
		authors="Vino";
		browserName="chrome";
		dataSheetName="TC007";
	}
	
	@Test(dataProvider = "fetchData")
	public void myntraSelectGlass_001(String Product) throws InterruptedException {
		
		new MytraWelcomePage()
		.enterSearch(Product)
		.findunisexglassndflat40()
		.clickGreenColourglass()
		.clickProduct()
		.getproductname()
		.getproductprice()
		.Addtobagbutton()
		.clickGoToBag()
		.verifyProductName()
		.verifyPriceName()
		.closeBrowser();
		
		
		
	}
	
	

}

	
