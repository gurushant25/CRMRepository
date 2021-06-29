package stepDefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.base.Strings;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DealsDefinitionPage {
	
	/*
	 * WebDriver driver;
	 * 
	 * @Given("^user is already on Login Page$") public void
	 * user_already_on_login_page() { WebDriverManager.chromedriver().setup();
	 * driver = new ChromeDriver();
	 * driver.get("https://classic.freecrm.com/index.html?e=1"); }
	 * 
	 * @When("^title of login page is Free CRM$") public void
	 * title_of_login_page_is_free_CRM() { String title = driver.getTitle();
	 * System.out.println(title); Assert.
	 * assertEquals("Free CRM - CRM software for customer relationship management, sales, and support."
	 * , title); }
	 * 
	 * @Then("^user enters username and password$") public void
	 * user_enters_username_and_password(DataTable credentials) { List<List<String>>
	 * data=credentials.raw();
	 * driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
	 * driver.findElement(By.name("password")).sendKeys(data.get(0).get(1)); }
	 * 
	 * @Then("^user clicks on login button$") public void
	 * user_clicks_on_login_button() { WebElement loginBtn =
	 * driver.findElement(By.xpath("//input[@type='submit']")); JavascriptExecutor
	 * js = (JavascriptExecutor) driver; js.executeScript("arguments[0].click();",
	 * loginBtn); }
	 * 
	 * @Then("^user is on home page$") public void user_is_on_hopme_page() { String
	 * title = driver.getTitle(); System.out.println("Home Page title ::" + title);
	 * Assert.assertEquals("CRMPRO", title); }
	 * 
	 * @Then("^user moves to deals page$") public void user_moves_to_deals_page() {
	 * 
	 * driver.switchTo().frame("mainpanel"); Actions action = new Actions(driver);
	 * action.moveToElement(driver.findElement(By.xpath(
	 * "//a[contains(text(),'Deals')]"))).build().perform();
	 * driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
	 * 
	 * }
	 * 
	 * @Then("^user enters deals details$") public void
	 * user_enters_deals_details(DataTable details) { List<List<String>>
	 * data=details.raw();
	 * driver.findElement(By.id("title")).sendKeys(data.get(0).get(0));
	 * driver.findElement(By.xpath("//input[@name='amount']")).sendKeys(data.get(0).
	 * get(1));
	 * driver.findElement(By.id("probability")).sendKeys(data.get(0).get(1));;
	 * driver.findElement(By.xpath("//input[@type='submit'][@value='Save']")).click(
	 * ); }
	 * 
	 * @Then("^Close the browser$") public void close_the_browser() { driver.quit();
	 * }
	 */
}
