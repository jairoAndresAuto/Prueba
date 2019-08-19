package co.google.www.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarProductos implements Question<Boolean> {

    /*variables*/
    private String validationMessage;
    Target target;

    /*metodo construcctor e inicializacion de variables*/
    public ValidarProductos(String validationMessage,Target target){
        this.validationMessage = validationMessage;
        this.target=target;
    }

    /*retorna la instancia de la clase*/
    public static ValidarProductos seleccionado(String validationMessage,Target target) {
        return new ValidarProductos(validationMessage,target);
    }

    /*compara el resultado actual y el esperado*/
    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(target).viewedBy(actor).asString().equals(validationMessage);
    }

}
