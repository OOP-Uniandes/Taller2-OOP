package src.controlador;

import src.modelo.Combo;
import src.modelo.Ingrediente;
import src.modelo.Pedido;
import src.modelo.ProductoMenu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
        String filename = "/Users/miguelgomez/repos/DPOO/Taller2-OOP/data/combos.txt";
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
    	String filename = "/Users/miguelgomez/repos/DPOO/Taller2-OOP/data/ingredientes.txt";
    	BufferedReader br = new BufferedReader(new FileReader(filename));
    	String linea = br.readLine();
    	
    	
    	
    	while (linea != null) {
            String[] partes = linea.split(";");
            String nombre = partes[0];
            String costoAdicional = partes[1];
            int costoAdicionalI = Integer.parseInt(costoAdicional);

            Ingrediente ingrediente = new Ingrediente(nombre,costoAdicionalI);
            
            this.ingredientes.add(ingrediente);
            linea = br.readLine(); 
        }
        br.close();
        
      
        	}
        
	
	public void cargarProductos() throws FileNotFoundException, IOException {
		String filename = "/Users/miguelgomez/repos/DPOO/Taller2-OOP/data/menu.txt";
		BufferedReader br = new BufferedReader(new FileReader(filename));
		String linea = br.readLine();
		
		
		while (linea != null) {
	        String[] partes = linea.split(";");
	        String nombre = partes[0];
	        String costo = partes[1];
	        int costoNum = Integer.parseInt(costo);
	
	        ProductoMenu producto = new ProductoMenu(nombre,costoNum);
	        this.menuBase.add(producto);
	        linea = br.readLine(); 
	    }
	    br.close();
	    
	  
	    	}
	    }

    



