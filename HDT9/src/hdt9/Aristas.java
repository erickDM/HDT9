/**
/*
Autores: Erick de Mata
         Luis Orellana

Universidad del Valle de Guatemala
Algoritmos y estructura de datos Lab 9
 */

package hdt9;

//Clase base para las aritas del grafo

public class Aristas {
    
    //Atributos de la arista
    private Vertice origen;
    private Vertice destino;
    private double peso;
    
    //Constructor de la arista el grafo
    public Aristas(Vertice origen, Vertice destino, double peso){
        this.origen=origen;
        this.destino=destino;
        this.peso=peso;
    }

    //Metodo de deteccion de arista entre mismos nodos
    public boolean equals(Aristas ar){
        if((origen.getName().equals(ar.getOrigen().getName()))&&(destino.getName().equals(ar.getDestino().getName()))){
            return true;
        }
        return false;
    }
    
    //Metodo de obtencion de origen
    public Vertice getOrigen() {
        return origen;
    }

    //Metodo de cambio de origen
    public void setOrigen(Vertice origen) {
        this.origen = origen;
    }

    //Metodo de obtenion de destino
    public Vertice getDestino() {
        return destino;
    }

    //Metodo de cambio de destino
    public void setDestino(Vertice destino) {
        this.destino = destino;
    }

    //Metod de obtencion de peso
    public double getPeso() {
        return peso;
    }

    //Metodo de cambiod e peso
    public void setPeso(float peso) {
        this.peso = peso;
    }
   
}
