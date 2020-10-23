package co.com.utest.stepdefinitions;

import co.com.utest.interactions.AbrirNavegador;
import co.com.utest.tasks.*;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static co.com.utest.models.builder.DatosPersonalesBuilder.datosPersonales;
import static co.com.utest.models.builder.DatosDireccionBuilder.datosDireccion;

public class RegistrarStepDefinition {

    @Dado("^que (.*) esta en el formulario de registro$")
    public void queDiegoEstaEnElFormularioDeRegistro(String actor) {
        theActorCalled(actor).attemptsTo(
                AbrirNavegador.deUTest(),
                IngresarFormulario.deRegistro()
        );
    }

    @Y("^ingrese la informacion personal$")
    public void ingreseLaInformacionPersonal(List<Map<String, String>> data) {
        theActorInTheSpotlight().attemptsTo(
                InformacionPersonal.aRegistrar(datosPersonales()
                        .conNombre(data.get(0).get("Nombre"))
                        .conApellido(data.get(0).get("Apellido"))
                        .conCorreo(data.get(0).get("Correo"))
                        .conFechaNacimiento(data.get(0).get("FechaNacimiento")))
        );
    }

    @Y("^la informacion de direcciones$")
    public void laInformacionDeDirecciones(List<Map<String, String>> data) {
        theActorInTheSpotlight().attemptsTo(
                InformacionDireccion.aRegistrar(datosDireccion()
                        .conCiudad(data.get(0).get("Ciudad"))
                        .conCodigoPostal(data.get(0).get("CodigoPostal"))
                        .conPais(data.get(0).get("Pais")))
        );
    }

    @Y("^la informacion de dipositivos$")
    public void laInformacionDeDipositivos(List<Map<String, String>> data) {
        theActorInTheSpotlight().attemptsTo(
                InformacionDispositivos.aRegistrar()
        );
    }

    @Entonces("^ingresa la clave (.*)$")
    public void ingresaLaClave(String clave) {
        theActorInTheSpotlight().attemptsTo(
                IngresarCredenciales.aEstablecer(clave)
        );
    }

    @Y("^observara el mensaje (.*)$")
    public void observaraElMensaje(String mensaje) {

    }
}
