package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class Facebook {
	
	public static String chromeDriverPath="F:\\Selenium Practice\\MavCucumber\\driver\\chromedriver.exe";
	public static WebDriver driver;
	public static String url="https://www.facebook.com/";
	
	@Given("^the user in fb page$")
	public void the_user_in_fb_page() {
	    System.setProperty("webdriver.chrome.driver", chromeDriverPath);
	    driver=new ChromeDriver();
	    driver.get(url);
	    driver.manage().window().maximize();	    
	}

	@When("^the user enter credentials \"([^\"]*)\" , \"([^\"]*)\"$")
	public void the_user_enter_credentials(String userid, String password) {
	    driver.findElement(By.id("email")).sendKeys(userid);
	    driver.findElement(By.cssSelector("[name='pass']")).sendKeys(password);
	    driver.findElement(By.cssSelector("[value='Log In']")).click();
	}

	@Then("^the user prompts to fb page$")
	public void the_user_prompts_to_fb_page() {
	    driver.quit();
	}

}
