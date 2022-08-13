package src.controlador;

import src.modelo.Combo;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        cargarCombos();

    }  
    private static void cargarCombos() throws FileNotFoundException, IOException  {
        String filename = "C:\\Users\\samue\\OneDrive\\Universidad\\3. Semestre\\OOP\\Talleres\\Taller 2\\Taller 2 - Hamburguesas_esqueleto\\data\\combos.txt";
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String linea = br.readLine();



        linea = br.readLine();




        while (linea != null) {
            Combo combo = new Combo();
            String[] partes = linea.split(";");
            String nombre = partes[0];
            String descuentoCombo = partes[1].replaceAll("[%]", "");
            Double descuentoComboF = Double.parseDouble(descuentoCombo);
            List<String> ingredientesCombo = new ArrayList<String>();
            ingredientesCombo.add(partes[2]);
            ingredientesCombo.add(partes[3]);
            ingredientesCombo.add(partes[4]);

            combo.nombreCombo = nombre;
            combo.descuento = descuentoComboF;
            System.out.println(combo.mostrarCombo());
        
            linea = br.readLine(); // Leer la siguiente línea
        }
        br.close();
        
        }
    }

