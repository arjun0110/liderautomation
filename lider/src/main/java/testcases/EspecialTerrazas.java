package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_Lider;
import wdMethods.ProjectMethods;

public class EspecialTerrazas extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="EspecialTerrazas section";
		testDescription="Verify the EspecialTerrazas section";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC007";
	}
	@Test
	public void EspecialTerrazassection()  {
		
		new HomePage_Lider()
		.EspecialTerrazas()
		.verifyEspecialTerrazas();
		
	}
}