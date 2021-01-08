package co.bancolombia.reto.automatizacion.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@CucumberOptions(features = "src\\test\\resources\\feature\\createuser.feature",
        glue = "co.bancolombia.reto.automatizacion.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
@RunWith(CucumberWithSerenity.class)
public class CreateUserRunner {
}
