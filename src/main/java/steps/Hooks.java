package steps;




import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hooks extends SeMethods{
	
	@Before
	public void openBrowser(Scenario sc) {
		startResult();
		System.out.println(sc.getName());
		startTestModule(sc.getName(), sc.getId());
		test = startTestCase(sc.getName());
		test.assignCategory("smoke");
		test.assignAuthor("");
		startApp("chrome");
	}
	
	@After
	public void endResult(Scenario sc) {
		endResult();
		System.out.println(sc.getStatus());
		closeAllBrowsers();
		
	}

}
