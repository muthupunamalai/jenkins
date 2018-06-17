package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;


import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLeads extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLeads";
		testDescription="create Leads in LeafTaps Application";
		testNodes="Leads";
		category="Smoke";
		authors="Sudharson";
		browserName="chrome";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	public void createLeads(String uName,String pwd,String cName, String fName, String lName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmSfa()
		.clickMyLead()
		.clickCreateLeads()
		.writeCompanyName(cName)
		.writeFirstName(fName)
		.writeLastName(lName)
		.clickSubmitCreateButton()
		.verifyFirstName(fName);
		
	}

}
