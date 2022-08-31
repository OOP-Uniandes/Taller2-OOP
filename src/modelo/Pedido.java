package src.modelo;

import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException; 

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
	private double calcularTotal() {
		double total = 0;
		for (Producto producto: this.productos) {
			total += producto.getPrecio();
		}
		return total;
	}
	
	public String mostrarInfo() {
		String info = "Factura del pedido " + String.valueOf(this.idPedido) + "\n" + "=====================" + "\n" +"Cliente:   " + this.nombreCliente + "\n" + "Direccion: " + this.direccionCliente + "\n"+ "=====================" + "\n" ;
		for (Producto producto: this.productos) {
			String elem = producto.generarTextoFactura();
			info = info + elem + "\n";
		}
		info = info + "=====================" + "\n" +"Total: " + String.valueOf(this.calcularTotal()) + "\n";
		return info;
	}
	
	public void generarFactura(int idPedido) throws IOException {
		String filename = "/Users/miguelgomez/repos/DPOO/Taller2-OOP/data/" + String.valueOf(idPedido) +  ".txt";
		File myObj = new File(filename);
		myObj.createNewFile();
		FileWriter myWriter = new FileWriter(filename);
		myWriter.write("Factura del pedido " + String.valueOf(idPedido) + "\n");
		myWriter.write("=====================" + "\n");
		myWriter.write("Cliente:   " + this.nombreCliente + "\n");
		myWriter.write("Direccion: " + this.direccionCliente + "\n");
		myWriter.write("=====================" + "\n");
		for (Producto producto: this.productos) {
			String elem = producto.generarTextoFactura();
			myWriter.write(elem + "\n");
		}
		myWriter.write("=====================" + "\n");
		myWriter.write("Total: " + String.valueOf(this.calcularTotal()) + "\n");
		myWriter.close();
	}
	
	
	

}
