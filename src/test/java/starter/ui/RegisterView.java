package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterView {

    public static Target NAME =
            Target.the("name user input").located(By.xpath("//android.widget.ScrollView/android.widget.EditText[1]"));
    public static Target LAST_NAME =
            Target.the("last name user input").located(By.xpath("//android.widget.ScrollView/android.widget.EditText[2]"));

    public static Target EMAIL =
            Target.the("email user input").located(By.xpath("//android.widget.ScrollView/android.widget.EditText[3]"));

    public static Target CONFIRM_EMAIL =
            Target.the("confirm email input").located(By.xpath("//android.widget.ScrollView/android.widget.EditText[4]"));

    public static Target MOBILE_NUMBER =
            Target.the("mobile number input").located(By.xpath("//android.widget.ScrollView/android.widget.EditText[5]"));

    public static Target ADDRESS =
            Target.the("address input").located(By.xpath("//android.widget.ScrollView/android.widget.EditText[6]"));

    public static Target GENDER =
            Target.the("gender button").located(By.xpath("//android.widget.Button[contains(@content-desc,'opcional')]"));

    public static Target SELECT_GENDER =
            Target.the("select gender list").located(By.xpath("//android.view.View[@content-desc='Masculino']"));

    public static Target BIRTH_DAY =
            Target.the("birth day button").located(By.xpath("//android.widget.ScrollView/android.view.View[3]"));

    public static Target EDIT_BIRTH_DAY =
            Target.the("edit birth day button").located(By.xpath("//android.view.View[contains(@content-desc,'SELECCIONA UNA FECHA')]/android.widget.Button[1]"));

    public static Target BIRTH_DAY_INPUT =
            Target.the("birth day input").located(By.xpath("//android.widget.EditText[@text='12/12/2012']"));

    public static Target ACCEPT_BIRTH_DAY =
            Target.the("accept birth day button").located(AppiumBy.accessibilityId("ACEPTAR"));

    public static Target IDENTIFICATION_NUMBER =
            Target.the("identification number input").located(By.xpath("(//android.widget.Button[contains(@content-desc,'Tipo de documento')]//following-sibling::android.widget.EditText)[1]"));

    public static Target THEATER =
            Target.the("theater button").located(AppiumBy.accessibilityId("Teatro de preferencia *"));

    public static Target SELECT_THEATER =
            Target.the("select theater list").located(AppiumBy.accessibilityId("Lab v5 Multiplaza"));

    public static Target PASSWORD =
            Target.the("password input").located(By.xpath("(//android.widget.Button[contains(@content-desc,'Tipo de documento')]//following-sibling::android.widget.EditText)[2]"));

    public static Target ACCEPT_TERM =
            Target.the("accept terms and conditions checkbox").located(By.xpath("//android.widget.ScrollView/android.view.View[2]"));

    public static Target CONTINUE =
            Target.the("continue button").located(By.xpath("//android.widget.Button[@content-desc='CONTINUAR']"));


}
