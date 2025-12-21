package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import lippia.web.services.CartService;
import lippia.web.services.CheckoutService;
import lippia.web.services.LoginService;

public class CheckoutSteps extends PageSteps {

    @Then("^se visualiza el Titulo de la pagina \"Checkout: Your Information\"$")
    public void Homepage() {
        CheckoutService.verificarHomepage();
    }

    // USUARIO CON PARAMETROS
    @Given("^el usuario ingresa el nombre (.*) en el campo \"First Name\"$" )
    public void completarnombre(String nombre) {
        CheckoutService.completarnombre(nombre);

    }


    @And("^el usuario ingresa el apellido (.*) en el campo \"Last Name\"$" )
    public void completarapellido(String apellido) {
        CheckoutService.completarapellido(apellido);

    }

    @And("^el usuario ingresa el codigo postal (.*) en el campo \"Zip/Postal Code\"$" )
    public void completarcodigopostal(String cpostal) {
        CheckoutService.completarcodigopostal(cpostal);

    }

    @When("^el usuario hace click en \"Continue\"$")
    public void click() {
        CheckoutService.clickContinue();
    }


    @Then("^se visualiza el título de la página siguiente \"Checkout: Overview\"$")
    public void verificarPaginaOverview() {
        CheckoutService.verificarCheckout();
    }


}
