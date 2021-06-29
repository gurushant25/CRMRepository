package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "/Users/gurushan/eclipse-workspace/FreeCRMTestCucumber/src/main/java/features/DealspagewithMap.feature"
 ,glue={"stepDefinition"},
 format= {"pretty","json:test-output/Json-output.json"},
 dryRun=false,
tags= {"@Regression"},
 monochrome=true,
 strict=true
		 )
public class TestRunner {

}
