package com.test.serenity.runTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"Resource/SampleTest.feature"}, glue = { "com.test.serenity.stepDefinations" })

public class TestRunnerAPI {

}
