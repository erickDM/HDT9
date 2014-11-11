/*
Autores: Erick de Mata
         Luis Orellana

Universidad del Valle de Guatemala
Algoritmos y estructura de datos Lab 9
 */
package hoja9;

/**
 *
 * @author E. de Mata
 */

//Clase base para las ciudades del grafo
public class Vertice {
    
    //nombre del vertice
    private String name;
    
    //Constructor
    public Vertice(String name){
        this.name=name;
    }

    //Obtener nombre
    public String getName() {
        return name;
    }

    //Cambiar nombre
    public void setName(String name) {
        this.name = name;
    }
   
}
