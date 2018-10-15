package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Productdetails_SM extends ProjectMethods{
	
	public Productdetails_SM() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'btn btn-info btn-block btn-agregar js-btn-agregar-pdp')]")
	private WebElement addtocartlink;
	
	public Productdetails_SM addtocart()
	{
		
		click(addtocartlink);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Productdetails_SM();
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'icon-new icon-cart')]")
	private WebElement viewcartlink;
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'item-img')]")
	private WebElement mousehoverprod;

	@FindBy(how=How.XPATH,using="//*[contains(@class,'btn btn-old btn-primary w-110    js-qcpo-del-confirm ')]")
	private WebElement delete;
	
	public Productdetails_SM viewcart()
	{
		
		click(viewcartlink);
		mouseHover(mousehoverprod);
		click(delete);
		
		
		return new Productdetails_SM();
	}
	
	public Cart viewcarts()
	{
		
		click(viewcartlink);
		mouseHover(mousehoverprod);
		
		
		
		return new Cart();
	}

}

