package co.com.utest.tasks;

import co.com.utest.models.DatosDireccion;
import co.com.utest.models.builder.DatosDireccionBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.utest.userinterface.DireccionPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InformacionDireccion implements Task {

    private DatosDireccion datosDireccion;

    public InformacionDireccion(DatosDireccion datosDireccion) {
        this.datosDireccion = datosDireccion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datosDireccion.getCiudad()).into(TXT_CIUDAD),
                Click.on(BTN_CIUDADES.of(datosDireccion.getCiudad())),
                Enter.theValue(datosDireccion.getCodigoPostal()).into(TXT_CODIGO_POSTAL),
                Ensure.that(TXT_PAIS).text().isEqualTo(datosDireccion.getPais()),
                Click.on(BTN_SIGUIENTE_DISPOSITIVOS)
        );
    }

    public static Performable aRegistrar(DatosDireccionBuilder datosDireccionBuilder){
        return instrumented(InformacionDireccion.class, datosDireccionBuilder.builder());
    }
}
