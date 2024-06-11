package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.*;
import lippia.web.constants.LoginConstants;
import lippia.web.services.HomeService;
import lippia.web.services.LoginService;
import lippia.web.services.LogoutService;
import org.testng.Assert;

public class LoginSteps extends PageSteps {

    @Given("The user is on home page")
    public void theClientIsOnHomePage() {

        HomeService.navegarWeb();
    }

    @When("The user click on log in button on landing page")
    public void theClientClickOnLogInButtonOnLandingPage() {

       HomeService.clickLoginButton();
    }

    @When("The user click on log in manually button")
    public void theClientClickOnLogInManuallyButton() {

        LoginService.clickloginManually();
    }

    @When("The user set the email {string}")
    public void theClientSetTheEmail(String email) {
        LoginService.setEmail(email);
        
    }

    @And("The user  set the password {string}")
    public void theClientSetThePassword(String password) {
        LoginService.setPassword(password);
        
    }


    @Given("The user is on page login")
    public void theUserIsOnPageLogin() {
       HomeService.navegarLogin();
    }

    @When("The user set  the  {string} and  {string}")
    public void theUserSetTheAnd(String email, String password) {

        LoginService.setEmail(email);
        LoginService.setPassword(password);

    }

    @Then("The user should be able to see message error")
    public void theUserShouldBeAbleToSeeMessageError() {
        Assert.assertTrue(LoginConstants.MESSAGE_ERRORLOGIN .contains("Invalid email or password"));
    }


    @And("The user click on log in button")
    public void theUserClickOnLogInButton() {
        LoginService.clickLoginEnter();

    }

    @When("The user click on log in button Continue With Email")
    public void theUserClickOnLogInButtonContinueWithEmail() {
       LoginService.clickWithEmail();

    }

    @Then("The user verify see mensagge code")
    public void theUserVerifySeeMensaggeCode() {
        Assert.assertTrue(LoginConstants.MESSAGE_CODE.contains("Enter the verification code sent to"));

    }

    @When("The user set  the  {string}")
    public void theUserSetThe(String email) {
        LoginService.setEmail(email);
    }

    @Then("The user should be able to see message invalid")
    public void theUserShouldBeAbleToSeeMessageInvalid() {
        Assert.assertTrue(LoginConstants.MESSAGE_ERRORPASSWORD.contains("Email format is not valid"));
    }

    @Then("The user should be able to see message error password is requered")
    public void theUserShouldBeAbleToSeeMessageErrorPasswordIsRequered() {

        Assert.assertTrue(LoginConstants.MESSAGE_ERRORLOGIN.contains("Invalid email or password"));
    }

    @When("The user click on log out in button")
    public void theUserClickOnLogOutInButton() {
        LoginService.clickLogout();
    }
        @When("The user select log out")
        public void theUserselectLogOutInButton() {
            LogoutService.selectLoginout();


    }

    @Then("The user click on log out")
    public void theUserClickOnLogOut() {
        LogoutService.clickLoginout();
    }
}
