package co.google.www.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class MenuPage {

    /*Variables de los elementos con los que se interactua en la pagina inicial*/
    public static Target CLIC_CANCELAR_POPUP=Target.the("clic en cancelar: ").locatedBy("//button[@id='onesignal-popover-cancel-button']");
    public static Target LISTA_MENU=Target.the("Escoger de la lista: ").locatedBy("//div[@class='categsTop__item']//span[contains(text(),'{0}')]");

    private MenuPage() {}
}
