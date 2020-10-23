package co.com.utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.utest.userinterface.DispositivosPage.BTN_SIGUIENTE_PASO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InformacionDispositivos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SIGUIENTE_PASO)
        );
    }

    public static Performable aRegistrar(){
        return instrumented(InformacionDispositivos.class);
    }
}
