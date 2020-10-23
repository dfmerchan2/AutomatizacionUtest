package co.com.utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.utest.userinterface.CredencialesPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarCredenciales implements Task {

    private String clave;

    public IngresarCredenciales(String clave) {
        this.clave = clave;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(clave).into(TXT_CLAVE),
                Enter.theValue(clave).into(TXT_CONFIRMAR_CLAVE)

        );
    }

    public static Performable aEstablecer(String clave){
        return instrumented(IngresarCredenciales.class, clave);
    }
}
