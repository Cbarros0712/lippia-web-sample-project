package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginConstants;



public class LoginService {

    public static void clickloginManually(){
        WebActionManager.click(LoginConstants.LOGIN_MANUALLY_BUTTON);

    }


    public static void setEmail(String email) {

        WebActionManager.setInput(LoginConstants.EMAIL_IMPUT,email);

    }

    public static void setPassword(String password) {

        WebActionManager.setInput(LoginConstants.PASSWORD_IMPUT,password);

    }

    public static void clickLoginEnter() {

        WebActionManager.click(LoginConstants.LOGINENTER_BUTTON);


    }


    public static void isPresent() {

        WebActionManager.isPresent(LoginConstants.LOGIN_MESSAGE);

    }

    public static void isPresentWITHEMAIL() {

        WebActionManager.isPresent(LoginConstants.MESSAGE_ERRORWITHEMAIL);

    }

    public static void isPresentErrorPassword() {

        WebActionManager.isPresent(LoginConstants.MESSAGE_ERRORPASSWORD);

    }

    public static void isPresentMessageCode() {

        WebActionManager.isPresent(LoginConstants.MESSAGE_CODE);

    }

    public static void clickWithEmail() {

        WebActionManager.click(LoginConstants.WITHEMAIL_BUTTON);


    }


        public static void clickLogout(){
            WebActionManager.click(LoginConstants.LOGOUT_BUTTON);

        }


}
