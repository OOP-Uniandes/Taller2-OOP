package src.vista;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import src.controlador.Restaurante;
import src.modelo.Pedido;

public class Aplicacion {
	
	Restaurante restaurante = new Restaurante();
	
    public void main() throws FileNotFoundException, IOException {
    	
       consola();
    }
    
    public void consola() throws FileNotFoundException, IOException {
    	
    	
    	boolean continuar = true;
    	boolean pedidoInicializado = false;
    	
    	while(continuar) {
    		
    		if(pedidoInicializado == true) {
    			System.out.println("1. Agregar producto");
                System.out.println("2. Cerrar y guardar factura");
                System.out.println(" ");
                
                int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción: "));
                
                if (opcion_seleccionada == 1) {
                	/*
                	System.out.println(" ====== LISTA DE COMBOS ======");
                    restaurante.mostrarCombos();

                    System.out.println(" ====== LISTA DE PRODUCTOS ======");
                    restaurante.mostrarMenu();
					*/
                    String opcion_seleccionada_2 = input("Producto que desea agregar: ");
                    if(opcion_seleccionada_2.charAt(0) == 'P') {
                    	// Producto
                    	int producto_seleccionado = Integer.valueOf(opcion_seleccionada_2.substring(1,opcion_seleccionada_2.length()));
                    	restaurante.pedidoEnCurso.addProducto(restaurante.retornarProductoPorIndice(producto_seleccionado));
                        System.out.println("Producto anadido !\n\n");
                    }
                    if(opcion_seleccionada_2.charAt(0) == 'C') {
                    	// Producto
                    	int combo_seleccionado = Integer.valueOf(opcion_seleccionada_2.substring(1,opcion_seleccionada_2.length()));
                    	restaurante.pedidoEnCurso.addProducto(restaurante.retornarComboPorIndice(combo_seleccionado));
                    	System.out.println("Combo anadido ! \n\n");
                    }
                    
                } 
                else if (opcion_seleccionada == 2) {
                	pedidoInicializado=false;
                	restaurante.pedidoEnCurso.generarFactura(restaurante.idc);
                	restaurante.pedidos.add(restaurante.pedidoEnCurso);
                	
                }
               
                
    		} else {
    			
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("¡Bienvenid@ al Restaurante POOAndes");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("1. Inicia un nuevo pedido");
                System.out.println("2. Buscar pedido");
                System.out.println("3. Revisa nuestro menú");
                System.out.println(" ");
                System.out.println();

                int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción: "));
                
    		    if (opcion_seleccionada == 1) {
    		    String nombreCliente = input("Nombre del cliente: ");
    		    String direccionCliente = input("Direccion del cliente: ");
    			Pedido pedidoNnuevo = new Pedido(restaurante.idc,nombreCliente,direccionCliente);
    			restaurante.incrementIdc();
    			restaurante.setPedidoEnCurso(pedidoNnuevo);
    			pedidoInicializado = true;
    			
                }
    				else if (opcion_seleccionada == 2) {
    				int id_pedido_buscar = Integer.parseInt(input("ID pedido: "));
    				id_pedido_buscar -= 1;
    				boolean found = false;
    				for (Pedido pedido: restaurante.pedidos) {
    					
    					if (pedido.getIdPedido() == id_pedido_buscar) {
    						System.out.println(pedido.mostrarInfo());
    						found = true;
    					}
    				}
    				if (found == false) {
    					System.out.println("No se ha encontrado un pedido con este id ! :( \n\n\n");
    				}
                }
    				else if (opcion_seleccionada == 3) {
    					mostrarMenu();
                }
    				
    			else if (opcion_seleccionada == 0) {
    				
    				continuar = false;
    				
    				System.out.println("Hasta luego!");
    			}

    		}


    	}
    	

    }

	public static String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}

	private void mostrarMenu() throws FileNotFoundException, IOException {
        System.out.println(" ====== MENÚ DEL RESTAURANTE ======");
        System.out.println("");
        System.out.println("Por favor elige una de las siguientes opciones");
        System.out.println("");
        System.out.println("1. Ver lista de Combos");
        System.out.println("2. Ver lista de Ingredientes");
        System.out.println("3. Ver lista de Productos");
        System.out.println("");
        int opcionMenu = Integer.parseInt(input("Por favor seleccione una opción: "));


        if (opcionMenu == 1) {
        	System.out.println(" ====== LISTA DE COMBOS ======");
            restaurante.mostrarCombos();
        }
        else if (opcionMenu == 2) {
        	System.out.println(" ====== LISTA DE INGREDIENTES ======");
            restaurante.mostrarIngredientes();
        }
        else if(opcionMenu == 3) {
        	System.out.println(" ====== LISTA DE PRODUCTOS ======");
            restaurante.mostrarMenu();
        }

    }

 

    private void mostrarIngredientes() throws FileNotFoundException, IOException {
        
    }

}

