package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\ADMIN\\eclipse-workspace\\CucumberFrame\\src\\test\\resources\\Features\\FaceBook.feature",glue ="StepDefinition"  )
public class FbTestRunner {

}
