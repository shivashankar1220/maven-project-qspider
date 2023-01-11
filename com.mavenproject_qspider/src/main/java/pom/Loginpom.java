package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Loginpom {
	//identifing the username
	@FindBy(id = "username")
	private WebElement username;
	//identifing the password
	@FindBy(name = "pwd")
	private WebElement password;
	//identifing the login 
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement login;
	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	public Loginpom(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void perform_operation(String un,String pwd)
	{
		getUsername().sendKeys(un);
		//username.sendKeys(un);
		//password.sendKeys(password);
		getPassword().sendKeys(pwd);
		//login.click();
	}
}
