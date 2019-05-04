package org.mav.cucumber.MavCucumber;



import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class TryEvery {

	static WebDriver driver;
	
	@Given("^the user in FB login page$")
	public void the_user_in_FB_login_page() {
	    System.setProperty("webdriver.chrome.driver", "F:\\Selenium Practice\\MavCucumber\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	}

	@When("^the user enter invalid credentials$")
	public void the_user_enter_invalid_credentials(DataTable Credentials)  {
	    List<String> credentialList = Credentials.asList(String.class);
	    driver.findElement(By.id("email")).sendKeys(credentialList.get(0));
	    driver.findElement(By.id("pass")).sendKeys(credentialList.get(1));
	    driver.findElement(By.cssSelector("[value='Log In']")).click();
	}

	@Then("^the user does not prompts to FB home page$")
	public void the_user_does_not_prompts_to_FB_home_page() {
		Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Log in to Facebook']")).getText().equals("Log in to Facebook"));
		driver.quit();
	}

}
