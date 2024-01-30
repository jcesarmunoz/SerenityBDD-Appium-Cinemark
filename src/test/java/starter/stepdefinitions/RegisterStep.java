package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.task.HomeTask;
import starter.task.RegisterTask;
import starter.ui.HomeView;

import java.net.MalformedURLException;
import java.time.Duration;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegisterStep {

    @Before
    public void set_the_stage() throws MalformedURLException {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("John can open the app cinemark colombia")
    public void johnCanOpenTheAppCinemarkColombia() {
        theActorCalled("John").attemptsTo(
                HomeTask.goToRegister()
        );
    }

    @When("John complete section personal information with {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void johnCompleteSectionPersonalInformationWith(String typePerson, String typeDocument, String names, String lastName, String email, String mobileNumber, String address, String gender, String birthDate, String documentNumber, String theater, String password) {
        theActorInTheSpotlight().attemptsTo(
                RegisterTask.personalInformation(typePerson, typeDocument, names, lastName, email, mobileNumber, address, gender, birthDate, documentNumber, theater, password)
        );

    }

    @Then("John sees the avatar in the home")
    public void jhonSeesTheAvatarInTheHome() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(HomeView.AVATAR_USER, isVisible()).forNoMoreThan(Duration.ofSeconds(30)),
                Ensure.that(HomeView.AVATAR_USER).isDisplayed()
        );
    }
}
