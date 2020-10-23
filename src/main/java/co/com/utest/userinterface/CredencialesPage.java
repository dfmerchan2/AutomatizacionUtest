package co.com.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CredencialesPage {

    public static final Target TXT_CLAVE =
            Target.the("Caja de texto clave").located(By.id("password"));
    public static final Target TXT_CONFIRMAR_CLAVE =
            Target.the("Caja de texto confirmar clave").located(By.id("confirmPassword"));
    public static final Target BTN_TERMINOS_CONDICIONES =
            Target.the("Boton terminos y condiciones").located(By.xpath("//label[contains(.,'uTest Terms')]"));
    public static final Target BTN_PRIVACIDAD =
            Target.the("Boton privacidad").located(By.xpath("//label[contains(.,'Privacy & ')]"));
    public static final Target BTN_CONFIGURACION_COMPLETADA =
            Target.the("Boton configuracion completada").located(By.xpath("//span[contains(.,'Complete Setup')]"));


}
