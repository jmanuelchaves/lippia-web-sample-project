package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import junit.framework.Assert;
import lippia.web.constants.LoginConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static junit.framework.Assert.assertTrue;

public class LoginService extends ActionManager {

    public static void navegarWeb() { navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clickBotonlogin() {
        click(LoginConstants.BUTTON_LOGIN_CSS);

    }

    public static void verificarMensajeError(String mensajeerror) {
        waitPresence(LoginConstants.ERROR_MESSAGE_XPATH);
        Assert.assertTrue(isPresent(LoginConstants.ERROR_MESSAGE_XPATH));
        Assert.assertTrue(getText(LoginConstants.ERROR_MESSAGE_XPATH).contains(mensajeerror));
    }

    public static void completarUsuarioYContrasenaconParametros(String usuario, String password) {
        setInput(LoginConstants.INPUT_USER_CSS, usuario);
        setInput(LoginConstants.INPUT_PASSWORD_CSS, password);
    }
}
