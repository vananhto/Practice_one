package step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import domain.builder.account.LoginDetailBuilder;
import domain.builder.task.DashBoardBuilder;
import page.DriverPage;
import util.PageStore;
import util.Specification;

public class CreateNewDriver_Steps {
	public WebDriver driver;
	Specification user;
	PageStore pageStore;
	DriverPage driverPage;
	
	public CreateNewDriver_Steps() {
		//this.builder = new LoginDetailBuilder();
		//this.dashBoardBuilder = new DashBoardBuilder();
		this.driver = Hooks.driver;
		this.pageStore = new PageStore(driver);
		this.user = new Specification(pageStore);
		this.driverPage = new DriverPage(driver);
	}
	
	@And("^I open driver screen \"(.*)\"$")
	public void i_open_driver_screen(String driver_link){
		driver.get(driver_link);
	}
	
	@And("^I click create new driver button$")
	public void i_click_new_driver_button(){
		driver.findElement(By.cssSelector(".btn.l-create")).click();
	}
	
	@When("^I input driver code \"(.*)\"$")
	public void i_input_driver_code( String driverCode){
		WebElement driver_code = driver.findElement(By.id("code"));
		driver_code.clear();
		driver_code.sendKeys(driverCode);
		
	}
	
	@And("^I input full name of driver \"(.*)\"$")
	public void i_input_full_name_of_driver(String fullName){
		WebElement full_name = driver.findElement(By.id("full_name"));
		full_name.clear();
		full_name.sendKeys(fullName);
	}
	
	@And("^I input driver mobile no \"(.*)\"$")
	public void i_input_driver_mobile_number(String mobile_no){
		WebElement mobileNo= driver.findElement(By.id("mobile_no"));
		mobileNo.clear();
		mobileNo.sendKeys(mobile_no);
	}
	
	
	@And("^I input driver id no \"(.*)\"$")
	public void i_input_driver_id_number(String id_no){
		WebElement idNo= driver.findElement(By.id("id_no"));
		idNo.clear();
		idNo.sendKeys(id_no);
	}
	@And("^I save driver info$")
	public void i_click_save_driver_info(){
		((JavascriptExecutor) driver)
	     .executeScript("window.scrollTo(0, document.body.scrollHeight)");
		WebElement btnSave = driver.findElement(By.cssSelector(".btn.btn-success"));
		btnSave.click();
	}
	
	@And("^I confirm to save$")
	public void i_click_confirm_to_save(){
		((JavascriptExecutor) driver)
	     .executeScript("window.scrollTo(0, document.body.scrollHeight)");
		WebElement btnSave = driver.findElement(By.cssSelector(".btn.btn-primary"));
		btnSave.click();
	}
	
	
	@And("^I click OK$")
	public void i_click_OK(){
		WebElement btnSave = driver.findElement(By.cssSelector(".modal-content .btn.btn-primary"));
		btnSave.click();
		
	}
	
	@Then("^Driver is created successfully$")
	public void verify_created_successfully(){
		WebElement message = driver.findElement(By.id("success_msg"));
		String success_mess = message.getText();
		System.out.println("The driver is "+success_mess);
	}
	
	
	
	

}
