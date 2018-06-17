package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features= {"./src/main/java/features/CreateLead1.feature", 
		"./src/main/java/features/CreateLead2.feature"} ,
glue= {"pages","hooks"})
//tags= {"@regression" , "@sanity"}
//name ="application")


public class Run1 {

}
 