package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CompareResults extends ProjectMethods{
	
	public CompareResults() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//*[contains(@name,'volver')]")
	private WebElement compareresultsconfirmation;
	
	public CompareResults compareconfirm()
	{
		highLighterMethod(driver, compareresultsconfirmation);
		verifyDisplayed(compareresultsconfirmation);
		return this;
	}


}
