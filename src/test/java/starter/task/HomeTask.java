package starter.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.HomeView;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class HomeTask {
    public static Performable goToRegister() {
        return Task.where("go to register view",
                WaitUntil.the(HomeView.ALLOW_UBICATION, isEnabled()).forNoMoreThan(60).seconds(),
                Click.on(HomeView.ALLOW_UBICATION),
                WaitUntil.the(HomeView.ALLOW_APP, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(HomeView.ALLOW_APP),
                WaitUntil.the(HomeView.MENU_HOME, isEnabled()).forNoMoreThan(30).seconds(),
                Click.on(HomeView.MENU_HOME),
                Click.on(HomeView.PROFILE),
                Click.on(HomeView.REGISTER)
        );
    }

    public static Performable goToLogin() {
        return Task.where("go to login",
                WaitUntil.the(HomeView.ALLOW_UBICATION, isEnabled()).forNoMoreThan(60).seconds(),
                Click.on(HomeView.ALLOW_UBICATION),
                WaitUntil.the(HomeView.ALLOW_APP, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(HomeView.ALLOW_APP),
                WaitUntil.the(HomeView.ICON_LOGIN, isEnabled()).forNoMoreThan(30).seconds(),
                Click.on(HomeView.ICON_LOGIN)
        );
    }

    public static Performable enterCredentials(String user, String password) {
        return Task.where("enter credentials to login",
                WaitUntil.the(HomeView.EMAIL, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(HomeView.EMAIL),
                Enter.theValue(user).into(HomeView.EMAIL),
                Click.on(HomeView.PASSWORD),
                Enter.theValue(password).into(HomeView.PASSWORD),
                Click.on(HomeView.LOGIN)
        );
    }
}
