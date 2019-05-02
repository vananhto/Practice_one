package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DriverPage {
	WebDriver driver;
	
	@FindBy(id ="code")
	private WebElement driver_code_field;
	
	@FindBy(id ="full_name")
	private WebElement driver_full_name_field;
	
	@FindBy(id ="mobile_no")
	private WebElement driver_mobile_no_field;
	
	@FindBy(id ="id_no")
	private WebElement driver_id_no_field;
	
	@FindBy(css =".btn.btn-success")
	private WebElement save_button;

	@FindBy(css =".btn.btn-primary")
	private WebElement confirm_save_button;
	
	@FindBy(css ="#create_confirm .btn.btn-primary")
	private WebElement ok_to_save_button;

	public DriverPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterDriverCodeAs(String driverCode) {
		driver_code_field.clear();
		driver_code_field.sendKeys(driverCode);
	}
	
	public void enterDriverFullNameAs(String driverFullName) {
		driver_full_name_field.clear();
		driver_full_name_field.sendKeys(driverFullName);
	}
	
	public void enterDriverMobileNoAs(String driverMobileNoName) {
		driver_mobile_no_field.clear();
		driver_mobile_no_field.sendKeys(driverMobileNoName);
	}
	
	public void enterDriverIdNoAs(String driverIdNoName) {
		driver_id_no_field.clear();
		driver_id_no_field.sendKeys(driverIdNoName);
	}
	
	public void saveDriverInfo() {
		save_button.click();
	}
	
	public void confirmToSaveDriverInfo() {
		confirm_save_button.click();
	}
	
	public void okToSaveDriverInfo() {
		ok_to_save_button.click();
	}
	
}
