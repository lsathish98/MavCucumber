package org.practice;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( features="F:\\Selenium Practice\\MavCucumber\\login.feature", glue="org.practice", strict=false, monochrome=true, dryRun=false,
					plugin= {"html:target"}, tags= {"@tag1"}	)
public class Runner {

}
