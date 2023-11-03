package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginConstants;
import com.crowdar.examples.services.LoginService;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class LoginSteps extends PageSteps {

    @Given("The app is loaded correctly")
    @Then("Login page is displayed")
    public void isLoginPageVisible() {
        LoginService.isViewLoaded();
    }

    @When("The user goes to the Sign Up page")
    public void goToSignUp() {
        MobileActionManager.click(LoginConstants.SIGN_UP_BUTTON_LOCATOR);
    }

    @When("The user logs in the application with: (.*), (.*)")
    public void doLoginProcess(String email, String password) {
        LoginService.doLogin(email, password);
    }

    @Given("Se dirige a la aplicacion de Clockify")
    public void seDirigeALaAplicacionDeClockify() {

        LoginService.iniciarClockify();
    }

    @When("Completa los campos de Email y Password")
    public void completaLosCamposDeEmailYPassword() {
        MobileActionManager.click(LoginConstants.SIGN_UP_BUTTON_LOCATOR);
    }

    @io.cucumber.java.en.When("The user logs in the application with : {}, {}")
    public void theUserLogsInTheApplicationWith(String arg0, String arg1) {
    }

    @io.cucumber.java.en.When("Selecciona el campo de email")
    public void seleccionaElCampoDeEmail() {
        MobileActionManager.click(LoginConstants.EMAIL_INPUT_LOCATOR);

    }
}
