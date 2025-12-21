package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.CartConstants;
import lippia.web.constants.CheckoutConstants;
import lippia.web.constants.LoginConstants;

import static junit.framework.Assert.assertTrue;

public class CheckoutService extends ActionManager {

    public static void verificarHomepage() {
        waitPresence(CheckoutConstants.CHECKOUT_PAGE_XPATH);
        assertTrue(isPresent(CheckoutConstants.CHECKOUT_PAGE_XPATH));
        assertTrue(getText(CheckoutConstants.CHECKOUT_PAGE_XPATH).contains("Checkout: Your Information"));
    }

    public static void verificarCheckout() {
        waitPresence(CheckoutConstants.CHECKOUT_OVERVIEW_PAGE_XPATH);
        assertTrue(isPresent(CheckoutConstants.CHECKOUT_OVERVIEW_PAGE_XPATH));
        assertTrue(getText(CheckoutConstants.CHECKOUT_OVERVIEW_PAGE_XPATH).contains("Checkout: Overview"));
    }

    public static void completarnombre(String nombre) {
        setInput(CheckoutConstants.FIELD_NAME_XPATH, nombre);
    }

    public static void completarapellido(String apellido) {
        setInput(CheckoutConstants.FIELD_LAST_NAME_XPATH, apellido);
    }

    public static void completarcodigopostal(String cpostal) {
        setInput(CheckoutConstants.FIELD_ZIP_XPATH, cpostal);
    }

    public static void clickContinue() {
        click(CheckoutConstants.BUTTON_CONTINUE_XPATH);

    }
}
