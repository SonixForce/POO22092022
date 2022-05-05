/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelicula;

import pelicula.composicion.Actor;
import pelicula.composicion.Director;
import pelicula.composicion.Productora;

/**
 *
 * @author sonix
 */
public class Pelicula {
    private String nombre;
    private int duracion;
    private Director dir;
    private Productora prod;
    private Actor act;

    public Pelicula() {
    }

    public Pelicula(String nombre, int duracion, Director dir, Productora prod, Actor act) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.dir = dir;
        this.prod = prod;
        this.act = act;
    }

    public Actor getAct() {
        return act;
    }

    public void setAct(Actor act) {
        this.act = act;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Director getDir() {
        return dir;
    }

    public void setDir(Director dir) {
        this.dir = dir;
    }

    public Productora getProd() {
        return prod;
    }

    public void setProd(Productora prod) {
        this.prod = prod;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", duracion=" + duracion + ", dir=" + dir + ", prod=" + prod + ", act=" + act + '}';
    }
    
    
}
