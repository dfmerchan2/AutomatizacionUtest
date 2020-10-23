package co.com.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalPage {
    public static final Target TXT_NOMBRE =
            Target.the("Caja de texto nombre").located(By.id("firstName"));
    public static final Target TXT_APELLIDI =
            Target.the("Caja de texto apellido").located(By.id("lastName"));
    public static final Target TXT_CORREO =
            Target.the("Caja de correo").located(By.id("email"));
    public static final Target LST_MESES =
            Target.the("Lista de meses").located(By.id("birthMonth"));
    public static final Target LST_DIAS =
            Target.the("Lista de dias").located(By.id("birthDay"));
    public static final Target LST_YEARS =
            Target.the("Lista de años").located(By.id("birthYear"));
    public static final Target BTN_SIGUIENTE_DIRECCION =
            Target.the("Lista de años").located(By.xpath("//span[contains(.,'Next: Location')]"));
}
