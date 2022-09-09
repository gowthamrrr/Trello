package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Trello.Creative.baseclass;

public class Login_Page  {
	
	@FindBy(id="user")
	private WebElement Mailid;
	
	
	
	
	@FindBy(name="password")
	private WebElement Password;
	
	@FindBy(id = "login-submit")
	private WebElement loginsubmit;
	
	public WebElement getLoginsubmit() {
		return loginsubmit;
	}

	public void setLoginsubmit(WebElement loginsubmit) {
		this.loginsubmit = loginsubmit;
	}

	@FindBy(id="login")
	private WebElement login;

	public WebElement getMailid() {
		return Mailid;
	}

	public void setMailid(WebElement mailid) {
		Mailid = mailid;
	}

	public WebElement getPassword() {
		return Password;
	}

	public void setPassword(WebElement password) {
		Password = password;
	}

	public WebElement getLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		this.login = login;
	}

	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
}
