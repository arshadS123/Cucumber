package com.StepDefinition;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import com.Cucumber_one1.Baseclass1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class StepDefinition extends Baseclass1{


	@Given("user launch the Nykaa link")
	public void user_launch_the_nykaa_link() {
		Wait();
		Windowsmaximize();
	  Urllunch("https://www.nykaa.com/"); 
	  
	}

	@Given("user click the Signin button in Signin field")
	public void user_click_the_signin_button_in_signin_field() {
	
	   WebElement Signinmob = driver.findElement(By.xpath("//*[@id=\"header_id\"]/div[2]/div/div[2]/div[1]/div[2]/div[3]/button[1]"));
			   Signinmob.click();
	   
	}

	@Given("enter the Mobile num in number field")
	public void enter_the_mobile_num_in_number_field() {
		WebElement mobnum = driver.findElement(By.name("emailMobile"));
		Inputelement(mobnum, "9677140016");
		
	   
}
	
	@Given("click the Prceed button in button field")
	public void click_the_prceed_button_in_button_field() {
	    WebElement proceed = driver.findElement(By.id("submitVerification"));
	    proceed.click();
	}

	@Given("enter the Otp pin in otp field")
	public void enter_the_otp_pin_in_otp_field() {
	   Scanner s = new Scanner(System.in);
	   String otp = s.nextLine();
	   driver.findElement(By.name("otpValue")).sendKeys(otp);
	}

	@Given("click the verify button in verification field")
	public void click_the_verify_button_in_verification_field() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}
	
	@Given("user add the Product to the Bag")
public void user_add_the_product_to_the_bag() {
		Actions ac = new Actions(driver);

   WebElement search = driver.findElement(By.xpath("//*[@id=\"headerMenu\"]/div[2]/div[1]/div"));
Actionsmethods("MovetoElement", search, driver);
search.click();
driver.findElement(By.xpath("//*[@id=\"headerMenu\"]/div[2]/div[2]/div/ul/li[2]")).click();
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("(window.scroll(0,1000));");
driver.findElement(By.xpath("//*[@id=\"product-list-wrap\"]/div[1]/div/div[2]/div/button[2]")).click();
driver.findElement(By.xpath("//*[@id=\"product-list-wrap\"]/div[3]/div/div[2]/div/button[2]")).click();
}


	
	}
     
   
	

	
	
	
	
	
	
	
	
	
	
	
