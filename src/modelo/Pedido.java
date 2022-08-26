package src.modelo;

public class Pedido {
	public Pedido(int idPedido, String nombreCliente, String direccionCliente) {
		this.idPedido = idPedido;
		this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
	}
	private static int numeroPedidos=0;
	private int idPedido;
	private String nombreCliente;
	private String direccionCliente;
	public static int getNumeroPedidos() {
		return numeroPedidos;
	}
	public static void setNumeroPedidos(int numeroPedidos) {
		Pedido.numeroPedidos = numeroPedidos;
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
