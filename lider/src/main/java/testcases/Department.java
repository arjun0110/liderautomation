package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_Lider;
import wdMethods.ProjectMethods;

public class Department extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Department section";
		testDescription="Verify the departments section";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC007";
	}
	@Test
	public void departmentstest()  {
		
		new HomePage_Lider()
		.departmenticon()
		.electronica()
		.computacian()
		.TelefoníayFotografía()
		.Electrohogar()
		.Hogar()
		.Muebles()
		.Dormitorio()
		.Deportes()
		.AireLibre()
		.MundoBebé()
		.Juguetería()
		.Automóvil()
		.CampañaTerrazas();
		
		
		
	}
}