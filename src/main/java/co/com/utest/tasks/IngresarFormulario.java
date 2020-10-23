package co.com.utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.utest.userinterface.HomePage.BTN_UNETE_HOY;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarFormulario implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_UNETE_HOY)
        );
    }

    public static Performable deRegistro(){
        return instrumented(IngresarFormulario.class);
    }
}
