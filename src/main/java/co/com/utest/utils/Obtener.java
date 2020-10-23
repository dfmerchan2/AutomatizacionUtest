package co.com.utest.utils;

public class Obtener {

    public static String mes(String fecha){
        String [] aFecha = fecha.split("-");
        return aFecha[0];
    }

    public static String dia(String fecha){
        String [] aFecha = fecha.split("-");
        return aFecha[1];
    }

    public static String year(String fecha){
        String [] aFecha = fecha.split("-");
        return aFecha[2];
    }
}
