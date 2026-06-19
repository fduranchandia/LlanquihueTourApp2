
package com.agenciaturismo.model;


public class Tour {
    
    private String destino;
    private int duracion;
    private boolean almuerzo;
    private double precio;

    public Tour(String destino, int duracion, boolean almuerzo, double precio) {
        this.destino = destino;
        this.duracion = duracion;
        this.almuerzo = almuerzo;
        this.precio = precio;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isAlmuerzo() {
        return almuerzo;
    }

    public void setAlmuerzo(boolean almuerzo) {
        this.almuerzo = almuerzo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        
        return "Destino: " + destino + 
                " | Duracion (dias): " + duracion +
                " | Almuerzo: " + (almuerzo ? "Incluye" : "No Incluye") + 
                " | Precio (por persona): " + precio; 
        
    } 
    
    
}
