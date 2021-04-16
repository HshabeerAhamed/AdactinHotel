package org.adactinpage;

import java.io.IOException;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends Base0
{
    @Before
    public void start()
    {
    	System.out.println("START");
    	loadUrl();
    	maximize();
    }
    @After
    public void end(Scenario s) throws IOException
    {
    	
    	String name = s.getName();
    	String fileName = name.replace(" ", "_");
    	toTakeScreenSot(fileName);
    	System.out.println("END");
    }
}
