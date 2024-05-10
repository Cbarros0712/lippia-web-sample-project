package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.getElement;
import static com.crowdar.core.actions.ActionManager.waitVisibility;

public class LogoutService {

    public static void selectLoginout(){
       // WebActionManager.click(LoginConstants.SELECT_OUT);
        waitVisibility(LoginConstants.SELECT_OUT);
        WebActionManager.click(LoginConstants.SELECT_OUT);
    }

    public static void clickLoginout(){
        //WebActionManager.click(LoginConstants.CLICK_LOGOUT);
        waitVisibility(LoginConstants.CLICK_LOGOUT);
        Assert.assertTrue(getStats().isEmpty());

    }
    public static String getStats() {
        return stats().getText();
    }
    private static WebElement stats() {
        return getElement(LoginConstants.CLICK_LOGOUT);
    }
}
