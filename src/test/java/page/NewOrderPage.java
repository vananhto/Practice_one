package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	@FindBy(id="select2-customer_id-container")
	private WebElement customer_listbox;
	
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
	
	@FindBy(css=".select2-results ul li")
	private List<WebElement> listSelection;
	
	
	
	/*int n;
	private String listSelectionLocation = ".select2-results ul li:nth-child("+n+")";*/
	
	
	public NewOrderPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void click_create_button(){
		btnCreateNewOrder.click();
	}

	public void enter_order_code(String orderCode){
		order_code_field.clear();
		order_code_field.sendKeys(orderCode);
	}
	
	public void enter_order_number(String orderNumber){
		order_no_field.clear();
		order_no_field.sendKeys(orderNumber);
	}
	
	public void enter_order_bill_no(String orderBillNo){
		bill_no_field.clear();
		bill_no_field.sendKeys(orderBillNo);
	}
	
	public void click_customer_listbox(){
		customer_listbox.click();
	}
	
	public void selectRandomValueInListBox(){
		int numberOfSelection = listSelection.size();
		int Min = 1;
		System.out.println("size = " + numberOfSelection);
		int Max = numberOfSelection;
		int rand = Min + (int) (Math.random() * ((Max - Min) + 1));
		System.out.println("random = "+rand);
		System.out.println("selected customer:" +listSelection.get(rand).getText());
		listSelection.get(rand).click();
		
		
	}
	
	
	
}

