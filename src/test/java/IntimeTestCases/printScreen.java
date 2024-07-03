package IntimeTestCases;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class printScreen
{
	
	public static void takeprintScreen(WebDriver d) throws IOException
	{
		TakesScreenshot tks = (TakesScreenshot)d;
		File src = tks.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir")+"//screenshot//"+"Time.png");
		FileUtils.copyFile(src, dest);
	}
		
	
}
