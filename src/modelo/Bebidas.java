package src.modelo;

public class Bebidas {
	private String nombre;
	private int costoAdicional;
	private int precio;
	private int calorias;
	public Bebidas(String nombre, int precio) {
		this.nombre=nombre;
		this.precio=precio;
	}
	public Bebidas(String nombre, int precio, int calorias) {
		this.nombre=nombre;
		this.precio=precio;
		this.calorias=calorias;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setCostoAdicional(int precio) {
		this.precio = precio;
	}
	public String mostrarBebida() {
		  String resultado ="Nombre: " + this.nombre + "      Precio : " + this.precio + "       Calorias: " + this.calorias;
        return resultado;
	}
}

