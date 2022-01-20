package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Script1 {

	//ChromeDriver driver = new ChromeDriver();
	WebDriver driver;
	@Given("Open chrome browser and url of the application")
	public void open_chrome_browser_and_url_of_the_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\Chromedriver updated version\\chromedriver.exe");
		
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/login/show.do");

	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Enter {string} , {string} and click on login button")
	public void enter_and_click_on_login_button(String Username, String Password) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("userName")).sendKeys(Username);
		driver.findElement(By.id("submitBtn")).click();
		
		
	}

	@Then("Success in login")
	public void success_in_login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Then Done");
	}

}
