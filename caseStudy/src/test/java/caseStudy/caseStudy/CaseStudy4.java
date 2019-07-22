package caseStudy.caseStudy;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CaseStudy4
{
	
	
	
	 public static WebDriver driver;

	 @Given("Alex has registered into TestMeApp")
	 public void Alex_has_registered_into_TestMeApp() {

	 System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Prakash\\chromedriver_win32\\chromedriver.exe");
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://192.168.40.4:8083/TestMeApp1");
	  driver.findElement(By.xpath(".//a[contains(text(),\"SignIn\")]")).click();
	  
	  //List<Map<String, String>> list=dataTable.asMaps(String.class,String.class);

		 driver.findElement(By.name("userName")).sendKeys("Lalitha");
		 driver.findElement(By.name("password")).sendKeys("Password123");
		 driver.findElement(By.name("Login")).click();
	 }

//	 @Given("Click SignIn")
//	 public void click_SignIn() {
//
//	 
//	  
//	 }
//
//	 @Given("Enter valid credentials")
//	 public void enter_valid_credentials(io.cucumber.datatable.DataTable dataTable) {
//
//	
//
//
//	 }
//
//	 @Then("Click Login")
//	 public void click_Login() {
//	 
//	   
//	 }

	 @When("Alex search a particular product like headphones")
	 public void alex_search_for_the_particular_product_like_headphones() {
		 driver.findElement(By.id("myInput")).sendKeys("HeadPhone");
		 driver.findElement(By.xpath(".//input[@value=\"FIND DETAILS\"]")).click();
	 }

	 @When("try to proceed to payment without adding any item in the cart")
	 public void try_to_proceed_to_pay_without_adding_any_item_in_the_cart() {


	 if (driver.findElements(By.cssSelector("i.fa.fa-shopping-cart")).size()!=0) {

	 driver.findElement(By.cssSelector("i.fa.fa-shopping-cart")).click();
	 }
	 else {
	 System.out.println("\n\nICON NOT VISIBLE\n\n");
	 }






	 }

	 @Then("TestMeApp dosen't display the cart icon")
	 public void testme_doesn_t_display_the_cart_the_icon() {

	 Assert.assertEquals(0, driver.findElements(By.cssSelector("i.fa.fa-shopping-cart")).size());
	 
	 driver.quit();
	   
	 }


}
