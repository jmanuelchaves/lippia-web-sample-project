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
    @Given("^el usuario ingresa con credenciales válidas$")
    public void completarUsuarioYContrasena() {
        LoginService.completarUsuarioYContrasena();
    }

    @When("^el usuario hace click en \"Login\"$")
    public void click() {
        LoginService.clickBotonlogin();
    }

    @Given("^el usuario ingresa con credenciales inválidas$")
    public void completarUsuarioYContrasenainvalida() {
        LoginService.completarUsuarioYContrasenainvalida();
    }

    @Then("^se visualiza el mensaje de error \"Epic sadface: Sorry, this user has been locked out.\"$")
    public void homepage() {

        LoginService.verificarMensajeError();
    }

    // USUARIO CON PARAMETROS
    @Given("^el usuario ingresa con el usuario (.*) y el password (.*)$" )
    public void completarUsuarioYContrasenaconParametros(String usuario, String password) {
        LoginService.completarUsuarioYContrasenaconParametros(usuario,password);

    }

}
