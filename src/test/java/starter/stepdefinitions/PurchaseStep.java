package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.task.PurchaseTask;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PurchaseStep {

    @When("John and Ana want to see the movie in the day {string} at {string}")
    public void johnAndAnaWantToSeeTheMovieInTheAt(String day, String schedule) {
        theActorCalled("John").attemptsTo(
                PurchaseTask.selectMovie(day, schedule)
        );
    }

    @And("They select seats, snacks and city {string}")
    public void theySelectSeatsSnacksAndSchedule(String city) {
        theActorInTheSpotlight().attemptsTo(
                PurchaseTask.selectSeats(),
                PurchaseTask.buySnacks(),
                PurchaseTask.confirmDetails(city)
        );
    }

    @Then("They can make a payment with credit Card {string}, {string}, {string}, {string}")
    public void theyCanMakeAPaymentWithCreditCard(String numberCard, String nameCard, String securityCode, String expirationDate) {
        theActorInTheSpotlight().attemptsTo(
                PurchaseTask.makesPayment(numberCard, nameCard, securityCode, expirationDate)
        );
    }

    @And("They can see the code Qr and complete the purchase")
    public void theyCanSeeTheCodeQrAndCompleteThePurchase() {
        theActorInTheSpotlight().attemptsTo(
                PurchaseTask.verifyPurchase()
        );
    }
}
