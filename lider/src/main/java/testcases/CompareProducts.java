package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_Lider;
import wdMethods.ProjectMethods;

public class CompareProducts extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Compare section";
		testDescription="Verify the compare section";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC007";
	}
	@Test
	public void Comparesection()  {
		
		new HomePage_Lider()
		.departmenticon()
		.computacian()
		.notebook()
		.comparefirst()
		.comparesecond()
		.clickCompare()
		.compareconfirm();
	}
}
