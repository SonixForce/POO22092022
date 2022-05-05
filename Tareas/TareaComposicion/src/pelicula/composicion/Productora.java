/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelicula.composicion;

/**
 *
 * @author sonix
 */
public class Productora {
    private String nombre;
    private float inversion;

    public Productora() {
    }

    public Productora(String nombre, float inversion) {
        this.nombre = nombre;
        this.inversion = inversion;
    }

    public float getInversion() {
        return inversion;
    }

    public void setInversion(int inversion) {
        this.inversion = inversion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Productora{" + "nombre=" + nombre + ", inversion=" + inversion + '}';
    }
    
    public void publicar(){
        System.out.println("La película será publicada por: " + this.nombre + " y cuenta con una inversión neta de: $" + this.inversion + "M");
    }
}
