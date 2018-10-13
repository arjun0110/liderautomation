package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Cyber_SM extends ProjectMethods{
	
	public Cyber_SM() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//div[@class='product-details']/a")
	private WebElement productlink;
	
	public Productdetails_SM clickproduct()
	{
		
		click(productlink);
		return new Productdetails_SM();
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@data-apply-filter,'/supermercado/category/Cyber/Ver-Todos/Absolut/_/N-zgx440Z16qjk5e?isNavRequest=Yes') and contains(@type,'checkbox')]")
	private WebElement filtercheckbox;
	
	public Cyber_SM filtercheck()
	{
		
		mouseHoverclick(filtercheckbox);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}

}
