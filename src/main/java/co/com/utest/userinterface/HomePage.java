package co.com.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    private HomePage() {
    }

    public static final Target BTN_UNETE_HOY =
            Target.the("Boton unete hoy").located(By.xpath("//ul[@class='nav navbar-nav']//a[contains(.,'Join Today')]"));
}
