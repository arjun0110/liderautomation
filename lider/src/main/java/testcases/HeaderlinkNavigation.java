package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_Lider;
import wdMethods.ProjectMethods;

public class HeaderlinkNavigation extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Header link navigation flow";
		testDescription="Verify the header link navigation flows";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC007";
	}
	@Test
	public void Headlinks()  {
		
		new HomePage_Lider()
		.Locales()
		.Localesnavigation()
		.verifyhomepage()
		.comprasanteriores()
		.comprasanterioresnavigation()
		.verifyhomepage()
		.seguimientodecompras()
		.seguimientodecomprasnavigation()
		.verifyhomepage()
		.pickup()
		.pickupnavigation()
		.verifyhomepage();
		
		
	}
}
