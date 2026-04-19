package com.edureka.stepDefinition;

import java.io.IOException;


import com.edureka.utility.AllFunctionality;
import com.edureka.utility.Base;
import com.edureka.utility.Pages;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends AllFunctionality {
	
	private Base base;
	
	public Hook(Base base) {
		this.base = base;
	}
	
	@Before
	public void setUp() throws IOException {
//		base.driver = new EdgeDriver();
		base.initDriver();
		
		initPropertiesUtility("./src/main/resources/edureka.properties");
		String URL = getPropertyData("url");
//		String USERNAME = getPropertyData("username");
//		String PASSWORD = getPropertyData("password");
		
		setMaximizeBrowser(base.getDriver());
		implicitlyWait(base.getDriver(), 5);
		
		
		base.getDriver().get(URL);
		
		Pages.loadAllPages(base.getDriver());
		
	}
	
	@After
	public void tearDown(){

//		base.driver.quit();
		base.getDriver().quit();
	}
}
