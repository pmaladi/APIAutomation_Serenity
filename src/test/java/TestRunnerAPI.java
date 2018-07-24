
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		format = {"pretty"},
				features= "Resource/SampleTest.feature",
				glue = {"api.stepdefinations"},
				monochrome=true
				)
/*


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(format = {"pretty"}, monochrome=true, features = "src/Feature/Sample.feature")
*/


public class TestRunnerAPI {

}
