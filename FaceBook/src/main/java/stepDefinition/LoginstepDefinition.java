package stepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class LoginstepDefinition {

	
  public WebDriver driver;
	 
	@Given("^user should enter the url$")
	public void user_present_on_login_page() throws Throwable {
		Thread.sleep(2000);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\"
				+ "FaceBook\\Chrome\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.facebook.com/");
	  
	  //driver.get("https://www.flipkart.com/");
	}
	
	
	@When("^title of the page is facebook$")
	public void title_of_the_page_is_facebook() throws Throwable  {
		Thread.sleep(2000);
	    String title = driver.getTitle();
	    
	    System.out.println(title);
	Assert.assertEquals("Facebook – log in or sign up", title);
	}
	
	
	@Then("^user should enter email and password$")
	public void user_should_enter_email_and_password() throws Throwable  {
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("jayeshkani25@gmail.com");
		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("$XSM7#@25");
	}

	@Then("^user should click on login button$")
	 public void   user_should_click_on_login_button() throws Throwable {
		Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@name='login']")).click();

	}
	
	
	
//	@Then("^user clicks on login button$")
//	 public void user_clicks_on_login_button() throws InterruptedException {
//		Thread.sleep(2000);
//	 WebElement loginBtn =
//	 driver.findElement(By.xpath("//*[@name='login']"));
//	 JavascriptExecutor js = (JavascriptExecutor)driver;
//	 js.executeScript("arguments[0].click();", loginBtn);
//	 }

//	@Then("^user is on home page$")
//	public void user_is_on_hopme_page() throws Throwable {
//		Thread.sleep(2000);
//		String title = driver.getTitle();
//		System.out.println("Home Page title ::" + title);
//		Assert.assertEquals("Facebook – log in or sign up", title);
//  }

	
}
