package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeView {
    public static Target ALLOW_UBICATION =
            Target.the("allow ubication button").located(By.xpath("//android.widget.Button[contains(@content-desc,'PERMITIR OBTENER')]"));
    public static Target ALLOW_APP =
            Target.the("allow execute app button").located(By.xpath("//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_foreground_only_button']"));
    public static Target MENU_HOME =
            Target.the("principal menu button").located(By.xpath("//android.view.View[contains(@content-desc,'Menu')]"));
    public static Target PROFILE =
            Target.the("profile button").located(AppiumBy.accessibilityId("Perfil"));
    public static Target REGISTER =
            Target.the("register button").located(AppiumBy.accessibilityId("Registrarse"));
    public static Target ICON_LOGIN =
            Target.the("icon login in home").located(By.xpath("//android.widget.Button"));
    public static Target EMAIL =
            Target.the("input email").located(By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]"));
    public static Target PASSWORD =
            Target.the("input password").located(By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]"));
    public static Target LOGIN =
            Target.the("login button").located(By.xpath("//android.widget.Button[contains(@content-desc,'INICIAR')]"));
    public static Target AVATAR_USER =
            Target.the("avatar icon").located(AppiumBy.accessibilityId("JG"));
    public static Target MOVIE =
            Target.the("select movie").located(By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.view.View[9]/android.view.View/android.view.View[1]"));

}
