package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class DepartmentsTab extends ProjectMethods{
	
	public DepartmentsTab() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'main-item dropdown departments')]")
	private WebElement departmenticon;
	
	public DepartmentsTab mousehoverdepartmentstab1()
	{
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		highLighterMethod(driver, departmenticon);
		click(departmenticon);;
		return this;
	}


}
