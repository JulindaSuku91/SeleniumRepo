package com.entities;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/com/automatedtest/features/"},
        strict = false, plugin = {"pretty",
        "json:target/cucumber_json_reports/search.json",
        "html:target/search-html"},
        glue = {"com.driver",
                "com.edititem",
                "com.additem",
                "com.deleteitem",
                "com.deleteall"

                },
        tags= {"@AddItem"}
        )
public class RunTest {
}
