package runTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
                 snippets = CucumberOptions.SnippetType.CAMELCASE,
                 plugin = {"pretty"},
                 features = {".\\src\\test\\resources\\features"},
                 glue = {"com.cadastro.steps"},
                 tags = "@CadastroValido")

public class RunTest {

}
