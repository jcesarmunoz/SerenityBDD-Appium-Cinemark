package starter.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.HomeView;
import starter.ui.PurchaseView;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PurchaseTask {

    public static Performable selectMovie(String day, String schedule) {
        return Task.where("select Movie",
                WaitUntil.the(HomeView.AVATAR_USER, isVisible()).forNoMoreThan(Duration.ofSeconds(30)),
                Ensure.that(HomeView.AVATAR_USER).isDisplayed(),
                Click.on(HomeView.MOVIE),
                WaitUntil.the(PurchaseView.SELECT_DAY.of(day), isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(PurchaseView.SELECT_DAY.of(day)),
                Click.on(PurchaseView.SELECT_SCHEDULE.of(schedule))
        );
    }

    public static Performable selectSeats() {
        return Task.where("select seats",
                WaitUntil.the(PurchaseView.ADD_SEATS, isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(PurchaseView.ADD_SEATS),
                Click.on(PurchaseView.ADD_SEATS),
                Ensure.that(PurchaseView.CART_PRICE).isDisplayed(),
                Click.on(PurchaseView.CONTINUE),
                WaitUntil.the(PurchaseView.TXT_PANTALLA, isVisible()).forNoMoreThan(Duration.ofSeconds(30)),
                Click.on(PurchaseView.SELECT_SEATS),
                Click.on(PurchaseView.SELECT_SEATS_2),
                Click.on(PurchaseView.CONTINUE)
        );
    }

    public static Performable buySnacks() {
        return Task.where("Buy snacks",
                WaitUntil.the(PurchaseView.ACCEPT_LOCATION, isVisible()).forNoMoreThan(Duration.ofSeconds(30)),
                Click.on(PurchaseView.ACCEPT_LOCATION),
                Click.on(PurchaseView.SELECT_SNACKS_1),
                Click.on(PurchaseView.SELECT_SNACKS_2),
                Click.on(PurchaseView.CONTINUE),
                Click.on(PurchaseView.CONTINUE)
        );
    }

    public static Performable confirmDetails(String city) {
        return Task.where("confirm details purchase",
                WaitUntil.the(PurchaseView.SELECT_CITY, isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(PurchaseView.ACCEPT_DATA_POLICIES),
                Click.on(PurchaseView.SELECT_CITY),
                Enter.theValue(city).into(PurchaseView.SELECT_CITY),
                Click.on(PurchaseView.SELECT_CITY),
                Click.on(PurchaseView.SELECT_BOGOTA),
                Click.on(PurchaseView.SCREEM_DETAILS),
                Click.on(PurchaseView.CONTINUE)
        );
    }

    public static Performable makesPayment(String numberCard, String nameCard, String securityCode, String expirationDate) {
        return Task.where("makes payment with credit card",
                WaitUntil.the(PurchaseView.CREDIT_CARD_PAYMENT, isVisible()).forNoMoreThan(Duration.ofSeconds(15)),
                Click.on(PurchaseView.CREDIT_CARD_PAYMENT),
                Click.on(PurchaseView.NAME_CARD),
                Enter.theValue(nameCard).into(PurchaseView.NAME_CARD),
                Click.on(PurchaseView.NUMBER_CARD),
                Enter.theValue(numberCard).into(PurchaseView.NUMBER_CARD),
                Click.on(PurchaseView.EXPIRATION_DATE_CARD),
                Enter.theValue(expirationDate).into(PurchaseView.EXPIRATION_DATE_CARD),
                Click.on(PurchaseView.SECURITY_CODE_CARD),
                Enter.theValue(securityCode).into(PurchaseView.SECURITY_CODE_CARD),
                Click.on(PurchaseView.PAY)
        );
    }

    public static Performable verifyPurchase() {
        return Task.where("verify purchase and qr",
                WaitUntil.the(PurchaseView.CODE_QR, isEnabled()).forNoMoreThan(90).seconds(),
                Ensure.that(PurchaseView.CODE_QR).isEnabled(),
                Click.on(PurchaseView.FINISH_PURCHASE),
                Ensure.that(HomeView.AVATAR_USER).isEnabled()
        );
    }
}
