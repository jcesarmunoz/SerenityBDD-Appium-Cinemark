package starter.interactions;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScrollAppium implements Task {


    private final String text;

    public ScrollAppium(String text) {
        this.text = text;
    }

    public static ScrollAppium searchText(String text) {
        return instrumented(ScrollAppium.class, text);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb
                .as(actor)
                .getDriver()
                .findElements(
                        AppiumBy.androidUIAutomator(
                                "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + text + "\").instance(0))"
                        ));
    }
}
