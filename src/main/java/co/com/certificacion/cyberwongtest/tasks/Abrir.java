package co.com.certificacion.cyberwongtest.tasks;

import co.com.certificacion.cyberwongtest.userinterfaces.CyberwongPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {

    private CyberwongPage cyberwongPage;

    public static Abrir laPagina() {
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(cyberwongPage));
    }
}
