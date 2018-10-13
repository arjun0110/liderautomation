package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_Lider;
import wdMethods.ProjectMethods;

public class Mundobebe extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Mundobebe section";
		testDescription="Verify the Mundobebe section";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC007";
	}
	@Test
	public void mundobebesection()  {
		
		new HomePage_Lider()
		.mondobebe()
		.verifymondobebe();
		
	}
}
		

