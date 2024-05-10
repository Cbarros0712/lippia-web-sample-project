package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.ProjectService;

import java.util.Random;

public class ProjectSteps extends PageSteps {


    @When("The user click on Project option")
    public void theUserClickOnProjectOption() {
        ProjectService.clickProject();
    }
    @When("The user click on Create New Project")
    public void theUserClickOnCreateNewProject() {
       ProjectService.clickNewProject();
    }


    @When("The user set the name of project {string}")
    public void theUserSetTheNameOfProject(String name) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100);
        ProjectService.setNewProject(name + numeroAleatorio);
    }

    @When("The user on log in button Create")
    public void theUserOnLogInButtonCreate() {
        ProjectService.clickCreateProject();
    }

    @Then("The user sees a successful message")
    public void theUserSeesASuccessfulMessage() {
        ProjectService.verifyMensajeExitoso();
    }
}
