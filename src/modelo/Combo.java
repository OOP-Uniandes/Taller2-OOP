package src.modelo;

import java.util.ArrayList;

public class Combo implements Producto{
    public Combo(String nombreCombo, Double descuento) {
		this.nombreCombo = nombreCombo;
		this.descuento = descuento;
	}

    public ArrayList<ProductoMenu> itemsCombo=new ArrayList<ProductoMenu>();
	private String nombreCombo;
    private Double descuento;


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
	public int getPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String generarTextoFactura() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String mostrarProducto() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
