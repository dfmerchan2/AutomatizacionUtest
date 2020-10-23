package co.com.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DireccionPage {

    public static final Target TXT_CIUDAD =
            Target.the("Caja de texto ciudad").located(By.id("city"));
    public static final Target BTN_CIUDADES =
            Target.the("Caja de texto ciudades").locatedBy("(//span[@class='pac-matched' and contains (text(),'{0}')])[1]");
    public static final Target TXT_CODIGO_POSTAL =
            Target.the("Caja de texto codigo postal").located(By.id("zip"));
    public static final Target TXT_PAIS =
            Target.the("Caja de texto ciudad").located(By.xpath("//span[@class='ui-select-match-text pull-left']"));
    public static final Target BTN_SIGUIENTE_DISPOSITIVOS =
            Target.the("Boton siguiente dispositivoss").located(By.xpath("//span[contains(.,'Next: Devices')]"));

}
