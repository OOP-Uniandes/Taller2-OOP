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
    
    // Mostrar menú
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
                	System.out.println(" ====== LISTA DE COMBOS ======");
                    restaurante.mostrarCombos();

                    System.out.println(" ====== LISTA DE PRODUCTOS ======");
                    restaurante.mostrarMenu();

                    System.out.println("Producto que desea agregar: ");
                    String opcion_seleccionada_2 = input("Por favor seleccione una opción: ");
                    System.out.println(opcion_seleccionada_2);
                    if(opcion_seleccionada_2.charAt(0) == 'P') {
                    	// Producto
                    	int producto_seleccionado = Integer.valueOf(opcion_seleccionada_2.substring(1,opcion_seleccionada_2.length()));
                    }
                    if(opcion_seleccionada_2.charAt(0) == 'C') {
                    	// Producto
                    	int combo_seleccionado = Integer.valueOf(opcion_seleccionada_2.substring(1,opcion_seleccionada_2.length()));
                    }
                    
                }
    		} else {
    			
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("¡Bienvenid@ al Restaurante POOAndes");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("1. Inicia un nuevo pedido");
                System.out.println("2. Cerrar y guardar pedido");
                System.out.println("3. Obtener Pedido en Curso");
                System.out.println(" ");
                System.out.println("4. Revisa nuestro menú");
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
                    System.out.println("En Desarrollo");
                }
    				else if (opcion_seleccionada == 3) {
                    System.out.println("En Desarrollo");
                }
    				else if (opcion_seleccionada == 4) {
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

