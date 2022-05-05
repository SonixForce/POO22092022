/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarealibro;

import java.awt.Color;
import classes.Libro;


/**
 *
 * @author sonix
 */
public class TareaLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Crear nuevo objeto de la clase libro
        Libro book = new Libro();
        
        //Estados del objeto book
        book.setAuthor("Emilio");
        book.setCoverColor(Color.yellow);
        book.setPage(1);
        book.setText("Texto de prueba");
        book.setTotalPages(20);
        
        //Se comprueba el atributo página antes de cambiarlo
        System.out.println("La página actual es: " + book.getPage());
        
        //Se utilizan los métodos de la clase
        book.changePage(9);
        book.publish("Tarea");
        
        //Se comprueban los cambios
        System.out.println("La página actual es: " + book.getPage());
    }
    
}
