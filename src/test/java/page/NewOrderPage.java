package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewOrderPage {
	
	WebDriver driver;
	
	@FindBy(css=".btn.l-create")
	private WebElement btnCreateNewOrder;
	
	@FindBy(id="order_code")
	private WebElement order_code_field;
	
	@FindBy(id="order_no")
	private WebElement order_no_field;
	
	@FindBy(id="bill_no")
	private WebElement bill_no_field;
	
	@FindBy(id="customer_name")
	private WebElement customer_name_field;
	
	@FindBy(id="customer_mobile_no")
	private WebElement customer_mobile_no_field;
	
	@FindBy(id="order_date")
	private WebElement order_date_field;
	
	@FindBy(id="note")
	private WebElement note_field;
	
	@FindBy(id="amount")
	private WebElement amount_field;
	
	@FindBy(id="insured_goods")
	private WebElement insured_goods_radiobox;
	
	@FindBy(id="quantity")
	private WebElement quantity_field;
	
	@FindBy(id="volume")
	private WebElement volume_field;
	
	@FindBy(id="weight")
	private WebElement weight_field;
	
	@FindBy(css=".btn.btn-success")
	private WebElement btnToSave;
	
	
}

