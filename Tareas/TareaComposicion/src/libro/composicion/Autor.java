/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro.composicion;

/**
 *
 * @author sonix
 */
public class Autor {
    private String nombre;
    private String paisOrigen;

    public Autor() {
    }

    public Autor(String nombre, String paisOrigen) {
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
        return "Autor{" + "nombre=" + nombre + ", paisOrigen=" + paisOrigen + '}';
    }
    
    public void escribir(){
        System.out.println(this.nombre + " empezó a escribir un nuevo capítulo del libro.");
    }
}
