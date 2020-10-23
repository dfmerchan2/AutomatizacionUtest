package co.com.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class DispositivosPage{
    public static final Target BTN_SIGUIENTE_PASO =
            Target.the("Boton siguiente paso").located(By.xpath("//span[contains(.,'Next: Last Step')]"));
}
