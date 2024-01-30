package starter.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.interactions.ScrollAppium;
import starter.ui.RegisterView;

public class RegisterTask {

    private static final String textToScroll = "Los campos marcados con * son obligatorios";

    public static Performable personalInformation(String typePerson, String typeDocument, String names, String lastName, String email, String mobileNumber, String address, String gender, String birthDate, String documentNumber, String theater, String password) {
        return Task.where("Complete personal information in register",
                Enter.theValue(names).into(RegisterView.NAME),
                Click.on(RegisterView.LAST_NAME),
                Enter.theValue(lastName).into(RegisterView.LAST_NAME),
                Click.on(RegisterView.EMAIL),
                Enter.theValue(email).into(RegisterView.EMAIL),
                Click.on(RegisterView.CONFIRM_EMAIL),
                Enter.theValue(email).into(RegisterView.CONFIRM_EMAIL),
                Click.on(RegisterView.MOBILE_NUMBER),
                Enter.theValue(mobileNumber).into(RegisterView.MOBILE_NUMBER),
                Click.on(RegisterView.ADDRESS),
                Enter.theValue(address).into(RegisterView.ADDRESS),
                Click.on(RegisterView.GENDER),
                Click.on(RegisterView.SELECT_GENDER),
                Click.on(RegisterView.BIRTH_DAY),
                Click.on(RegisterView.EDIT_BIRTH_DAY),
                Click.on(RegisterView.BIRTH_DAY_INPUT),
                Enter.theValue(birthDate).into(RegisterView.BIRTH_DAY_INPUT),
                Click.on(RegisterView.ACCEPT_BIRTH_DAY),
                Click.on(RegisterView.IDENTIFICATION_NUMBER),
                Enter.theValue(documentNumber).into(RegisterView.IDENTIFICATION_NUMBER),
                ScrollAppium.searchText(textToScroll),
                Click.on(RegisterView.THEATER),
                Click.on(RegisterView.SELECT_THEATER),
                Click.on(RegisterView.PASSWORD),
                Click.on(RegisterView.IDENTIFICATION_NUMBER),
                Click.on(RegisterView.PASSWORD),
                Enter.theValue(password).into(RegisterView.PASSWORD),
                Click.on(RegisterView.ACCEPT_TERM),
                Click.on(RegisterView.CONTINUE)
        );
    }
}
