package caseStudy.caseStudy;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CaseStudy1 {
	
	public static WebDriver driver;
	
	@Given("Login to TestMe App with location {string} and url {string}")
	public void login_to_TestMe_App_with_location_and_url(String string, String string2) {
		
		
		System.setProperty("webdriver.chrome.driver",string );
		
		driver=new ChromeDriver();
		
		driver.get(string2);
		driver.manage().window().maximize();
		System.out.println("Launch Chrome to TestMe");
	}

	@When("I click on SignUp")
	public void i_click_on_SignUp() {
		
		driver.findElement(By.partialLinkText("SignUp")).click();
	}

	@When("Provide valid Credentials")
	public void provide_valid_Credentials(io.cucumber.datatable.DataTable dataTable) {
		
		List<Map<String,String>> list = dataTable.asMaps(String.class,String.class);
		
		driver.findElement(By.name("userName")).sendKeys(list.get(0).get("userName"));
		driver.findElement(By.name("firstName")).sendKeys(list.get(0).get("fstName"));
		driver.findElement(By.name("lastName")).sendKeys(list.get(0).get("lstName"));
		driver.findElement(By.name("password")).sendKeys(list.get(0).get("password"));
		driver.findElement(By.name("confirmPassword")).sendKeys(list.get(0).get("confirmPassword"));

		switch (list.get(0).get("gender")) {
		case "Male":

			driver.findElement(By.xpath(".//span[text()=\"Male\"]")).click();
		break;

		case "Female":

		     driver.findElement(By.xpath(".//input[@value=\"Female\"]")).click();
		break;
		}

		driver.findElement(By.name("emailAddress")).sendKeys(list.get(0).get("email"));
		driver.findElement(By.name("mobileNumber")).sendKeys(list.get(0).get("mobNo"));
		driver.findElement(By.name("dob")).sendKeys(list.get(0).get("dob"));
		driver.findElement(By.name("address")).sendKeys(list.get(0).get("address"));

		switch (list.get(0).get("securityQuestion")) {

		case "What is your Birth Place?":

		Select security1=new Select(driver.findElement(By.name("securityQuestion")));
		security1.selectByVisibleText("What is your Birth Place?");
		break;

		case "What is your favour color?":

		Select security2=new Select(driver.findElement(By.name("securityQuestion")));
		security2.selectByVisibleText("What is your favour color?");
		break;
		
		case "What is your Pet Name?":

		Select security3=new Select(driver.findElement(By.name("securityQuestion")));
		security3.selectByVisibleText("What is your Pet Name?");
		break;
		
		case "What is your Nick Name?":

		Select security4=new Select(driver.findElement(By.name("securityQuestion")));
		security4.selectByVisibleText("What is your Nick Name?");
		break;

		}


		driver.findElement(By.name("answer")).sendKeys(list.get(0).get("securityAnswer"));
		  

	   
	}
	@Then("Click on Register")
	public void Click_on_Register()
	{
		driver.findElement(By.name("Submit")).click();
	}


}
