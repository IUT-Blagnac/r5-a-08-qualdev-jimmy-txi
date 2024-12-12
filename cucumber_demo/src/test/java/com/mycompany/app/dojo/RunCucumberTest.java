package com.mycompany.app.dojo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)  
@CucumberOptions(
    features = "classpath:com/mycompany/app/dojo",
    glue = "com.mycompany.app.dojo"
)
public class RunCucumberTest { }

