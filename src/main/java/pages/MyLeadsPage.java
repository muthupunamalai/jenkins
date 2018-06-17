package pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{
	
	public MyLeadsPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	
	@FindBy(how=How.XPATH,using="(//ul[@class='shortcuts'])//li[2]//a")
	private WebElement eleClickCreateLeads;
	
	@And("Click on the create lead")
	public CreateLeadPage  clickCreateLeads() {
		click(eleClickCreateLeads);
		return new CreateLeadPage()	;	
	}

	
	}
	

