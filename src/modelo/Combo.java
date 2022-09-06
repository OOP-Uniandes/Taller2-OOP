package src.modelo;

import java.util.ArrayList;

import src.controlador.Restaurante;
import src.vista.Aplicacion;

public class Combo implements Producto{
    public Combo(String nombreCombo, Double descuento, int precioNormal) {
		this.nombreCombo = nombreCombo;
		this.descuento = descuento;
		this.precioNormal = precioNormal;
	}

    public ArrayList<ProductoMenu> itemsCombo=new ArrayList<ProductoMenu>();
	private String nombreCombo;
    private Double descuento;
    public int precioNormal;


    public String mostrarCombo(){
        String resultado ="Nombre: " + nombreCombo + "      Descuento: " + descuento.toString();
        return resultado;
    }


	public Double getDescuento() {
		return descuento;
	}


	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}


	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return this.precioNormal * ((descuento/100)+1);
	}

	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombreCombo;
	}


	@Override
	public String generarTextoFactura() {
		// TODO Auto-generated method stub
		return "Producto: " + this.nombreCombo + " Precio: " +String.valueOf(this.getPrecio()) ;
		
	}


	@Override
	public String mostrarProducto() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int getCalorias() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
