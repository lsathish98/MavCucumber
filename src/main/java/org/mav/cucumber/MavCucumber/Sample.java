package org.mav.cucumber.MavCucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sample {
	
	public static WebDriver driver;
	
	@Given("^The user is in FB login page$")
	public void the_user_is_in_FB_login_page() {
	   System.setProperty("webdriver.chrome.driver", "F:\\Selenium Practice\\MavCucumber\\driver\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://www.facebook.com");
	    
	}

	@When("^The user enter valid credentials$")
	public void the_user_enter_valid_credentials() {
	    driver.findElement(By.id("email")).sendKeys("java");
	    driver.findElement(By.id("pass")).sendKeys("java");
	    
	}

	@Then("^The user prompts to FB home page$")
	public void the_user_prompts_to_FB_home_page() {
		driver.findElement(By.cssSelector("[value='Log In']")).click();
		WebElement fe = driver.findElement(By.xpath("//span[text()='Log in to Facebook']"));
		String txt = fe.getText();
		Assert.assertEquals("Log in to Facebook", txt);
		
	}

}
