package pages;

import org.openqa.selenium.JavascriptExecutor;
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
	
	
	public HomePage_Lider cartmessage()
	{
		
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		return new HomePage_Lider();
	}
	
	

	@FindBy(how=How.XPATH,using="//*[contains(@class,'pull-right btn-vaciar-carro cartemptybutton')]")
	private WebElement delete;
	@FindBy(how=How.XPATH,using="//*[contains(@id,'btnYesConfirmYesNo')]")
	private WebElement confirm;
	
	public Cartdetails clickdelete()
	{
		click(delete);
		click(confirm);
		
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
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'searchtextinput')]")
	private WebElement searchbutton;	
	
	public Cartdetails searchanotherproduct(String keyname)
	{
		
		
		type(searchbutton,keyname);
		typewithenter(searchbutton);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"productBox[944220]\"]/a/div[2]")
	private WebElement tvbutton;	
	
	public Cart clicktv()
	{
		
		
	click(tvbutton);
		return new Cart();
	}
	
	
	
	
}