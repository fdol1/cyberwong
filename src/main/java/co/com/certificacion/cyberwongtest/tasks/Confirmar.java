package co.com.certificacion.cyberwongtest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.certificacion.cyberwongtest.userinterfaces.CyberwongPage.*;
import static co.com.certificacion.cyberwongtest.userinterfaces.CyberwongPage.BTN_CONFIRMAR_DIRECCION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Confirmar implements Task {

    private static String correo, direccion, numero;

    public Confirmar(String correo, String direccion, String numero) {
        this.correo = correo;
        this.direccion = direccion;
        this.numero = numero;
    }

    public static Confirmar laDireccion(String correo, String direccion, String numero){
        return Tasks.instrumented(Confirmar.class, correo,direccion,numero);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_CORREO, isVisible()),
                Click.on(TXT_CORREO), Enter.theValue(correo).into(TXT_CORREO),
                Click.on(BTN_CONFIRMAR_CORREO),
                WaitUntil.the(BTN_MODO_ENTREGA_1, isClickable()),
                Click.on(BTN_MODO_ENTREGA_1),
                Click.on(TXT_INGRESAR_OTRA_DIRECCION),
                Click.on(TXT_DIRECCION_ENVIO), Enter.theValue(direccion).into(TXT_DIRECCION_ENVIO),
                Click.on(TXT_NUMERO_EMVIO), Enter.theValue(numero).into(TXT_NUMERO_EMVIO),
                Click.on(CBX_DEPARTAMENTO),
                Click.on(CBX_PROVINCIA),
                Click.on(CBX_DISTRITO),
                Click.on(BTN_CONFIRMAR_DIRECCION)
        );
        tituloArticulo = Text.of(TXT_NOMBRE_ARTICULO).viewedBy(actor).asString();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
