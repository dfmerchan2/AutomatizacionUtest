package co.com.utest.models.builder;

import co.com.utest.models.DatosPersonales;
import co.com.utest.utils.Builder;

public class DatosPersonalesBuilder implements Builder<DatosPersonales> {
    private String nombre;
    private String apellido;
    private String correo;
    private String fechaNacimiento;

    public static DatosPersonalesBuilder datosPersonales(){
        return new DatosPersonalesBuilder();
    }

    public DatosPersonalesBuilder conNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public DatosPersonalesBuilder conApellido(String apellido){
        this.apellido = apellido;
        return this;
    }

    public DatosPersonalesBuilder conCorreo(String correo){
        this.correo = correo;
        return this;
    }

    public DatosPersonalesBuilder conFechaNacimiento(String fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public DatosPersonales builder() {
        return new DatosPersonales(this);
    }
}
