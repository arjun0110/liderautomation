package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_Lider;
import wdMethods.ProjectMethods;

public class Footerlinks extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Number of footer links";
		testDescription="Verify the count of footer links";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC007";
	}
	@Test
	public void Footerlinkssize()  {
		
		new HomePage_Lider()
		.footerlinksize();
	}
}