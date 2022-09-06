package src.controlador;

import src.modelo.Combo;
import src.modelo.ProductoAjustado;
import src.modelo.Ingrediente;
import src.modelo.Pedido;
import src.modelo.Producto;
import src.modelo.Bebidas;
import src.modelo.ProductoMenu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.io.BufferedReader;

public class Restaurante {
	
    public Restaurante() {
		try {
			this.cargarProductos();
			this.cargarCombos();
			this.cargarIngredientes();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Pedido getPedidoEnCurso() {
		return pedidoEnCurso;
	}
	public void setPedidoEnCurso(Pedido pedidoEnCurso) {
		this.pedidoEnCurso = pedidoEnCurso;
	}
	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}
	public void addPedido(Pedido pedido) {
		this.pedidos.add(pedido);
	}
	public void incrementIdc() {
		this.idc++;
	}

	public ArrayList<Ingrediente> ingredientes=new ArrayList<Ingrediente>();
    public Pedido pedidoEnCurso;
    public ArrayList<Pedido> pedidos=new ArrayList<Pedido>();
    public static ArrayList<Combo> combos= new ArrayList<Combo>();
    public ArrayList<ProductoMenu> menuBase = new ArrayList<ProductoMenu>();
    public ArrayList<Bebidas> Bebidas = new ArrayList<Bebidas>();
    public int idc = 0;
    
    
    
    public void mostrarIngredientes() {
    	for (Ingrediente ingrediente: this.ingredientes) {
    		
			System.out.println(ingrediente.mostrarIngrediente());
		}
    }
    public void mostrarMenu() {
    	for (ProductoMenu menuItem: this.menuBase) {
    		System.out.println('P' + String.valueOf(this.menuBase.indexOf(menuItem)));
			System.out.println(menuItem.mostrarProducto());
		}
    }
    public void mostrarCombos() {
		for (Combo combo: this.combos) {
			System.out.println('C' + String.valueOf(this.combos.indexOf(combo)));
			System.out.println(combo.mostrarCombo());
		}
    }
    public void mostrarBebidas() {
    	for (Bebidas Bebidas: this.Bebidas) {
    		System.out.println('B' + String.valueOf(this.Bebidas.indexOf(Bebidas)));
    		System.out.println(Bebidas.mostrarBebida());
		}
    }
    public Combo retornarComboPorIndice(int comboIndex) {
    	return this.combos.get(comboIndex);
    }
    public ProductoMenu retornarProductoPorIndice(int productIndex) {
    	return this.menuBase.get(productIndex);
    }
    
    private int darPrecioCombo(String nombreCombo) {
    	
    	for(ProductoMenu menuItem: this.menuBase) {
    		if (nombreCombo.contains(menuItem.getNombre())) {
    			return (int)menuItem.getPrecio();
    		}
    	}
    	return 0;
    }
    
    public void cargarCombos() throws FileNotFoundException, IOException  {
        String filename = "data/combos.txt";
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String linea = br.readLine();

        while (linea != null) {
            String[] partes = linea.split(";");
            String nombre = partes[0];
            String descuentoCombo = partes[1].replaceAll("[%]", "");
            Double descuentoComboF = Double.parseDouble(descuentoCombo);
            int precioCombo = darPrecioCombo(nombre);
            Combo combo = new Combo(nombre,descuentoComboF,precioCombo);
            this.combos.add(combo);
            linea = br.readLine(); 
        }
        br.close();
        
    }
    
    public void cargarIngredientes() throws FileNotFoundException, IOException {
    	String filename = "data/ingredientes.txt";
    	BufferedReader br = new BufferedReader(new FileReader(filename));
    	String linea = br.readLine();
    	
    	
    	
    	while (linea != null) {
            String[] partes = linea.split(";");
            String nombre = partes[0];
            String costoAdicional = partes[1];
            int calorias = Integer.parseInt(partes[2]);
            int costoAdicionalI = Integer.parseInt(costoAdicional);

            Ingrediente ingrediente = new Ingrediente(nombre,costoAdicionalI, calorias);
            
            this.ingredientes.add(ingrediente);
            linea = br.readLine(); 
        }
        br.close();
        	}
        
	
	public void cargarProductos() throws FileNotFoundException, IOException {
		String filename = "data/menu.txt";
		BufferedReader br = new BufferedReader(new FileReader(filename));
		String linea = br.readLine();
		
		
		while (linea != null) {
	        String[] partes = linea.split(";");
	        String nombre = partes[0];
	        String costo = partes[1];
	        int calorias = Integer.parseInt(partes[2]);
	        int costoNum = Integer.parseInt(costo);
	
	        ProductoMenu producto = new ProductoMenu(nombre,costoNum, calorias);
	        this.menuBase.add(producto);
	        linea = br.readLine(); 
	    }
	    br.close();
	    
	  
	    	}
	    

	public void cargarBebidas() throws FileNotFoundException, IOException {
		String filename = "data/bebidas.txt";
		BufferedReader br = new BufferedReader(new FileReader(filename));
		String linea = br.readLine();
		
		
		while (linea != null) {
	        String[] partes = linea.split(";");
	        String nombre = partes[0];
	        String costo = partes[1];
	        int calorias = Integer.parseInt(partes[2]);
	        int costoNum = Integer.parseInt(costo);
	
	        Bebidas bebidas = new Bebidas(nombre,costoNum, calorias);
	        this.Bebidas.add(bebidas);
	        linea = br.readLine(); 
	        
		}
	    br.close();
	    mostrarBebidas();
	  
	    	}
	
	public boolean revisarPedidoDuplicado() {
		
		int numDuplicados[];
		
		for (Pedido pedido1: this.pedidos) {
			for(Pedido pedido2: this.pedidos) {
				
				ArrayList<String> pedido1_list = pedido1.getProductosList();
				ArrayList<String> pedido2_list = pedido2.getProductosList();
				
				Arrays.sort(pedido1_list.toArray(), Collections.reverseOrder());
			    Arrays.sort(pedido2_list.toArray(), Collections.reverseOrder());
			    if (pedido1.getIdPedido() != pedido2.getIdPedido()) {
				    if (pedido1_list.equals(pedido2_list)) {
				    	System.out.println("Pedido: " + String.valueOf(pedido1.getIdPedido()) + " Es igual a: "+ String.valueOf(pedido2.getIdPedido()));
		
				    	continue;
				    }
			    }
			    

			}
		}
		return false;
	}
	
	
    }



