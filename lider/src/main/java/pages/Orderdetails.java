package pages;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Orderdetails extends ProjectMethods{
	
	public Orderdetails() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'js-open-calendar hidden-xs')]")
	private WebElement selectproduct2;
	
	@FindBy(how=How.XPATH,using="//*[contains(@product-group-id,'ON_HAND-HOME_DELIVERY') and contains(@class,'available')]")
	private WebElement selectproduct;
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'btn btn-info btn-md btn-save-slot')]")
	private WebElement selectproduct3;
	
	public Orderdetails clickproduct()
	{
		scrollBottom();
		click(selectproduct2);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		click(selectproduct);
		click(selectproduct3);
		//driver.findElement(By.cssSelector("input[name='delivery-price-sg8365615069-1\']")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'js-week-after pull-right')]")
	private WebElement time;
	public Orderdetails timeslot()
	{
		
		click(selectproduct2);
		click(time);
		click(time);
		return this;
	}
	
	

	
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'btn btn-buy') and contains (@style,'position: relative;')]")
	private WebElement orderbutton;
	
	public OrderConfirm clickorder()
	{
		
	
		click(orderbutton);
		return new OrderConfirm();
	}
	
	

}
