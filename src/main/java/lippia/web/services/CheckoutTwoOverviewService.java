package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import junit.framework.Assert;
import lippia.web.constants.CheckoutConstants;
import lippia.web.constants.CheckoutTwoOverviewConstants;
import lippia.web.constants.InventoryConstants;
import lippia.web.constants.LoginConstants;

import static junit.framework.Assert.assertTrue;

public class CheckoutTwoOverviewService extends ActionManager {

        public static void verificarProducto1() {
            waitPresence(CheckoutTwoOverviewConstants.PACK_CHECKOUT_XPATH);
            Assert.assertTrue(getText(CheckoutTwoOverviewConstants.PACK_CHECKOUT_XPATH).contains("Sauce Labs Backpack"));

        }
        public static void verificarProducto2() {
            waitPresence(CheckoutTwoOverviewConstants.BIKE_CHECKOUT_XPATH);
            Assert.assertTrue(getText(CheckoutTwoOverviewConstants.BIKE_CHECKOUT_XPATH).contains("Sauce Labs Bike Light"));

        }

        public static void verificarTotalPago() {
        waitPresence(CheckoutTwoOverviewConstants.TOTAL_CHECKOUT_XPATH);
        }

        public static void clickBotonFinish() {
            click(CheckoutTwoOverviewConstants.BUTTON_FINNISH_XPATH);

    }
}
