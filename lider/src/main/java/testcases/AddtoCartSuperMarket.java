package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_Lider;
import wdMethods.ProjectMethods;

public class AddtoCartSuperMarket extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="add to cart section";
		testDescription="Verify the add cart flow";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC002";
	}
	@Test(dataProvider="fetchData")
	public void addtocart(String email, String password,String text)  {
		
		new HomePage_Lider()
		.navigatoSupermarket()
		.clicklogin()
		.enteremail(email)
		.enterpassword(password)
		.login()
		.enterSearchkey(text)
		.addingtocart()
		.clickcart();

}
}
