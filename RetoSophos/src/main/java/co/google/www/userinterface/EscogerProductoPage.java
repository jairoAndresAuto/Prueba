package co.google.www.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class EscogerProductoPage {

    /*Variables de los elementos con los que se interactua en la pagina para escoger los productos*/
    public static Target LISTA_PRODUCTOS=Target.the("Lista productos: ").locatedBy("(//div[contains(@class,'gotten-product-item-data')]//span[@class='product-add-to-cart__text'])[{0}]");
    public static Target BTN_CARRITO=Target.the("boton cancelar ").locatedBy("(//span[contains(text(),'Ver carrito')])[{0}]");
    public static Target LBL_ENELCARRITO=Target.the("etiqueta en el carrito").locatedBy("(//span[contains(text(),'en el carrito')])[{0}]");

    private EscogerProductoPage() {}
}
