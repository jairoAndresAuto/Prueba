package co.google.www.tasks;

import co.google.www.userinterface.EscogerProductoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.LinkedList;
import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EscogerProducto  implements Task {

    /*Crear una lista de tipo string*/
    List<String> listaProductos=null;

    /*metodo que viene de task para su implementacion*/
    /*primero espera a que aparescan los productos despues baja hasta el producto de interes
    * despues seleccion los prodcutos y da clic en ir al carrito*/
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(WaitUntil.the(EscogerProductoPage.LISTA_PRODUCTOS.of("1"), isVisible()),
                Scroll.to(EscogerProductoPage.LISTA_PRODUCTOS.of("1")),
                Click.on(EscogerProductoPage.LISTA_PRODUCTOS.of("1")),
                WaitUntil.the(EscogerProductoPage.LBL_ENELCARRITO.of("1"), isVisible()),
                Click.on(EscogerProductoPage.LISTA_PRODUCTOS.of("2")),
                WaitUntil.the(EscogerProductoPage.LBL_ENELCARRITO.of("2"), isVisible()),
                WaitUntil.the(EscogerProductoPage.BTN_CARRITO.of("3"), isVisible()),
                Scroll.to(EscogerProductoPage.BTN_CARRITO.of("3")),
                Click.on(EscogerProductoPage.BTN_CARRITO.of("3")));
    }

    /*Este es un metodo que retorna la instancia de la clase*/
    public static EscogerProducto enLista() {
        return Tasks.instrumented(EscogerProducto.class);
    }
}
