/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agenciaturismo.util;

import com.agenciaturismo.model.Tour;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LectorArchivo {
    
    public ArrayList<Tour> cargarArchivo(String rutatxt) {
        ArrayList<Tour> lista = new ArrayList<>();
        
        try (BufferedReader txt = new BufferedReader(new FileReader(rutatxt))) {
            String linea;
            
            while ((linea = txt.readLine()) != null) {
                String[] array = linea.split(";");
                
                String destino = array[0];
                int duracion = Integer.parseInt(array[3]);
                boolean almuerzo = Boolean.parseBoolean(array[1]);
                double precio = Double.parseDouble(array[2]);
                
                Tour viaje = new Tour(destino, duracion, almuerzo, precio);
                lista.add(viaje);
              
            }
            
        } catch (IOException e){
            System.out.println("Error" + e.getMessage());
        }
        
        return lista;
        
    }
        
    
}
