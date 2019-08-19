package co.google.www.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/co.google.www.features/realizar_compra.feature",
        glue = "co.google.www.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RealizarCompraRunner {
}
