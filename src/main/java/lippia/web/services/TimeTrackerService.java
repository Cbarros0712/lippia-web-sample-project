package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginConstants;
import lippia.web.constants.TimeTrackerConstants;
import org.testng.Assert;

import java.time.Instant;

import static com.crowdar.core.actions.ActionManager.waitVisibility;

public class TimeTrackerService {

    public static void clickTimeTracker(){
        waitVisibility(TimeTrackerConstants.CLICK_TIMETRACKER);
        WebActionManager.click(TimeTrackerConstants.CLICK_TIMETRACKER);

    }
    public static String generateUniqueDescription() {
        return "Description" + Instant.now().getEpochSecond();
    }

    public static void inputDescription(String description) {
        WebActionManager.setInput(TimeTrackerConstants.INPUT_DESCRIPTION, description);
    }

    public static void inputStartHour(String hour) {
        WebActionManager.setInput(TimeTrackerConstants.INPUT_START_HOUR, "\b\b\b\b");
        WebActionManager.setInput(TimeTrackerConstants.INPUT_START_HOUR, hour);
    }

    public static void inputFinishHour(String hour) {
        WebActionManager.setInput(TimeTrackerConstants.INPUT_FINISH_HOUR, "\b\b\b\b");
        WebActionManager.setInput(TimeTrackerConstants.INPUT_FINISH_HOUR, hour);
    }

    public static void inputDate(String date) {
        WebActionManager.click(TimeTrackerConstants.INPUT_DATE);
        WebActionManager.setInput(TimeTrackerConstants.INPUT_DATE, "\b\b\b\b\b\b\b\b\b\b");
        WebActionManager.setInput(TimeTrackerConstants.INPUT_DATE, date);
    }

    public static void clickADDButton() {
        WebActionManager.click(TimeTrackerConstants.ADD_BUTTON);


    }


    public static void verifyTimeTracked(String name) {
        WebActionManager.waitPresence(TimeTrackerConstants.TIME_TRACKED, name);
        Assert.assertTrue(WebActionManager.isPresent(TimeTrackerConstants.TIME_TRACKED, name));
    }

    public static void clickCancelarTimeTracker() {
        WebActionManager.isPresent(TimeTrackerConstants.MESSAGE_TIMETRACKER);


    }
}
