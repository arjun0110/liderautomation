package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_Lider;
import wdMethods.ProjectMethods;

public class OrderSupermarket extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Order section";
		testDescription="Verify the ordering flow";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC002";
	}
	@Test(dataProvider="fetchData")
	public void order(String email, String password, String text)  {
		
		new HomePage_Lider()
		.navigatoSupermarket()
		.clicklogin()
		.enteremail(email)
		.enterpassword(password)
		.login()
		.enterSearchkey(text)
		.addingtocart()
		.clickcart()
		
		.checkout()
		.clickproduct()

		.clickorder()

		.navigatetocart();

}
}
