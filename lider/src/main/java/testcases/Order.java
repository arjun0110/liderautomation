package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_Lider;
import wdMethods.ProjectMethods;

public class Order extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Order section";
		testDescription="Verify the Order flow";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	public void Ordertest(String email, String password, String xpath)  {
		
		new HomePage_Lider()
		.clicklogin()
		.enteremail(email)
		.enterpassword(password)
		.login()
		.departmenticon()
		.computacian()
		.notebook()
.clickingaproduct()
.addingtocart(xpath)
.clickcart()
.checkout()
.clickproduct()

.clickorder()

.navigatetocart();

		
	}

}
