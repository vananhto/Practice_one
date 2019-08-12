package step_definitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import data.DriverData;
import page.DriverPage;
import util.PageStore;
import util.Specification;


public class CreateDriver_Steps {
	public WebDriver driver;
	Specification user;
	PageStore pageStore;
	DriverData data;
	DriverPage driverPage;
	public CreateDriver_Steps() {
		//this.builder = new LoginDetailBuilder();
		//this.dashBoardBuilder = new DashBoardBuilder();
		this.driver = Hooks.driver;
		this.pageStore = new PageStore(driver);
		//this.user = new Specification(pageStore);
		this.data = new DriverData();
	}
	
	@Given("^I open driver page \"(.*)\"$")
	public void i_open_driver_screen(String driver_link){
		driver.get(driver_link);
	}
	
	@When("^I click button to open create new driver screen$")
	public void i_click_new_driver_button(){
		driver.findElement(By.cssSelector(".btn.l-create")).click();
	}
	
	@And ("^I enter a valid driver code$")
	public void i_enter_a_valid_driver_code(){
		WebElement driver_code = driver.findElement(By.id("code"));
		driver_code.clear();
		driver_code.sendKeys(data.driverCode());
	}
	
	@And ("^I enter a valid driver full name$")
	public void i_enter_a_valid_driver_name(){
		WebElement full_name = driver.findElement(By.id("full_name"));
		full_name.clear();
		full_name.sendKeys(data.driverName());
	}

	@And("^I enter a valid driver mobile number$")
	public void i_enter_a_avlid__mobile_number(){
		WebElement mobileNo= driver.findElement(By.id("mobile_no"));
		mobileNo.clear();
		mobileNo.sendKeys(data.driverMobileNo());
	}
	
	@And("^I enter a valid driver id number$")
	public void i_input_driver_id_number(){
		WebElement idNo= driver.findElement(By.id("id_no"));
		idNo.clear();
		idNo.sendKeys(data.driveriDNo());
	}
	

	
}
