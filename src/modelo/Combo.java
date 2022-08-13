package src.modelo;

public class Combo {
    public String nombreCombo;
    public Double descuento;


    public String mostrarCombo(){
        String resultado ="Nombre: " + nombreCombo + "      Descuento: " + descuento.toString();
        return resultado;
    }
}
