package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_Lider;
import wdMethods.ProjectMethods;

public class VerifytheDepartmentsTabSuperMarket extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Department tab section";
		testDescription="Verify the department tab section";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC007";
	}
	@Test
	public void departmentsTab()  {
		
		new HomePage_Lider()
		.navigatoSupermarket()
		.mousehoverdepartmentstab()
		.cyber()
		.CarnesyPescados()
		.FrescosyL�cteos()
		.Congelados()
		.Despensa()
		.MundoBeb�1()
		.Mascotas()
		.DesayunosyPanader�a()
		.BebidasyLicores()
		.LimpiezayAseo()
		.Perfumer�aySalud()
		.HogaryBazar()
		.Especiales();
	}
}
