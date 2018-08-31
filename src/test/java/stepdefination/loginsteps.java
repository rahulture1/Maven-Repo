package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginsteps {
	
	WebDriver driver;
	
	@Given("^Navigate to \"([^\"]*)\"$")
	public void navigate_to(String arg1) throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(arg1);
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    
	}

	@Given("^User should click on signin$")
	public void user_should_click_on_signin() throws Throwable {
	    driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[1]")).click();
	}

	@When("^user enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enter_username_and_password(String arg1, String arg2) throws Throwable {
		driver.findElement(By.xpath(".//*[@id='ap_email']")).sendKeys(arg1);
		driver.findElement(By.xpath(".//*[@id='ap_password']")).sendKeys(arg2);
	}

	@When("^click on Login button$")
	public void click_on_Login_button() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='signInSubmit']")).click();
	}

	@Then("^User must navigate to home page$")
	public void user_must_navigate_to_home_page() throws Throwable {
	    System.out.println("Successfully login");
	}
}
