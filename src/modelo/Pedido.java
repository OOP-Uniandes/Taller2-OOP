package src.modelo;

import java.util.ArrayList;

public class Pedido {
	
	public Pedido(int idPedido, String nombreCliente, String direccionCliente) {
		this.idPedido = idPedido;
		this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
	}
	
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	private int idPedido;
	private String nombreCliente;
	private String direccionCliente;
	
	public void addProducto(Producto producto) {
		this.productos.add(producto);
		}
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getDireccionCliente() {
		return direccionCliente;
	}
	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}
	

}
