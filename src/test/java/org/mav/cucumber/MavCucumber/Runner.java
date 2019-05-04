package org.mav.cucumber.MavCucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="F:\\Selenium Practice\\MavCucumber\\Try.feature" , glue= {"org.mav.cucumber.MavCucumber"} , plugin= {"html:target"}, dryRun=false,
monochrome=true)

public class Runner {

}
