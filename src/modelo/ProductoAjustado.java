package src.modelo;

import java.util.ArrayList;

public class ProductoAjustado implements Producto{

	private ProductoMenu base;
	private ArrayList<Ingrediente> agregados=new ArrayList<Ingrediente>();
	private ArrayList<Ingrediente> eliminados=new ArrayList<Ingrediente>();
	
	public void addAgregado (Ingrediente agregar) {
		this.agregados.add(agregar);
	}
	
	public void addEliminado(Ingrediente eliminar) {
		this.eliminados.add(eliminar);
	}
	
	public ProductoAjustado(ProductoMenu base) {
		this.base=base;
	}
	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return base.getPrecio();
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return base.getNombre();
	}

	@Override
	public String generarTextoFactura() {
		// TODO Auto-generated method stub
		String agr = "";
		String elim = "";
		System.out.println("Size: "+this.agregados.size());
		for (Ingrediente ingrediente: this.agregados) {
			System.out.println(ingrediente.getNombre());
			agr = agr + ingrediente.getNombre() + " ";
		}
		for (Ingrediente ingrediente: this.eliminados) {
			System.out.println(ingrediente.getNombre());
			
			elim = elim + ingrediente.getNombre() + " ";
		}
		
		return base.getNombre() + " Sin: " + elim + "Con: " + agr;
	}
	
	@Override
	public String mostrarProducto() {
		// TODO Auto-generated method stub
		return String.valueOf(this.base.getPrecio()) + this.getPrecio();
	}
	@Override
	public int getCalorias() {
		// TODO Auto-generated method stub
		return 0;
	}

}
