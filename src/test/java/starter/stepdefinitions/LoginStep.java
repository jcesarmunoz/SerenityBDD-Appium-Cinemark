package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import starter.task.HomeTask;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStep {

    @Given("John has an account in cinemark")
    public void johnHasAnAccountInCinemark() {
        theActorCalled("John").attemptsTo(
                HomeTask.goToLogin()
        );
    }

    @When("John enters the {string} and {string}")
    public void johnEntersTheAnd(String user, String password) {
        theActorInTheSpotlight().attemptsTo(
                HomeTask.enterCredentials(user, password)
        );
    }
}
