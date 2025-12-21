package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import junit.framework.Assert;
import lippia.web.constants.CartConstants;
import lippia.web.constants.InventoryConstants;

import static junit.framework.Assert.assertTrue;

public class CartService extends ActionManager {

    public static void verificarHomepage() {
        waitPresence(CartConstants.CART_PAGE_XPATH);
        assertTrue(isPresent(CartConstants.CART_PAGE_XPATH));
        assertTrue(getText(CartConstants.CART_PAGE_XPATH).contains("Your Cart"));
        //Assert.assertEquals(getText(InventoryConstants.TITLE_PAGE_XPATH),"Products");
    }

    public static void Verificarproductosencarrito() {
        waitPresence(CartConstants.BACKPACK_CSS);
        assertTrue(isPresent(CartConstants.BACKPACK_CSS));
        assertTrue(getText(CartConstants.BACKPACK_CSS).contains("Sauce Labs Backpack"));
        waitPresence(CartConstants.BIKE_CSS);
        assertTrue(isPresent(CartConstants.BIKE_CSS));
        assertTrue(getText(CartConstants.BIKE_CSS).contains("Sauce Labs Bike Light"));
    }

    public static void ClickenCheckout() {
        click(CartConstants.CHECKOUT_XPATH);
    }

}
