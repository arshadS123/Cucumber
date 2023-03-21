package com.Cucumber_one1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass1 {

	public static WebDriver driver;

	public static WebDriver BrowserLunch(String value) {
		if (value.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new  ChromeDriver();
		} else if (value.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (value.equalsIgnoreCase("opera")) {
			System.setProperty("webdriver.opera.driver", System.getProperty("user.dir") + "\\Driver\\operadriver.exe");
			driver = new OperaDriver();
		}
		return driver;
	}

	public static void Inputelement(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static void Urllunch(String value) {
		driver.get(value);

	}

	public static void Windowsmaximize() {
		driver.manage().window().maximize();

	}

	public static void Wait() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	public static void Screenshot(String name) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File loc = new File("C:\\Users\\User\\eclipse-workspace\\Maven\\Screenshot" + name + ".png");
		FileUtils.copyFile(src, loc);

	}

	public static void Dropdown(WebElement element, String option, String svalue) {

		Select s = new Select(element);

		if (option.equalsIgnoreCase("value")) {
			s.selectByValue(svalue);
		} else if (option.equalsIgnoreCase("Visibletext")) {
			s.selectByVisibleText(svalue);
		} else if (option.equalsIgnoreCase("index")) {
			int parseInt = Integer.parseInt(svalue);
			s.selectByIndex(parseInt);
		}
	}

	// Navigate to
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	// Close
	public static void close() {
		driver.close();
	}

	// Quit
	public static void quit() {
		driver.quit();
	}

	// Frame
	public static void frames(WebElement element) {
		driver.switchTo().frame(element);
	}

	// Default Frame
	public static void degaultFrames() {
		driver.switchTo().defaultContent();
	}

	// Alert
	public static void alert(WebElement element) {
		driver.switchTo().alert().accept();
	}

	// Navigate Options
	public static void navigateOptions(String Option) {
		if (Option.equalsIgnoreCase("forward")) {
			driver.navigate().forward();
		} else if (Option.equalsIgnoreCase("back")) {
			driver.navigate().back();
		} else if (Option.equalsIgnoreCase("refresh")) {
			driver.navigate().refresh();
		}
	}

	// isEnalbe
	private static void isCheck(WebElement element, String option) {
		if (option.equalsIgnoreCase("enable")) {
			boolean enabled = element.isEnabled();
			System.out.println(enabled);
		} else if (option.equalsIgnoreCase("disable")) {
			boolean displayed = element.isDisplayed();
			System.out.println(displayed);
		} else if (option.equalsIgnoreCase("selected")) {
			boolean selected = element.isSelected();
			System.out.println(selected);
		}
	}

	public static void Actionsmethods(String Option, WebElement element, WebDriver driver) {

		Actions ac = new Actions(driver);
		if (Option.equalsIgnoreCase("Click")) {
			ac.click(element).build().perform();

		} else if (Option.equalsIgnoreCase("MovetoElement")) {
			ac.moveToElement(element).build().perform();

		} else if (Option.equalsIgnoreCase("Clickandhold")) {
			ac.clickAndHold(element).perform();

		} else if (Option.equalsIgnoreCase("Contextclick")) {
			ac.contextClick(element).perform();

		} else if (Option.equalsIgnoreCase("Doubleclick")) {
			ac.doubleClick(element).perform();

		} else if (Option.equalsIgnoreCase("Release")) {
			ac.release(element).perform();
		}
	}

	public static void Draganddrop(WebElement element, WebElement element1, WebDriver driver) {

		Actions ac = new Actions(driver);

		ac.dragAndDrop(element, element1).build().perform();

	}

	// Scroll
	public static void scrollUpDown(String Value, String Value1) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + Value + "," + Value1 + ")");

	}

	public static void robotAction(String options) throws Exception {

		Robot r = new Robot();
		if (options.equalsIgnoreCase("up")) {
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
		} else if (options.equalsIgnoreCase("down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);

		} else if (options.equalsIgnoreCase("right")) {
			r.keyPress(KeyEvent.VK_RIGHT);
			r.keyRelease(KeyEvent.VK_RIGHT);

		} else if (options.equalsIgnoreCase("left")) {
			r.keyPress(KeyEvent.VK_LEFT);
			r.keyRelease(KeyEvent.VK_LEFT);

		}
	}

	public static void robotActionPress(String options) throws Exception {
		Robot r = new Robot();
		if (options.equalsIgnoreCase("shift")) {
			r.keyPress(KeyEvent.VK_SHIFT);
		} else if (options.equalsIgnoreCase("CONTROL")) {
			r.keyPress(KeyEvent.VK_CONTROL);
		} else if (options.equalsIgnoreCase("ALT")) {
			r.keyPress(KeyEvent.VK_ALT);
		}
	}
	public static void robotActionRelease(String options) throws Exception {
		Robot r = new Robot();
		if (options.equalsIgnoreCase("shift")) {
			r.keyRelease(KeyEvent.VK_SHIFT);
		} else if (options.equalsIgnoreCase("CONTROL")) {
			r.keyRelease(KeyEvent.VK_CONTROL);
		} else if (options.equalsIgnoreCase("ALT")) {
			r.keyRelease(KeyEvent.VK_ALT);
		}
	}
}