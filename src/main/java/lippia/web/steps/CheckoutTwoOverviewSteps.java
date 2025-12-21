package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.CheckoutCompleteService;
import lippia.web.services.CheckoutService;
import lippia.web.services.CheckoutTwoOverviewService;

public class CheckoutTwoOverviewSteps extends PageSteps {


    @And("^se verifican los productos en el carrito$")
    public void verificarProductosCarrito() {
        CheckoutTwoOverviewService.verificarProducto1();
        CheckoutTwoOverviewService.verificarProducto2();
    }

    @And("^figura el total del pago$")
    public void totalpago() {
        CheckoutTwoOverviewService.verificarTotalPago();
    }

    @When("^el usuario hace click en \"Finish\"$")
    public void click() {
        CheckoutTwoOverviewService.clickBotonFinish();
    }
}
