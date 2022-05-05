/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacomposicion;
import libro.Libro;
import libro.composicion.Autor;
import libro.composicion.Editorial;
import pelicula.Pelicula;
import pelicula.composicion.Actor;
import pelicula.composicion.Director;
import pelicula.composicion.Productora;
/**
 *
 * @author sonix
 */
public class TareaComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Libro lib = new Libro("Java para mensos", 500, new Autor("Pepe", "México"), new Editorial("Alfa Omega", 1));
        
        lib.getAut().escribir();
        lib.getEdit().publicar();
        
        System.out.println(lib);
        
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        
        Pelicula peli = new Pelicula("Peliculón: La película", 230, new Director("Juan Pepe", "México"), new Productora("DisneiWorks", 3.4f), new Actor("Pepe Juan", 30));
        
        peli.getDir().coordinar();
        peli.getProd().publicar();
        peli.getAct().actuar();
        
        System.out.println(peli);
        
    }
    
}
