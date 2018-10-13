package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_Lider;
import wdMethods.ProjectMethods;

public class Supermercado  extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Supermercado section";
		testDescription="Verify the supermercado section";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC007";
	}
	@Test
	public void supermercadosection()  {
		
		new HomePage_Lider()
		.supermarcado()
		.newtab();
		
	}
}
		
