package org.mav.cucumber.MavCucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoAutomation {
	
	static WebDriver driver;
	static Select s=null;

@Given("^The user is in Demo Automation page$")
public void the_user_is_in_Demo_Automation_page() {
	 System.setProperty("webdriver.chrome.driver", "F:\\Selenium Practice\\MavCucumber\\driver\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://www.facebook.com");
	   driver.manage().window().maximize();
    }


@When("^The user enter the appropriate fields \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
public void the_user_enter_the_appropriate_fields(String fname, String sname, String email, String remail, String pwd, String Bdate, String BMonth, String Byear) {
	//| FirstName  | SurName |Email Address | New Password | BDate | BMonth | BYear | 
		driver.findElement(By.cssSelector("[name='firstname']")).sendKeys(fname);
		driver.findElement(By.cssSelector("[name='lastname']")).sendKeys(sname);
		driver.findElement(By.cssSelector("[name='reg_email__']")).sendKeys(email);
		driver.findElement(By.cssSelector("[name='reg_email_confirmation__']")).sendKeys(remail);
		driver.findElement(By.cssSelector("[name='reg_passwd__']")).sendKeys(pwd);
		
		WebElement BirthDate = driver.findElement(By.cssSelector("[id='day']"));
		s=new Select(BirthDate);
		s.selectByVisibleText(Bdate);
		
		WebElement BirthMonth = driver.findElement(By.cssSelector("[id='month']"));
		s=new Select(BirthMonth);
		s.selectByVisibleText(BMonth);
		
		WebElement BirthYear = driver.findElement(By.cssSelector("[id='year']"));
		s=new Select(BirthYear);
		s.selectByVisibleText(Byear);
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
}


@Then("^The user must be able to Register successfully$")
public void the_user_must_be_able_to_Register_successfully() {
	
	driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();   
}

}
