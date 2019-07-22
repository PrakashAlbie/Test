package caseStudy.caseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.When;

public class CaseStudy2 
{
	public static WebDriver driver; 
	@When("I click on Sigin")
	public void i_click_on_Sigin() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Prakash\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("http:192.168.40.4:8083/TestMeApp");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("SignIn")).click();
		
	   
	}

	@When("I provide userName {string}")
	public void i_provide_userName(String string) {
	    driver.findElement(By.xpath(".//input[@name=\"userName\"]")).sendKeys(string);
	}

	@When("I provide Password {string}")
	public void i_provide_Password(String string) {
		driver.findElement(By.xpath(".//input[@name=\"password\"]")).sendKeys(string);
	}

	@When("I click on Login")
	public void i_click_on_Login() {
		driver.findElement(By.xpath(".//input[@name=\"Login\"]")).click();
	   
	}

}
