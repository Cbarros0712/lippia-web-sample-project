package lippia.web.constants;

public class TimeTrackerConstants {


    public static final String CLICK_TIMETRACKER = "xpath://a[@id='manual-mode']";
    public static final String INPUT_DESCRIPTION = "xpath://input[@id='undefined']";

    public static final String INPUT_START_HOUR ="xpath://input-time-ampm[1]//input[1]";
    public static final String INPUT_FINISH_HOUR = "xpath://input-time-ampm[2]//input[1]";

    public static final String INPUT_DATE = "xpath://*[@class='cl-d-flex cl-w-100 cl-mobile-hide-input-date-picker ng-star-inserted'][1]/div[3]/input[1]";

    public static final String ADD_BUTTON = "xpath://button[@class='cl-btn cl-btn-primary cl-d-none cl-d-lg-custom-block']";

    public static final String TIME_TRACKED = "xpath://*[contains(text(),'%s')]";

    public static final String CANCELADO_TRACKED = "xpath://button[@class='cl-btn cl-btn-danger cl-btn-sm cl-d-block cl-d-lg-custom-none']";

    public static final String MESSAGE_TIMETRACKER = "xpath://span[normalize-space()='Are you sure?']";


}
