package co.google.www.stepdefinitions;

import co.google.www.GeneralStepDefinitions;
import co.google.www.questions.ValidarProductos;
import co.google.www.tasks.EscogerProducto;
import co.google.www.tasks.FinalizarCompra;
import co.google.www.tasks.Menu;
import co.google.www.userinterface.FinalizarCompraPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RealizarCompraDefinitions extends GeneralStepDefinitions {

    /*metodos implementados del feature*/
    @Before
    public void config() {
        setUp();
    }

    @Given("^Despues de encontrarme en la pagina$")
    public void despuesDeEncontrarmeEnLaPagina(List<Map<String,String>> optionMenu) {
        theActorInTheSpotlight().wasAbleTo(Menu.seleccionar(optionMenu.get(0).get("optionmenu")));
    }


    @When("^procedo a realizar el proceso de compra$")
    public void procedoARealizarElProcesoDeCompra() {
        theActorInTheSpotlight().attemptsTo(EscogerProducto.enLista(), FinalizarCompra.exitosa());
    }

    @Then("^visualiza los productos agregados$")
    public void visualizaLosProductosAgregados(List<Map<String,String>> listaProductos) {
        theActorInTheSpotlight().should(seeThat(ValidarProductos.seleccionado(listaProductos.get(0).get("Produto1"), FinalizarCompraPage.PRODUCTO1)));
        theActorInTheSpotlight().should(seeThat(ValidarProductos.seleccionado(listaProductos.get(0).get("Produto2"), FinalizarCompraPage.PRODUCTO2)));
    }


}
