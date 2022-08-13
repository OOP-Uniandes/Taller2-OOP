package src.vista;
import java.util.Scanner;
public class Aplicacion {
    public static void main(String[] args) {
    
        // Mostrar menú:
        mostrarOpciones();
    }
    // Mostrar menú
    private static void mostrarOpciones() {
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

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor selecciona una opción");
        int opcion_seleccionada = sc.nextInt();
			    if (opcion_seleccionada == 1) {
				System.out.println("En Desarrollo");
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
			sc.close();
    }

    private static void mostrarMenu() {
        System.out.println(" ====== MENÚ DEL RESTAURANTE ======");
        
        System.out.println("");
        System.out.println("Por favor elige una de las siguientes opciones");
        System.out.println("");
        System.out.println("1. Ver lista de Combos");
        System.out.println("2. Ver lista de Ingredientes");
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor selecciona una opción");
        int OpcionMenu = sc.nextInt();

        if (OpcionMenu == 1) {
            mostrarCombos();
        }
            else if (OpcionMenu == 2) {
            mostrarIngredientes();
        }

        sc.close();
    }

    private static void mostrarCombos() {
        System.out.println(" ====== LISTA DE COMBOS ======");
    }

    private static void mostrarIngredientes() {
        System.out.println(" ====== LISTA DE INGREDIENTES ======");
    }

}
