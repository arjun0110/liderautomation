package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Supermarket extends ProjectMethods{
	
	public Supermarket() {		
		PageFactory.initElements(driver,this);
	}	
	

	
	public Supermarket newtab() {
		
		newTab();
		return this;
	}


}
