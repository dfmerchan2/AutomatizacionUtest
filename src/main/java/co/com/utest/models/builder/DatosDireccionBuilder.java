package co.com.utest.models.builder;

import co.com.utest.models.DatosDireccion;
import co.com.utest.utils.Builder;

public class DatosDireccionBuilder implements Builder<DatosDireccion> {

    private String ciudad;
    private String codigoPostal;
    private String pais;

    public static DatosDireccionBuilder datosDireccion(){
        return new DatosDireccionBuilder();
    }

    public DatosDireccionBuilder conCiudad(String ciudad){
        this.ciudad = ciudad;
        return this;
    }

    public DatosDireccionBuilder conCodigoPostal(String codigoPostal){
        this.codigoPostal = codigoPostal;
        return this;
    }

    public DatosDireccionBuilder conPais(String pais){
        this.pais = pais;
        return this;
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

    @Override
    public DatosDireccion builder() {
        return new DatosDireccion(this);
    }
}
