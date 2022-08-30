package src.modelo;

public class ProductoMenu implements Producto {
	private String nombre;
	private int precioBase;
	
	public ProductoMenu(String nombre, int precioBase) {
		this.nombre=nombre;
		this.precioBase=precioBase;
	}
	
	@Override
	public int getPrecio() {
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
		return null;
	}

	@Override
	public String mostrarProducto() {
		// TODO Auto-generated method stub
		return "Nombre: " + this.nombre + " Precio: " + this.precioBase;
	}

}
