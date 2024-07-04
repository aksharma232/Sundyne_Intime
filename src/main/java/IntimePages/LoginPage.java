package IntimePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class LoginPage {
	WebDriver d;

	public LoginPage(WebDriver d) {
		this.d = d;
		PageFactory.initElements(d, this);
	}

	@FindBy(id = "ddlUserID")
	WebElement UserID;

	@FindBy(id = "txtPassword")
	WebElement password;

	@FindBy(id = "LoginHTML")
	WebElement loginbutton;

	@FindBy(id = "LogOutHTML")
	WebElement logoutbutton;

	public void selectUser(String userName, String passwrd) throws Exception {
		Select st = new Select(UserID);
		st.selectByVisibleText(userName);
		password.sendKeys(passwrd);
		loginbutton.click();
		Assert.assertTrue(loginbutton.isDisplayed());
	}

}
