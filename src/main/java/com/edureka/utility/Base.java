package com.edureka.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
	
	private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public void initDriver() {
        driver.set(new EdgeDriver());
    }

    public WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
	
}
