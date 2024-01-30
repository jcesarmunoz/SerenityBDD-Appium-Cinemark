package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PurchaseView {
    public static Target SELECT_DAY =
            Target.the("day button").locatedBy("//android.view.View[contains(@content-desc,'{0}')]");
    public static Target SELECT_SCHEDULE =
            Target.the("schedule button").locatedBy("//android.view.View[@content-desc='{0}']");
    public static Target ADD_SEATS =
            Target.the("adding seats button").located(By.xpath("//android.view.View[contains(@content-desc,'General')]/android.widget.Button[2]"));
    public static Target CART_PRICE =
            Target.the("icon cart price").located(By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]"));
    public static Target TXT_PANTALLA =
            Target.the("text pantalla").located(AppiumBy.accessibilityId("Pantalla"));
    public static Target SELECT_SEATS =
            Target.the("seat button").located(By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[6]/android.view.View/android.view.View[9]"));
    public static Target SELECT_SEATS_2 =
            Target.the("seat button").located(By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[6]/android.view.View/android.view.View[10]"));
    public static Target ACCEPT_LOCATION =
            Target.the("accept location button").located(AppiumBy.accessibilityId("ACEPTAR"));
    public static Target SELECT_SNACKS_1 =
            Target.the("adding snacks button").locatedBy("//android.view.View[contains(@content-desc,'COMBO TU Y YO')]/android.view.View[2]");

    public static Target SELECT_SNACKS_2 =
            Target.the("adding snacks button").locatedBy("//android.view.View[contains(@content-desc,'COMBO TU Y YO')]/android.view.View[3]");
    public static Target SELECT_CITY =
            Target.the("city input").located(By.xpath("(//android.widget.Button[contains(@content-desc,'Tipo de documento')]//following-sibling::android.widget.EditText)[2]"));

    public static Target SELECT_BOGOTA =
            Target.the("select city bogota list").located(By.xpath("//android.view.View[contains(@content-desc,'BOGOTA')]"));

    public static Target SCREEM_DETAILS =
            Target.the("screem details").located(By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]"));

    public static Target ACCEPT_DATA_POLICIES =
            Target.the("accept data policies checkbox ").located(By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]"));
    public static Target CONTINUE =
            Target.the("continue button").located(AppiumBy.accessibilityId("CONTINUAR"));

    public static Target CREDIT_CARD_PAYMENT =
            Target.the("select credit card button").located(By.xpath("//android.view.View[contains(@content-desc,'Tarjeta')]"));

    public static Target NAME_CARD =
            Target.the("name card input").located(By.xpath("(//android.view.View[contains(@content-desc,'Tarjeta')]//following-sibling::android.widget.EditText)[1]"));

    public static Target NUMBER_CARD =
            Target.the("number card input").located(By.xpath("(//android.view.View[contains(@content-desc,'Tarjeta')]//following-sibling::android.widget.EditText)[2]"));

    public static Target EXPIRATION_DATE_CARD =
            Target.the("expiration date input").located(By.xpath("(//android.view.View[contains(@content-desc,'Tarjeta')]//following-sibling::android.widget.EditText)[3]"));

    public static Target SECURITY_CODE_CARD =
            Target.the("security code input").located(By.xpath("(//android.view.View[contains(@content-desc,'Tarjeta')]//following-sibling::android.widget.EditText)[4]"));

    public static Target PAY =
            Target.the("pay button").located(AppiumBy.accessibilityId("PAGAR"));

    public static Target CODE_QR =
            Target.the("code qr image").located(By.xpath("//android.view.View[@content-desc='qr code']"));

    public static Target FINISH_PURCHASE =
            Target.the("finish purchase button").located(AppiumBy.accessibilityId("FINALIZAR"));
}
