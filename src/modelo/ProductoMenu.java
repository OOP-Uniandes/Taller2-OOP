package src.modelo;

public class ProductoMenu implements Producto {
	private String nombre;
	private int precioBase;
	private int calorias;
	
	public ProductoMenu(String nombre, int precioBase) {
		this.nombre=nombre;
		this.precioBase=precioBase;
	}
	public ProductoMenu(String nombre, int precioBase, int calorias) {
		this.nombre=nombre;
		this.precioBase=precioBase;
		this.calorias=calorias;
	}
	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return precioBase;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public String generarTextoFactura() {
		// TODO Auto-generated method stub
		return "Producto: " + this.nombre + " Precio: " +String.valueOf(this.getPrecio());
	}

	@Override
	public String mostrarProducto() {
		// TODO Auto-generated method stub
		return "Nombre: " + this.nombre + " Precio: " + this.precioBase + "      Calorias: " + this.calorias;
	}
	
	public int getCalorias() {
		return this.calorias;
		
	}

}
