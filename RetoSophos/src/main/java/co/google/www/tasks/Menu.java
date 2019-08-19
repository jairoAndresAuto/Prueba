package co.google.www.tasks;


import co.google.www.interactions.ManejarAlertarPopUp;
import co.google.www.userinterface.EscogerProductoPage;
import co.google.www.userinterface.FinalizarCompraPage;
import co.google.www.userinterface.MenuPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Menu implements Task {

    String option;

    public Menu(String option){
        this.option=option;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        /*en este codigo se espera hasta que el popup aparesca y da en no gracias y da clic en la opcion de menu al que va comprar*/
        actor.attemptsTo(WaitUntil.the(MenuPage.CLIC_CANCELAR_POPUP, isVisible()),
                Click.on(MenuPage.CLIC_CANCELAR_POPUP),
                Click.on(MenuPage.LISTA_MENU.of(option)));
    }

    /*Este es un metodo que retorna la instancia de la clase*/
    public static Menu seleccionar(String option) {
        return Tasks.instrumented(Menu.class,option);
    }
}
