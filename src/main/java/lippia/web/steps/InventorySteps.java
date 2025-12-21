package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.InventoryService;

public class InventorySteps extends PageSteps {

    @Then("^se visualiza el Título de la página \"Products\"$")
    public void homepage() {
        InventoryService.verificarHomepage();
 }

    @And("^el usuario agrega un producto al carrito$")
    public void ClickAgregarAlCarrito() {
        InventoryService.ClickAgregarAlCarrito();
        InventoryService.VerificarCarrito();
    }

    @And("^el usuario agrega un segundo producto al carrito$")
    public void ClickAgregarAlCarrito2() {
        InventoryService.ClickAgregarAlCarrito2();
        InventoryService.VerificarCarrito2();
    }


    @When("^el usuario hace click en el carrito$")
    public void ClickenCarrito() {
        InventoryService.ClickenCarrito();
    }


    @When("^el usuario hace click en \"Remove\"$")
    public void ClickEliminarCarrito() {
        InventoryService.ClickEliminarCarrito();
    }

    @Then("^el contador del carrito está vacío$")
    public void CarritoNOVisible() {
        InventoryService.CarritoNOVisible();
    }

}
