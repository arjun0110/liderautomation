package pages;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'js-link-edit-address')]")
	private WebElement editaddress;
	public Orderdetails editlocation() {
		click(editaddress);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@data-id,'regionAddress-Add')]")
	private WebElement editregion;
	
	@FindBy(how=How.XPATH,using="//*[contains(@data-original-index,'3')]")
	private WebElement loc;
	public Orderdetails editregion() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", editregion);
		
		mouseHove3r(editregion);
		
		mouseHove4r(loc);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@data-id,'idEditCommune')]")
	private WebElement editcommuna;
	@FindBy(how=How.XPATH,using="//*[contains(@class,'bs-container btn-group bootstrap-select input-group-btn input-select c idEditCommune open')]/div/ul/li[3]")
	private WebElement loc1;
	
	public Orderdetails editcomm() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", editcommuna);
		
		
		mouseHove3r(editcommuna);
		mouseHove4r(loc1);
		
		return this;
		}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'buttonNormalizeAddress')]")
	private WebElement confirm;
	public Orderdetails confirmeditlocation() {
		click(confirm);
		return this;
	}
	@FindBy(how=How.XPATH,using="//*[contains(@id,'buttonAddAddress')]")
	private WebElement saved;
	public Orderdetails saveeditlocation() {
		click(saved);
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
