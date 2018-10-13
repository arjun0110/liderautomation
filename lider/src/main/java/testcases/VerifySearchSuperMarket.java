package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_Lider;
import wdMethods.ProjectMethods;

public class VerifySearchSuperMarket extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Search section";
		testDescription="Verify the Search behavior";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC004";
	}
	@Test(dataProvider="fetchData")
	public void addtocart(String text)  {
		
		new HomePage_Lider()
		.navigatoSupermarket()
		.enterSearchkey(text)
		.searchConfirm();

}
}