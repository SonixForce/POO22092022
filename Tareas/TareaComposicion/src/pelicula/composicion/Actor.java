/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelicula.composicion;

/**
 *
 * @author sonix
 */
public class Actor {
    private String nombre;
    private int numEscenas;

    public Actor() {
    }

    public Actor(String nombre, int numEscenas) {
        this.nombre = nombre;
        this.numEscenas = numEscenas;
    }

    public int getNumEscenas() {
        return numEscenas;
    }

    public void setNumEscenas(int numEscenas) {
        this.numEscenas = numEscenas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Actor{" + "nombre=" + nombre + ", numEscenas=" + numEscenas + '}';
    }
    
    public void actuar(){
        System.out.println("El actor " + this.nombre + " va a protagonizar " + this.numEscenas + " escenas en toda la película");
    }
}
