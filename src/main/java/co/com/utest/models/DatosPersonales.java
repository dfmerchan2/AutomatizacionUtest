package co.com.utest.models;

import co.com.utest.models.builder.DatosPersonalesBuilder;

public class DatosPersonales {
    private String nombre;
    private String apellido;
    private String correo;
    private String fechaNacimiento;

    public DatosPersonales(DatosPersonalesBuilder datosPersonalesBuilder) {
        this.nombre = datosPersonalesBuilder.getNombre();
        this.apellido = datosPersonalesBuilder.getApellido();
        this.correo = datosPersonalesBuilder.getCorreo();
        this.fechaNacimiento = datosPersonalesBuilder.getFechaNacimiento();
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
}
