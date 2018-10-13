package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class HeaderlinkNavigation  extends ProjectMethods{
	
	public HeaderlinkNavigation() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'geoBuscador')]")
	private WebElement localesbutton;
	
	public HomePage_Lider Localesnavigation()
	{
		highLighterMethod(driver, localesbutton);
		verifyDisplayed(localesbutton);
		backButton();
		return new HomePage_Lider();
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'encabezado -center')]")
	private WebElement comprasanterioresnutton;
	
	public HomePage_Lider comprasanterioresnavigation()
	{
		highLighterMethod(driver, comprasanterioresnutton);
		verifyDisplayed(comprasanterioresnutton);
		backButton();
		return new HomePage_Lider();
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'ti-form-purchase-tracking')]")
	private WebElement seguimientodecomprasbutton;
	
	public HomePage_Lider seguimientodecomprasnavigation()
	{
		highLighterMethod(driver, seguimientodecomprasbutton);
		verifyDisplayed(seguimientodecomprasbutton);
		backButton();
		return new HomePage_Lider();
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'img-responsive click-logo')]")
	private WebElement pickupimage;
	
	public HomePage_Lider pickupnavigation()
	{
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		highLighterMethod(driver, pickupimage);
		verifyDisplayed(pickupimage);
		backButton();
		return new HomePage_Lider();
	}
	
	
	
}
