package IntimeTestCases;

import org.testng.annotations.Test;

import IntimePages.LoginPage;

public class loginTest extends baseClass {

	@Test
	public void login() throws Exception {
		LoginPage lp = new LoginPage(d);
		lp.selectUser("Ajay Kashamirchand Sharma", "1111");
		Thread.sleep(5000);
		printScreen.takeprintScreen(d);
	}

}
