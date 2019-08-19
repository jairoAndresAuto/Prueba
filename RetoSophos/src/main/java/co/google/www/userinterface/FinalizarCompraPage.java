package co.google.www.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class FinalizarCompraPage {

    /*Variables de los elementos con los que se interactua en la pagina donde se ven los productos agregados*/
    public static Target LBL_CRITERIO=Target.the("seleccionar criterio").locatedBy("//div[contains(text(),'Selecciona el criterio')]");
    public static Target CHECK_TERMINOS_Y_CONDICIONES=Target.the("check de terminos y condiciones").locatedBy("//span[@class='terms-text']");
    public static Target PRODUCTO1=Target.the("etiqueta producto 1").locatedBy("(//a[contains(text(),'LG Smart TV 43') and contains(text(),'Full HD 43LK5400') ])");
    public static Target PRODUCTO2=Target.the("etiqueta producto 2").locatedBy("(//a[contains(text(),'Samsung Smart TV 50') and contains(text(),'4K UHD 50NU7095') ])");

    private FinalizarCompraPage() {}
}
