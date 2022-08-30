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


public class Restaurante {
    public ArrayList<Ingrediente> ingredientes=new ArrayList<Ingrediente>();
    public Pedido pedidoEnCurso;
    public ArrayList<Pedido> pedidos=new ArrayList<Pedido>();
    public static ArrayList<Combo> combos= new ArrayList<Combo>();
    public ArrayList<ProductoMenu> menuBase = new ArrayList<ProductoMenu>();
    
    
    
    public static void cargarCombos() throws FileNotFoundException, IOException  {
        String filename = "C:\\Users\\samue\\OneDrive\\Universidad\\3. Semestre\\OOP\\Talleres\\Taller 2\\Taller2-OOP\\data\\combos.txt";
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String linea = br.readLine();

        ArrayList<Combo> listaDeCombos = new ArrayList<Combo>();





        while (linea != null) {
            String[] partes = linea.split(";");
            String nombre = partes[0];
            String descuentoCombo = partes[1].replaceAll("[%]", "");
            Double descuentoComboF = Double.parseDouble(descuentoCombo);
            
            System.out.println(nombre);
            System.out.println(descuentoComboF);
            Combo combo = new Combo(nombre,descuentoComboF);
            listaDeCombos.add(combo);
            linea = br.readLine(); 
        }
        br.close();
        
        for (Combo combo: listaDeCombos) {
            
            System.out.println(combo.mostrarCombo());
          }
        	}
        }

    



