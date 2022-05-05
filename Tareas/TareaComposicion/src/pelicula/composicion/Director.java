/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelicula.composicion;

/**
 *
 * @author sonix
 */
public class Director {
    private String nombre;
    private String paisOrigen;

    public Director() {
    }

    public Director(String nombre, String paisOrigen) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Director{" + "nombre=" + nombre + ", paisOrigen=" + paisOrigen + '}';
    }
    
    public void coordinar(){
        System.out.println(this.nombre + " está empezando a coordinar a toda la gente para grabar la película!");
    }
}
