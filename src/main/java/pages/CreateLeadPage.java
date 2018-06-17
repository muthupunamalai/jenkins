package pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	
	public CreateLeadPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	
	@And("Enter the company name (.*)")
	public CreateLeadPage writeCompanyName(String data) {
		type(eleCompanyName,data);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	
	@And("Enter the first name (.*)")
	public CreateLeadPage writeFirstName(String data) {
		type(eleFirstName,data);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	
	@And("Enter the last name (.*)")
	public CreateLeadPage writeLastName(String data) {
		type(eleLastName,data);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//input[@class='smallSubmit']")
	private WebElement eleClickSubmitButton;
	
	@When("Click on the submit buttons")
	public ViewLead  clickSubmitCreateButton() {
		click(eleClickSubmitButton);
		return new ViewLead();		
	}

	
	}
	

