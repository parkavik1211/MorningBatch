package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.Report;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature",
glue="org\\stepdefinition",
monochrome=true,
dryRun=false,
strict=true,
snippets=SnippetType.CAMELCASE,
plugin= {"html:target","junit:JunitReport\\JunitRepo.xml","json:JsonReport\\JsonRepo.json"})

public class TestRunner {
	
	@AfterClass
	
	public static void report() {
		Report.createJvmReport("C:\\Users\\HP\\eclipse-workspace\\Cucumber\\JsonReport\\JsonRepo.json");

	}
	
	
	
	
	
	

}
