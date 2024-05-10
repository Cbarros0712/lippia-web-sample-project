package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginConstants;
import org.testng.Assert;

public class TrackerService {

    public static void Tracker(){
        WebActionManager.isPresent(LoginConstants.TRACKER_TEXT);
    }


}
