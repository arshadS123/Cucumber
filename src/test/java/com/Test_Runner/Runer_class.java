package com.Test_Runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Cucumber_one1.Baseclass1;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\User\\eclipse-workspace\\Cucumber_pro\\src\\test\\java\\com\\Features\\Nykaaa.feature",glue = "com.StepDefinition")
public class Runer_class{
	public static  WebDriver driver;
	
	@BeforeClass
	public static void Set_up() {
 driver = Baseclass1.BrowserLunch("chrome");
	}
}



