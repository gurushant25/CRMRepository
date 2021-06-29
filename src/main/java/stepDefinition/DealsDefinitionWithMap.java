package stepDefinition;

import java.util.List;
import java.util.Map;

import javax.annotation.RegEx;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DealsDefinitionWithMap {
	WebDriver driver;
	
	@Before
	public void setup() {
		System.out.println("Starting test");
		}
	@After
	public void close() {
		System.out.println("closing test");
	}
	@Given("^user is already on Login Page$")
	public void user_already_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html?e=1");
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_free_CRM() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Free CRM - CRM software for customer relationship management, sales, and support.", title);
	}

	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials) {
		List<Map<String,String>> data = credentials.asMaps(String.class,String.class);
		driver.findElement(By.name("username")).sendKeys(data.get(0).get("username"));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get("password"));
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);
	}

	@Then("^user is on home page$")
	public void user_is_on_hopme_page() {
		String title = driver.getTitle();
		System.out.println("Home Page title ::" + title);
		Assert.assertEquals("CRMPRO", title);
	}

	@Then("^user moves to deals page$")
	public void user_moves_to_deals_page() {

		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
		
	}
	@Then("^user enters deals details$")
	public void user_enters_deals_details(DataTable details) {
		for(Map<String ,String> data:details.asMaps(String.class, String.class)) {
	driver.findElement(By.id("title")).sendKeys(data.get("deal name"));
	driver.findElement(By.xpath("//input[@name='amount']")).sendKeys(data.get("amount"));
	driver.findElement(By.id("probability")).sendKeys(data.get("probability"));
	driver.findElement(By.xpath("//input[@type='submit'][@value='Save']")).click();
	
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
	driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
	
	}
	}
	@Then("^Close the browser$")
	public void close_the_browser() {
		driver.quit();
	}

}
