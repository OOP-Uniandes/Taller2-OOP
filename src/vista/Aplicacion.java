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
    	
    	while(continuar) {
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

            int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
            
			    if (opcion_seleccionada == 1) {
			    // id
			    // nombre cliente
			    // direccion cliente
			    	
				Pedido pedidoNnuevo = new Pedido(opcion_seleccionada, null, null);
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

