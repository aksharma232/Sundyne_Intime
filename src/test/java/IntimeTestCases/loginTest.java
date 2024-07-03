package IntimeTestCases;

import java.io.IOException;


import org.testng.annotations.Test;

import IntimePages.LoginPage;

public class loginTest extends baseClass
{

	@Test
	public void login() throws IOException
	{
		LoginPage lp = new LoginPage(d);
		lp.selectUser("Ajay Kashamirchand Sharma", "1111");
		printScreen.takeprintScreen(d);
	}
	
	
	
	
	
	
	
}
