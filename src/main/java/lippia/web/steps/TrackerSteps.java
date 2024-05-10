package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Then;
import lippia.web.services.TrackerService;

public class TrackerSteps extends PageSteps {



    @Then("The user verify is in the  tracker")
    public void theUserVerifyIsInTheDashboard() {
        TrackerService.Tracker();
    }
}
