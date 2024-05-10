package lippia.web.constants;

public class LoginConstants {

    public static final String LOGIN_BUTTON = "xpath://*[contains( text(),'Log in')]";

    public static final String LOGIN_MANUALLY_BUTTON = "xpath://*[contains( text(),'manually')]";

    public static final String EMAIL_IMPUT = "xpath://input[@id='email']";

    public static final String PASSWORD_IMPUT = "xpath://input[@id='password']";

    public static final String LOGINENTER_BUTTON = "xpath://button[normalize-space()='Log In']";

    public static final String TRACKER_TEXT = "xpath://*[contains( text(),'Let’s start tracking!')]";

    public static final String LOGIN_MESSAGE = "xpath://span[normalize-space()='Invalid email or password']";

    public static final String MESSAGE_ERRORLOGIN = "xpath://span[normalize-space()='Invalid email or password']";

    public static final String WITHEMAIL_BUTTON = "xpath://button[normalize-space()='Continue with email']";

    public static final String MESSAGE_CODE = "xpath://span[normalize-space()='Enter the verification code sent to']";

    public static final String MESSAGE_ERRORWITHEMAIL = "xpath://span[@class='cl-invalid-feedback cl-block cl-mt-0 ng-tns-c128-2 ng-star-inserted']";

    public static final String MESSAGE_ERRORPASSWORD = "xpath://span[normalize-space()='Email format is not valid']";

    public static final String LOGOUT_BUTTON = "xpath://span[normalize-space()='KD']";

    public static final String SELECT_OUT ="xpath://*[@id=\"topbar-menu\"]/div/div[2]/div/app-user-settings/div/div/div[1]/a/span"; // "xpath://div[@class='cl-dropdown-menu cl-dropdown-menu-right cl-dropdown-menu-user-profile ng-star-inserted']";

    public static final String CLICK_LOGOUT = "xpath://*[@id=\"topbar-menu\"]/div/div[1]/div[2]/div/img";
}
