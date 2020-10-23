package co.com.utest.models;

import co.com.utest.models.builder.DatosDireccionBuilder;

public class DatosDireccion {

    private String ciudad;
    private String codigoPostal;
    private String pais;

    public DatosDireccion(DatosDireccionBuilder datosDireccionBuilder) {
        this.ciudad = datosDireccionBuilder.getCiudad();
        this.codigoPostal = datosDireccionBuilder.getCodigoPostal();
        this.pais = datosDireccionBuilder.getPais();
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public String getPais() {
        return pais;
    }
}
