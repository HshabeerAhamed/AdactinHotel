package org.adactinpage;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", 
                 glue = "org.adactinpage", 
                 dryRun = false,
                 monochrome = true,
                 plugin = {"pretty",
                		   "html:target\\Reports",
                		   "json:target\\Reports\\output.json",
                		   "junit:target\\Reports\\ad.xml"
                		   })
                 
public class Run extends Base0
{
	@AfterClass
	public static void report() 
	{
		generatejvmreport(System.getProperty("user.dir")+"\\target\\Reports\\output.json");
	}
}

