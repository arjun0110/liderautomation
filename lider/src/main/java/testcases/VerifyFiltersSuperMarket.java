package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_Lider;
import wdMethods.ProjectMethods;

public class VerifyFiltersSuperMarket extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Filters in products page";
		testDescription="Verify the filters in product page";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC010";
	}
	@Test(dataProvider="fetchData")
	public void verifyFilters(String email, String password)  {
		
		new HomePage_Lider()
		
		.clicklogin()
		.enteremail(email)
		.enterpassword(password)
		.login()
		.departmenticon()
		.computacian()
		.notebook()
		.fliter();
	
		
}
}