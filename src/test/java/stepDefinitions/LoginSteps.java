package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    WebDriver driver;


    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @When("I open website homepage")
    public void i_open_website_homepage() {
        driver.get("https://mvnrepository.com/");
    }
    @Then("I verify logo on homepage")
    public void i_verify_logo_on_homepage() {
        boolean status = driver.findElement(By.xpath("//*[@id=\"logo\"]/a")).isDisplayed();
        Assert.assertEquals(true, status);
    }
    @And("close browser")
    public void close_browser() {
        driver.quit();
    }
}
