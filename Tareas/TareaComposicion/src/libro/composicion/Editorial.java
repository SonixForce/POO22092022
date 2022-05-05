/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro.composicion;

/**
 *
 * @author sonix
 */
public class Editorial {
    private String nombre;
    private int numEdicion;

    public Editorial() {
    }

    public Editorial(String nombre, int numEdicion) {
        this.nombre = nombre;
        this.numEdicion = numEdicion;
    }

    public int getNumEdicion() {
        return numEdicion;
    }

    public void setNumEdicion(int numEdicion) {
        this.numEdicion = numEdicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", numEdicion=" + numEdicion + '}';
    }
    
    public void publicar(){
        System.out.println("El libro será publicado por: " + this.nombre + "! Y el número de edición será: " + this.numEdicion);
    }
}
