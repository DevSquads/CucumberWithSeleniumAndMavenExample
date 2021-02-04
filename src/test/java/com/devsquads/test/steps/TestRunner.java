package com.devsquads.test.steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com.devsquads.test.steps"},
        features ={"src/test/java/com/devsquads/test"},
        plugin = {"pretty"})
public class TestRunner {

}