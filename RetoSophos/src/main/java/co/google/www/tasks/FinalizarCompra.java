package co.google.www.tasks;

import co.google.www.userinterface.FinalizarCompraPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FinalizarCompra implements Task {

    /*espera hasta que la pagina del carrito cargue y baja hasta los productos escojidos*/
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(FinalizarCompraPage.LBL_CRITERIO, isVisible()),
                Scroll.to(FinalizarCompraPage.PRODUCTO2));
    }

    /*Este es un metodo que retorna la instancia de la clase*/
    public static FinalizarCompra exitosa() {
        return Tasks.instrumented(FinalizarCompra.class);
    }
}
