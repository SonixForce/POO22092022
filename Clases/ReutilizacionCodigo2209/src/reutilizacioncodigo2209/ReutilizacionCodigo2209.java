/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilizacioncodigo2209;

import asus.com.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;
import ico.fes.herencia.Alumno;
import ico.fes.herencia.Servidor;
import ico.fes.herencia.polimorfismo.Animal;
import ico.fes.herencia.polimorfismo.Perro;
import javax.swing.JFrame;

/**
 *
 * @author sonix
 */
public class ReutilizacionCodigo2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = new String("José José");
        System.out.println( nombre );
        System.out.println(nombre.charAt(3));
        System.out.println(nombre.toUpperCase());
        
        /*
        JFrame ventana = new JFrame("Mi primer ventana Java");
        ventana.setSize(600, 400);
        ventana.setVisible(true);
        */
        
        Computadora miCompu = new Computadora();
        miCompu.setMarca("Asus");
        miCompu.setCpu(new Procesador("intel", 3.5f));
        System.out.println(miCompu);
        miCompu.getCpu().setMarca("AMD");
        System.out.println(miCompu);
        //Ejercicio: Establecer un mouse marca Logitech tipo óptico
        miCompu.setRaton(new Mouse("Logitech", "Optico"));
        System.out.println(miCompu);
        
        Computadora compu_2 = new Computadora("Apple", "MacBook Pro", 
                new Monitor("Toshiba", 14.3f), 
                new Mouse("Acteck", "Óptico"), 
                new Teclado("Apple", 101), 
                new Procesador("M1", 3.4f));
        System.out.println(compu_2);
        
        System.out.println("-------------------------------------------------------------------------");
        
        Alumno alu_1 = new Alumno();
        
        alu_1.setNombre("José");
        System.out.println(alu_1);
        
        Alumno alu_2 = new Alumno("Pepe", 20, 545612354, "Ing. en Computación");
        System.out.println(alu_2);
        
        
        alu_1.setNumCuenta(2345315);
        alu_1.setEdad(19);
        System.out.println(alu_1);
        
        System.out.println("-------------------Composición y herencia en la misma clase-----------------------");
        Servidor server = new Servidor(4, 4, "Raid 0");
        server.setNumTarjetasRed(2);
        server.setMarca("HP");
        server.setRaton(new Mouse("LG", "Optico"));
        server.getRaton().setMarca("Logitech");
        System.out.println(server);
        
        System.out.println("------Ejemplo polimorfismo------");
        Perro dog = new Perro("Bull dog", "5 estrellas", 4);
        System.out.println(dog);
        dog.emitirSonido();
        Animal a = new Perro("ds", "a");
        System.out.println((Animal)a);
    }
    
}
