/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reutilizacioncodigo2209;

import ico.fes.herencia.Alumno;
import ico.fes.herencia.Persona;

/**
 *
 * @author sonix
 */
public class PruebasPolimorfismo {
    public static void main(String[] args) {
        System.out.println("Hola polimorfismo");
        Persona per_1 = new Persona();
        per_1.setNombre("José");
        per_1.dormir();
        
        Alumno al_1 = new Alumno();
        al_1.setNombre("José");
        al_1.dormir();
        
        al_1.dormir(4);
        System.out.println(al_1.NumCuenta);
    }
}
