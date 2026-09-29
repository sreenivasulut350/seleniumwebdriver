package day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class loginPagewithpagefactory {
	
	WebDriver driver;
	
	//Constractor
	loginPagewithpagefactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locators

	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txt_username_loc;
	//@FindBy(how=How.XPATH, using="//input[@placeholder='Username']")
	//WebElement txt_username_loc;
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_pwd_loc;
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btn_login_loc;
	
	//Action methods
	
	public void setUsername(String username)
	{
		txt_username_loc.sendKeys(username);
	}
	
	public void setPassword(String pwd)
	{
		txt_pwd_loc.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		btn_login_loc.click();
	}

}
