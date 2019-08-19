package co.google.www.interactions;

import co.google.www.tasks.Menu;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Alert;

public class ManejarAlertarPopUp implements Task {

    /*metodo que acepta o discrimina un popup*/
    @Override
    public <T extends Actor> void performAs(T actor) {
        Alert alerta= BrowseTheWeb.as(actor).getDriver().switchTo().alert();
        alerta.accept();
    }

    /*metodo que retorna la instancia de la clase*/
    public static ManejarAlertarPopUp AceptaroRechazar() {
        return Tasks.instrumented(ManejarAlertarPopUp.class);
    }
}
