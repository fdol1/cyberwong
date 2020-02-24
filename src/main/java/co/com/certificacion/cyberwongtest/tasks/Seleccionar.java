package co.com.certificacion.cyberwongtest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.certificacion.cyberwongtest.userinterfaces.CyberwongPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class Seleccionar implements Task {

    public static Seleccionar elProducto(){
        return Tasks.instrumented(Seleccionar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_RECHAZAR_PUBLICIDAD, isClickable()),
                Click.on(BTN_RECHAZAR_PUBLICIDAD),
                Click.on(BTN_AGREGAR_ARTICULO)
        );
    }
}
