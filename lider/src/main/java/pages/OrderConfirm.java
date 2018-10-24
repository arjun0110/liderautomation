package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class OrderConfirm extends ProjectMethods{
	
	public OrderConfirm() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'chk-agree-terms')]")
	private WebElement terms;
	
	public OrderConfirm clickterms()
	{
		
		
		click(terms);
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@data-payment-type-id,'transbankDebit')]")
	private WebElement payment;
	
	public OrderConfirm choosepayment()
	{
		
		
		click(terms);
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@data-payment-type-id,'LiderMaster Card')]")
	private WebElement lider;
	
	public OrderConfirm liderpayment()
	{
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		verifyDisplayed(lider);
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'RedCompra')]")
	private WebElement redcompara;
	
	public OrderConfirm redcomparapayment()
	{
		
		
		verifyDisplayed(redcompara);
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Tarjetas de Crédito')]")
	private WebElement web;
	
	public OrderConfirm webpayment()
	{
		
		
		verifyDisplayed(web);
		
		return this;
	}
	

	@FindBy(how=How.XPATH,using="//*[contains(@alt,'Lider Logo')]")
	private WebElement cartsec;
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'icon-new icon-cart')]")
	private WebElement cartbutton;
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'js-delete-product ico-trash btn-delete-product-qc')]")
	

	private WebElement delete;
	
	public OrderConfirm navigatetocart()
	{
		
		
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

		click(cartsec);

		click(cartbutton);
	
		click(delete);
		
		
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
