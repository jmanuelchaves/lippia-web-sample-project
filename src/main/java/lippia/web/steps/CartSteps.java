package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.CartService;
import lippia.web.services.InventoryService;
import lippia.web.services.LoginService;

public class CartSteps extends PageSteps {


    @And("^se visualizan los productos agregados al carrito$")
    public void Verificarproductosencarrito() {
        CartService.Verificarproductosencarrito();

    }


    @Then("^se visualiza el Titulo de la pagina \"Your Cart\"$")
    public void homepage() {
        CartService.verificarHomepage();
    }

    @When("^el usuario hace click en \"Checkout\"$")
    public void ClickenCheckout() {
        CartService.ClickenCheckout();
    }

}