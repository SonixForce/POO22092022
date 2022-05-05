/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.awt.Color;
import poo.conceptos.basicos.Automovil;

/**
 *
 * @author sonix
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo Java !!!!");
        
        Persona per_1 = new Persona();
        per_1.setNombre("Emilio");
        
        System.out.println("Nombre: " + per_1.getNombre());
        
        Persona  per_2 = new Persona();
        per_2.setNombre("Gelipe");
        System.out.println("Nombre persona 2: " + per_2.getNombre());
        
        per_1.comer("Mollete");
        per_2.comer("Picsa");
        
        
        Automovil bocho = new Automovil();
        
        Automovil acura = new Automovil();
        
        Automovil mustang = new Automovil();
        
        bocho.setMarca("VolksWagen");
        bocho.setSubMarca("Sedan");
        bocho.setModelo(1970);
        bocho.setColor(Color.BLUE);
        
        acura.setMarca("Akura");
        acura.setSubMarca("NSX");
        acura.setModelo(2013);
        acura.setColor(Color.GRAY);
        
        mustang.setMarca("Ford");
        mustang.setSubMarca("Mustang");
        mustang.setModelo(2010);
        mustang.setColor(Color.YELLOW);
        
        System.out.println("Marca: " + bocho.getMarca());
    }    
}
