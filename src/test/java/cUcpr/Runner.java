package cUcpr;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



//@RunWith(Cucumber.class)


@RunWith(Cucumber.class)

@CucumberOptions(features="classpath:Feature/Search.feature",

/*@CucumberOptions(
features = "classpath:Feature/login.feature",*/
plugin = {"pretty","html:target/cucumber-html-report"})

public class Runner{
	
}
