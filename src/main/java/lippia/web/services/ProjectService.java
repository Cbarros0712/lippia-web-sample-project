package lippia.web.services;


import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.ProjectConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.getElement;
import static com.crowdar.core.actions.ActionManager.waitVisibility;

public class ProjectService {

    public static void clickProject() {
        //WebActionManager.click(ProjectConstants.PROJECT_BUTTON);
        waitVisibility(ProjectConstants.PROJECT_BUTTON);
        WebActionManager.click(ProjectConstants.PROJECT_BUTTON);
    }

    public static void clickNewProject() {
       // WebActionManager.click(ProjectConstants.NEW_PROJECT_BUTTON);
        waitVisibility(ProjectConstants.NEW_PROJECT_BUTTON);
        WebActionManager.click(ProjectConstants.NEW_PROJECT_BUTTON);
    }
    public static void setNewProject(String name) {
        WebActionManager.waitClickable(ProjectConstants.NAME_PROJECT);
        WebActionManager.setInput(ProjectConstants.NAME_PROJECT, name);
    }
    public static void clickCreateProject() {
        waitVisibility(ProjectConstants.CREATE_BUTTON);
        WebActionManager.click(ProjectConstants.CREATE_BUTTON);
    }
    public static void verifyMensajeExitoso() {
        waitVisibility(ProjectConstants.MENSAJE_EXITOSO);
        Assert.assertFalse(getMensajeExitoso().isEmpty());
    }

    public static String getMensajeExitoso() {
        return MensajeExitoso().getText();
    }

    private static WebElement MensajeExitoso() {
        return getElement(ProjectConstants.MENSAJE_EXITOSO);
    }
}