package co.com.certificacion.cyberwongtest.tasks;

import co.com.certificacion.cyberwongtest.questions.VerificarArticulo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.certificacion.cyberwongtest.userinterfaces.CyberwongPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class Verificar implements Task {

    public static Verificar elArticulo(){
        return Tasks.instrumented(Verificar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_VER_CARRITO, isClickable()),
                Click.on(BTN_VER_CARRITO)
        );

        articuloListado = Text.of(TXT_ARTICULO_LISTADO).viewedBy(actor).asString();

        actor.should(seeThat(VerificarArticulo.alFinalizar(), is(equalTo(true))));

    }
}
