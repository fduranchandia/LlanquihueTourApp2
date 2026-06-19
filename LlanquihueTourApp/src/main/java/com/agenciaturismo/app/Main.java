

package com.agenciaturismo.app;
import com.agenciaturismo.model.Tour;
import com.agenciaturismo.util.LectorArchivo;
import com.agenciaturismo.service.TourService;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author fdura
 */
public class Main {

    public static void main(String[] args) {
        
        LectorArchivo data = new LectorArchivo();
        ArrayList<Tour> viajes = data.cargarArchivo("toures.csv");
        
        TourService toures = new TourService(viajes);
        
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 3){
            System.out.println("");
            System.out.println("Seleccione opcion:");
            System.out.println("1. Listar Tours");
            System.out.println("2. Buscar tours c/ almuerzo");
            System.out.println("3. Salir");
            try {
                opcion = Integer.parseInt(input.nextLine());

                if (opcion == 1) {
                    toures.listarToures();
                } else if (opcion == 2){
                    toures.buscarConAlmuerzo();
                } else if (opcion == 3) {
                    System.exit(0);
                } else {
                    System.out.println("Ingrese una opcion valida");
                }
                
            } catch (NumberFormatException e) {
                System.out.println("Error: ingrese 1, 2 o 3");
            }
            
        }
        
        input.close();
    }
}
