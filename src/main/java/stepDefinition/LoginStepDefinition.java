/*
 * package stepDefinition;
 * 
 * import org.junit.Assert; import org.openqa.selenium.By; import
 * org.openqa.selenium.JavascriptExecutor; import org.openqa.selenium.WebDriver;
 * import org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.interactions.Actions; import
 * org.openqa.selenium.support.ui.Select;
 * 
 * import cucumber.api.java.en.Given; import cucumber.api.java.en.Then; import
 * cucumber.api.java.en.When; import io.github.bonigarcia.wdm.WebDriverManager;
 * 
 * public class LoginStepDefinition {
 * 
 * WebDriver driver;
 * 
 * @Given("^user is already on Login Page$") public void
 * user_already_on_login_page() { WebDriverManager.chromedriver().setup(); //
 * System.setProperty("webdriver.chrome.driver","C://Browsers/chromedriver");
 * driver = new ChromeDriver();
 * driver.get("https://classic.freecrm.com/index.html?e=1"); }
 * 
 * @When("^title of login page is Free CRM$") public void
 * title_of_login_page_is_free_CRM() { String title = driver.getTitle();
 * System.out.println(title); Assert.
 * assertEquals("Free CRM - CRM software for customer relationship management, sales, and support."
 * , title); }
 * 
 * // Reg Exp: //1. \"([^\"]*)\" //2. \"(.*)\"
 * 
 * @Then("^user enters \"(.*)\" and \"(.*)\"$") public void
 * user_enters_username_and_password(String username, String password) {
 * driver.findElement(By.name("username")).sendKeys(username);
 * driver.findElement(By.name("password")).sendKeys(password); }
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
 * @Then("^user moves to new contact page$") public void
 * user_moves_to_new_contact_page() {
 * 
 * driver.switchTo().frame("mainpanel"); Actions action = new Actions(driver);
 * action.moveToElement(driver.findElement(By.xpath(
 * "//a[contains(text(),'Contacts')]"))).build().perform();
 * driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
 * 
 * }
 * 
 * @Then("^user enters \"(.*)\" and \"(.*)\" details$") public void
 * user_enters_contact_details(String firstname, String lastname) {
 * driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(firstname)
 * ; driver.findElement(By.xpath("//input[@id='surname']")).sendKeys(lastname);
 * Select category= new
 * Select(driver.findElement(By.xpath("//select[@name='category']")));
 * category.selectByVisibleText("Key Contact"); driver.findElement(By.xpath(
 * "//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/input[2]")).click(); }
 * 
 * @Then("^Close the browser$") public void close_the_browser() { driver.quit();
 * }
 * 
 * }
 */