package steps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	RemoteWebDriver driver;
	
	@Given("open the browser")
	public void openbrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@And("maximize the browser")
	public void max()
	{
	driver.manage().window().maximize();
	}
	
	@And("Enter the url")
	public void enterUrl()
	{
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	
	@And("enter the username")
	public void enterUsername()
	{
		driver.findElementByClassName("inputLogin").sendKeys("DemoSalesManager");
	}
	
	@And("enter the password")
	public void enterPassword()
	{
		driver.findElementById("password").sendKeys("crmsfa");
	}
	
	
	@And("click on the login button")
	public void clickbutton()
	{
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@And("User should navgivate to the testleafhome page")
	public void verifytitle()
	{
		String title = driver.getTitle();
		title.contains("HomePage");
		System.out.println("Navigate to the homepage");
	}
	
	@And("click on the CRM/SFA")
	public void clickCRMSFA()
	{
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@And("click on the Leads tab")
	public void clickLead()
	{
		driver.findElementByLinkText("Leads").click();
	}
	

	@And("click on the create lead")
	public void createLead()
	{
		driver.findElementByLinkText("Create Lead").click();
	}
	
	@And("enter the company name (.*)")
	public void enterComName(String cName)
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	}
	

	@And("enter the first name (.*)")
	public void enterfirstName(String fName)
	{
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
	}
	
	
	@And("enter the last name (.*)")
	public void enterLastName(String lastname)
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(lastname);
	}
	
	@When("click on the submit buttons")
	public void clickButton()
	{
		driver.findElementByName("submitButton").click();
		
	}
	
	@Then("verify whether the lead is created succesfully with the first name and last name")
	public void verifyFirstName()
	{
		String text = driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println(text);
	}
	
	@But("verify whether the lead is created succesfully with the first name and last name")
	public void verifyFName()
	{
		String text = driver.findElementById("viewLead_firstName_sp").getText();
		text.equals("sudhar");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
