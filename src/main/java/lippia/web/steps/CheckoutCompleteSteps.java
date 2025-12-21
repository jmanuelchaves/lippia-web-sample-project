package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.CheckoutCompleteService;

public class CheckoutCompleteSteps extends PageSteps {




    @Then("^se presenta un mensaje de éxito \"Thank you for your order!\"$")
    public void MensajeExito() {
        CheckoutCompleteService.verificationsExit();
    }

    @And("^el botón \"Back Home\" se encuentra visible$")
    public void BotonBackHome() {
        CheckoutCompleteService.verificarBotonBackHome();
    }


}
