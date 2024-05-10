package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.constants.WorkspaceConstants;
import lippia.web.services.WorkspaceService;

import java.util.Random;

import static com.crowdar.core.actions.ActionManager.waitVisibility;

public class WorkspaceSteps extends PageSteps {

    @When("The user on log in button menu workspace")
    public void theUserOnLogInButtonMenuWorkspace() {
        waitVisibility(WorkspaceConstants.MENU_WORKSPACE_BUTTON);
        WebActionManager.click(WorkspaceConstants.MENU_WORKSPACE_BUTTON);
    }

    @When("The User on log in button Administrar workspace")
    public void theUserOnLogInButtonAdministrarWorkspace() {
        waitVisibility(WorkspaceConstants.GESTIONAR_WORKSPACE_BUTTON);
        WebActionManager.click(WorkspaceConstants.GESTIONAR_WORKSPACE_BUTTON);
    }
    @When("The User on log in button Crear workspace")
    public void theUserOnLogInButtonCrearWorkspace() {
        waitVisibility(WorkspaceConstants.CREAR_NUEVO_WORKSPACE_BUTTON);
        WebActionManager.click(WorkspaceConstants.CREAR_NUEVO_WORKSPACE_BUTTON);
    }

    @When("The User set the name of workspace {string}")
    public void theUserSetTheNameOfWorkspace(String Workspace) {
        WebActionManager.waitClickable(WorkspaceConstants.NOMBRE_WORKSPACE);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100);
        WorkspaceService.setWorkspace(Workspace + numeroAleatorio);
    }

    @When("The User on log in button Crear")
    public void theUserOnLogInButtonCrear() {
        WebActionManager.click(WorkspaceConstants.CREAR_BUTTON);
    }

    @When("The User on log in button Settings workspace")
    public void theUserOnLogInButtonSettingsWorkspace() {
        waitVisibility(WorkspaceConstants.SETTING_BUTTON);
        WebActionManager.click(WorkspaceConstants.SETTING_BUTTON);
    }

    @When("The User set the workspace name {string} in the modification.")
    public void theUserSetTheWorkspaceNameInTheModification(String NombreWorkspace) {
        WorkspaceService.setWorkspaceModificacion(NombreWorkspace);
    }

    @When("The User on log in button upgrade")
    public void theUserOnLogInButtonUpgrade() {
        waitVisibility(WorkspaceConstants.UPGRADE_BUTTON);
        WebActionManager.click(WorkspaceConstants.UPGRADE_BUTTON);
    }

    @Then("The User modify the workspace")
    public void theUserModifyTheWorkspace() {
        WorkspaceService.verifyMensajeExitoso();
    }

    @When("The User on log in div")
    public void theUserOnLogInDiv() {
        waitVisibility(WorkspaceConstants.DIV);
    }
}


