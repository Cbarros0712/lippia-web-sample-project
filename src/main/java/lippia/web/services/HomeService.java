package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class HomeService  {

    public static void navegarWeb(){

        navigateTo(PropertyManager.getProperty("web.base.url"));


    }


    public static void clickLoginButton() {
      WebActionManager.click(LoginConstants.LOGIN_BUTTON);


    }

    public static void navegarLogin() {
        navigateTo(PropertyManager.getProperty("web-app.url_login"));

    }
}
