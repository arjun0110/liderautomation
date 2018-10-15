package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Cartdetails extends ProjectMethods{
	
	public void Cartdetail() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'seccion-cart-cupon')]")
	
	
	private WebElement verifycartpage;
	
	private WebElement paybutton;
	
	
	public Cartdetails cartmessage()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		return this;
	}
	
	

	@FindBy(how=How.XPATH,using="//*[contains(@class,'ico-trash-d')]")
	private WebElement delete;
	
	public Cartdetails clickdelete()
	{
		click(delete);

		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@onclick,'clickCartGoToCartButton();')]")
	private WebElement viewCartbutton;
	
	public Cartdetails cartdes()
	{
		
		highLighterMethod(driver, viewCartbutton);
		click(viewCartbutton);
		return this;
	}
	
	
	
	
}