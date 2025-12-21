package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import junit.framework.Assert;
import lippia.web.constants.CheckoutCompleteConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;
public class CheckoutCompleteService extends ActionManager {


        public static void verificationsExit() {
            waitPresence(CheckoutCompleteConstants.SUCCESS_MESSAGE_XPATH);
            Assert.assertTrue(getText(CheckoutCompleteConstants.SUCCESS_MESSAGE_XPATH).contains("Thank you for your order!"));

        }
        public static void verificarBotonBackHome() {
            waitPresence(CheckoutCompleteConstants.BUTTON_BACKHOME_XPATH);
            Assert.assertTrue(getText(CheckoutCompleteConstants.BUTTON_BACKHOME_XPATH).contains("Back Home"));

        }


}
