package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_Lider;
import wdMethods.ProjectMethods;

public class PageScrollCheckSupermarket extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Page scroll";
		testDescription="Verify the page scroll behavior";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC007";
	}
	@Test
	public void pageScroll()  {
		
		new HomePage_Lider()
		.navigatoSupermarket()
		
		.checkpagescroll();

}
}