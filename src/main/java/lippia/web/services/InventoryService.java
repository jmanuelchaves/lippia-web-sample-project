package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import junit.framework.Assert;
import lippia.web.constants.InventoryConstants;

import static junit.framework.Assert.assertTrue;

public class InventoryService extends ActionManager {

    public static void verificarHomepage() {
        waitPresence(InventoryConstants.TITLE_PAGE_XPATH);
        assertTrue(isPresent(InventoryConstants.TITLE_PAGE_XPATH));
        assertTrue(getText(InventoryConstants.TITLE_PAGE_XPATH).contains("Products"));
        //Assert.assertEquals(getText(InventoryConstants.TITLE_PAGE_XPATH),"Products");
    }

    public static void ClickAgregarAlCarrito() {
        click(InventoryConstants.BUTTON_CART_BACKPACK_XPATH);
    }

    public static void ClickAgregarAlCarrito2() {
        click(InventoryConstants.BUTTON_LAB_BIKE_XPATH);
    }

    public static void VerificarCarrito() {
        waitPresence(InventoryConstants.BUTTON_SHOPPINGCART_XPATH);
        Assert.assertTrue(getText(InventoryConstants.BUTTON_SHOPPINGCART_XPATH).contains("1"));
    }

    public static void VerificarCarrito2() {
        waitPresence(InventoryConstants.BUTTON_SHOPPINGCART_XPATH);
        Assert.assertTrue(getText(InventoryConstants.BUTTON_SHOPPINGCART_XPATH).contains("2"));
    }

    public static void ClickenCarrito() {
        click(InventoryConstants.BUTTON_CART);
    }

    public static void ClickEliminarCarrito() {
        click(InventoryConstants.BUTTON_REMOVE_ID);
    }
    public static void CarritoNOVisible() {
        //Assert.assertFalse(getText(InventoryConstants.BUTTON_SHOPPINGCART_XPATH).contains("1"));
        waitInvisibility(InventoryConstants.BUTTON_SHOPPINGCART_BADGE_XPATH);
    }


}
