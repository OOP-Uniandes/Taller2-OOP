package src.modelo;

public class Ingrediente {
	private String nombre;
	private int costoAdicional;
	private int calorias;
	public Ingrediente(String nombre, int costoAdicional) {
		this.nombre=nombre;
		this.costoAdicional=costoAdicional;
	}
	public Ingrediente(String nombre, int costoAdicional, int calorias) {
		this.nombre=nombre;
		this.costoAdicional=costoAdicional;
		this.calorias = calorias;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCostoAdicional() {
		return costoAdicional;
	}
	public void setCostoAdicional(int costoAdicional) {
		this.costoAdicional = costoAdicional;
	}
	public String mostrarIngrediente() {
        String resultado ="Nombre: " + this.nombre + "      Costo Adicional: " + this.costoAdicional + "       Calorias: " + this.calorias;
        return resultado;
	}

}
