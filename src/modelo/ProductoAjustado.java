package src.modelo;

import java.util.ArrayList;

public class ProductoAjustado implements Producto{

	private ProductoMenu base;
	private ArrayList<Ingrediente> agregados=new ArrayList<Ingrediente>();
	private ArrayList<Ingrediente> eliminados=new ArrayList<Ingrediente>();
	
	public ProductoAjustado(ProductoMenu base) {
		this.base=base;
	}
	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return base.getNombre();
	}

	@Override
	public String generarTextoFactura() {
		// TODO Auto-generated method stub
		return null;
	}

}
