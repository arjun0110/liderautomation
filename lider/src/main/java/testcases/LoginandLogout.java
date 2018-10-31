package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_Lider;
import wdMethods.ProjectMethods;

public class LoginandLogout extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="LoginandLogout section";
		testDescription="Verify the login and logout flow";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="Login";
	}
	@Test(dataProvider="fetchData")
	public void loginandlogout(String email, String password)  {
		
		new HomePage_Lider()
		.clicklogin()
		.enteremail(email)
		.enterpassword(password)
		.login()
		.initialsdisplayed()
		.clicklogin()
		.logout();
		

}
}