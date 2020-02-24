package co.com.certificacion.cyberwongtest.stepsdefinitions;

import co.com.certificacion.cyberwongtest.models.Datos;
import co.com.certificacion.cyberwongtest.tasks.Abrir;
import co.com.certificacion.cyberwongtest.tasks.Confirmar;
import co.com.certificacion.cyberwongtest.tasks.Seleccionar;
import co.com.certificacion.cyberwongtest.tasks.Verificar;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AgregarProductoStepDefinitions {

    @Before
    public void configuracionInicial(){ setTheStage(new OnlineCast()); }


    @Given("^El cliente abre el navegador$")
    public void elClienteAbreElNavegador() { theActorCalled("cliente").attemptsTo(Abrir.laPagina()); }

    @Given("^El cliente selecciona un producto$")
    public void elClienteSeleccionaUnProducto() {
        theActorCalled("cliente").attemptsTo(Seleccionar.elProducto());
    }

    @When("^Confirma sus datos de domicilio$")
    public void confirmaSusDatosDeDomicilio(List<Datos> datosList) {
        theActorInTheSpotlight().attemptsTo(Confirmar.laDireccion(datosList.get(0).getCorreo(),datosList.get(0).getDireccion(),datosList.get(0).getNumero()));
    }

    @Then("^Verifica que el articulo se haya agregado$")
    public void verificaQueElArticuloSeHayaAgregado() {
        theActorInTheSpotlight().attemptsTo(Verificar.elArticulo());
    }
}
