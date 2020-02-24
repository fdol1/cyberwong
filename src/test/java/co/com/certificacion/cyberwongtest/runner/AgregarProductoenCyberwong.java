package co.com.certificacion.cyberwongtest.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/agregar_producto_en_cyberwong.feature",
        tags = {"@SeleccionarArticulo"},
        glue ="co.com.certificacion.cyberwongtest.stepsdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class AgregarProductoenCyberwong {
}
