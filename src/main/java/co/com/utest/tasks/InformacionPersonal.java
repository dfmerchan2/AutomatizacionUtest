package co.com.utest.tasks;

import co.com.utest.models.DatosPersonales;
import co.com.utest.models.builder.DatosPersonalesBuilder;
import co.com.utest.utils.Obtener;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.utest.userinterface.PersonalPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InformacionPersonal implements Task {

    private DatosPersonales datosPersonales;

    public InformacionPersonal(DatosPersonales datosPersonales) {
        this.datosPersonales = datosPersonales;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datosPersonales.getNombre()).into(TXT_NOMBRE),
                Enter.theValue(datosPersonales.getApellido()).into(TXT_APELLIDI),
                Enter.theValue(datosPersonales.getCorreo()).into(TXT_CORREO),
                SelectFromOptions.byVisibleText(Obtener.mes(datosPersonales.getFechaNacimiento())).from(LST_MESES),
                SelectFromOptions.byVisibleText(Obtener.dia(datosPersonales.getFechaNacimiento())).from(LST_DIAS),
                SelectFromOptions.byVisibleText(Obtener.year(datosPersonales.getFechaNacimiento())).from(LST_YEARS),
                Click.on(BTN_SIGUIENTE_DIRECCION)
        );
    }

    public static Performable aRegistrar(DatosPersonalesBuilder datosPersonalesBuilder){
        return instrumented(InformacionPersonal.class, datosPersonalesBuilder.builder());
    }
}
