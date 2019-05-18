package step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import util.PageStore;
import util.Specification;

public class SaveSteps {
	
	public WebDriver driver;
	Specification user;
	PageStore pageStore;
	//DriverData data;
	//DriverPage driverPage;
	public SaveSteps() {
		//this.builder = new LoginDetailBuilder();
		//this.dashBoardBuilder = new DashBoardBuilder();
		this.driver = Hooks.driver;
		this.pageStore = new PageStore(driver);
		//this.user = new Specification(pageStore);
		//this.data = new DriverData();
	}
	
	@And("^I click save button$")
	public void i_click_save_button(){
		((JavascriptExecutor) driver)
	     .executeScript("window.scrollTo(0, document.body.scrollHeight)");
		WebElement btnSave = driver.findElement(By.cssSelector(".btn.btn-success"));
		btnSave.click();
	}
	
	@And("^I click button to confirm saving$")
	public void i_click_button_comfirm_saving(){
		((JavascriptExecutor) driver)
	     .executeScript("window.scrollTo(0, document.body.scrollHeight)");
		WebElement btnSave = driver.findElement(By.cssSelector(".btn.btn-primary"));
		btnSave.click();
	}
	

	@And("^I click button OK$")
	public void i_click_button_OK(){
		WebElement btnSave = driver.findElement(By.cssSelector(".modal-content .btn.btn-primary"));
		btnSave.click();
	}
	
	@Then("^The driver is created successfully$")
	public void verify_the_driver_created_successfully(){
		WebElement message = driver.findElement(By.id("success_msg"));
		String success_mess = message.getText();
		System.out.println("The driver is "+success_mess);
	}
}
