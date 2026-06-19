/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agenciaturismo.service;
import com.agenciaturismo.model.Tour;
import java.util.ArrayList;
/**
 *
 * @author fdura
 */
public class TourService {
    
    private ArrayList<Tour> toures;

    public TourService(ArrayList<Tour> toures) {
        this.toures = toures;
    }
    
    public void listarToures() {
        if (toures.size() == 0){
            System.out.println("Lista vacia");
        } else {
            for (Tour tour : toures) {
                System.out.println(tour);
            }
        }
        
    }
    
    public void buscarConAlmuerzo(){
        
        if (toures.size() == 0){
            System.out.println("Lista vacia");
            
        } else{
            for (Tour tour : toures) {
                if (tour.isAlmuerzo()){
                    System.out.println(tour);
                }
            }
        }
        
        
    }
    
    
}
