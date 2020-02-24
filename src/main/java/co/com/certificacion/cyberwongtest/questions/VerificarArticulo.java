package co.com.certificacion.cyberwongtest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.certificacion.cyberwongtest.userinterfaces.CyberwongPage.articuloListado;
import static co.com.certificacion.cyberwongtest.userinterfaces.CyberwongPage.tituloArticulo;

public class VerificarArticulo implements Question<Boolean> {

    public static VerificarArticulo alFinalizar(){
        return new VerificarArticulo();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        if(tituloArticulo.equals(articuloListado)){
            return true;
        }
        return null;
    }
}
