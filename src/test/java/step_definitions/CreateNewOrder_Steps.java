package step_definitions;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import domain.builder.task.DriverDetailBuilder;
import util.PageStore;
import util.Specification;
import page.NewOrderPage;

public class CreateNewOrder_Steps {
	public WebDriver driver;
	DriverDetailBuilder builder;
	Specification user;
	PageStore pageStore;
	NewOrderPage orderPage;
	
	public CreateNewOrder_Steps() {
		//this.builder = new LoginDetailBuilder();
		//this.dashBoardBuilder = new DashBoardBuilder();
		this.driver = Hooks.driver;
		this.pageStore = new PageStore(driver);
		this.orderPage = new NewOrderPage(driver);
		//this.user = new Specification(pageStore);		
	}
	
	
	@Given("^I open order page \"(.*)\"$")
	public void i_open_order_screen(String order_link){
		driver.get(order_link);
	}
	
	@When("^I click button to open order screen$")
	public void i_click_new_order_button(){
		orderPage.click_create_button();
	}
	
	@And ("^I enter order code$")
	public void i_enter_a_valid_order_code(){
		orderPage.enter_order_code("MaDonHang-0001");
	}
	
	@And ("^I enter order number$")
	public void i_enter_a_valid_order_number(){
		orderPage.enter_order_number("SoDonHang-0001");
	}
	
	@And ("^I enter order bill number$")
	public void i_enter_a_valid_order_bill_number(){
		orderPage.enter_order_bill_no("SoHoaDon-0001");
	}
	@And ("^I select customer$")
	public void i_enter_select_customer(){
		orderPage.click_customer_listbox();
		orderPage.selectRandomValueInListBox();
	}
	

}
