package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LoginService;

public class LoginSteps extends PageSteps {


    @Given("^el usuario se encuentra en el home de soucedemo$")
    public void navegarWeb() {
        LoginService.navegarWeb();
    }

    // USUARIO CON PARAMETROS
    @Given("^el usuario ingresa con el usuario (.*) y el password (.*)$" )
    public void completarUsuarioYContrasenaconParametros(String usuario, String password) {
        LoginService.completarUsuarioYContrasenaconParametros(usuario,password);

    }

    @When("^el usuario hace click en \"Login\"$")
    public void click() {
        LoginService.clickBotonlogin();
    }

    @Then("^se visualiza el mensaje de error (.*)$")
    public void homepage(String mensajeerror) {
        LoginService.verificarMensajeError(mensajeerror);
    }

}
