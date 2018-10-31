package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Cart extends ProjectMethods{
	
	public Cart() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'icon-new icon-cart')]")
	private WebElement cartpage;
	//cart pag
	public Cart clickcart()
	{
		
		
		click(cartpage);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'btn btn-info btnMerge')]")
	private WebElement fusion;
	//cart pag
	public Cart clickfusion()
	{
		
		
		click(fusion);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@onclick,'clickCartPayButton();')]")
	private WebElement checkoutbutton;
	
	public Orderdetails checkout()
	{
		
		
		click(checkoutbutton);
		return new Orderdetails();
	}
	
	

	@FindBy(how=How.XPATH,using="//*[contains(@id,'cartgotocartbutton')]")
	private WebElement viewCartbutton;
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,js-delete-product ico-trash btn-delete-product-qc')]")
	private WebElement delete;
	
	public Cartdetails viewcart()
	{
		
		highLighterMethod(driver, viewCartbutton);
		click(viewCartbutton);
	
		return new Cartdetails();
	}
	
	public Cartdetails deletecart()
	{
		
		highLighterMethod(driver, delete);
		click(delete);
	
		return new Cartdetails();
	}

	@FindBy(how=How.XPATH,using="//*[contains(@id,'cartgotocartbutton')]")
	private WebElement orderbutton;
	
	public Orderdetails orderdetails()
	{
		
		highLighterMethod(driver, orderbutton);
		click(orderbutton);
		return new Orderdetails();
	}
	
}
