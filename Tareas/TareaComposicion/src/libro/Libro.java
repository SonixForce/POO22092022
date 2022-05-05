/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro;

import libro.composicion.Autor;
import libro.composicion.Editorial;

/**
 *
 * @author sonix
 */
public class Libro {
    private String nombre;
    private int numPaginas;
    private Autor aut;
    private Editorial edit;

    public Libro() {
    }

    public Libro(String nombre, int numPaginas, Autor aut, Editorial edit) {
        this.nombre = nombre;
        this.numPaginas = numPaginas;
        this.aut = aut;
        this.edit = edit;
    }

    public Editorial getEdit() {
        return edit;
    }

    public void setEdit(Editorial edit) {
        this.edit = edit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public Autor getAut() {
        return aut;
    }

    public void setAut(Autor aut) {
        this.aut = aut;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", numPaginas=" + numPaginas + ", aut=" + aut + ", edit=" + edit + '}';
    }
    
}
