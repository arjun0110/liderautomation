package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_Lider;
import wdMethods.ProjectMethods;

public class LoginAndLogoutSupermarket extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="LoginandLogout section";
		testDescription="Verify the login and logout flow";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC002";
	}
	@Test(dataProvider="fetchData")
	public void loginandlogout(String email, String password)  {
		
		new HomePage_Lider()
		.navigatoSupermarket()
		.clicklogin()
		.enteremail(email)
		.enterpassword(password)
		.login()
		.initialsdisplayed()
		.clicklogin()
		.logout();

}
}
