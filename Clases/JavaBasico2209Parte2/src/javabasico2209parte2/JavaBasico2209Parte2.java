/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209parte2;

import ico.fes.herencia.EstudianteDeportistaArtista;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author sonix
 */
public class JavaBasico2209Parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<String> nombres = new ArrayList<String>();
        
        nombres.add("Alma");
        nombres.add("Bartolo");
        nombres.add("Carlos");
        nombres.add("Diana");
        nombres.add("Ernesto");
        
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        
        System.out.println("----------------------------------------------------------");
        Scanner teclado = new Scanner(System.in);
        
        int seleccion = 0;
        
        String elNombre = "";
        try {
            seleccion = teclado.nextInt();
            elNombre = nombres.get(seleccion);
            
        }catch(InputMismatchException ime){
            System.out.println("Error no se detectó ningún numero");
            elNombre = nombres.get(0);
        }catch (IndexOutOfBoundsException ioobe) {
            System.out.println("Por favor introduce un número entre el 0 y el 4");
            elNombre = nombres.get(0);
        }catch(Exception e){
            System.out.println("Generic exception: " + e);
        }finally {
            System.out.println(elNombre);
            elNombre = null;
        }
        
        
        System.out.println("\nContinúa el programa....\n");
        
        Aritmetica calculadora = new Aritmetica(2, 0);
        System.out.println(calculadora.getA() + " + " + calculadora.getB() + " = " + calculadora.sumar());
        
        try {
            System.out.println(calculadora.getA() + " / " + calculadora.getB() + " = " + calculadora.dividir());
        } catch (Exception e) {
            System.out.println("Error aritmético");
        }
        
        System.out.println("Fin del programa");
        
        
        System.out.println("-------------------------------------Interfaces-------------------------------------");
        
        Cuadrado cuad = new Cuadrado(5.0f);
        Circulo cir = new Circulo(4.5f);
        
        System.out.println("Esta es el área del cuadrado: " + cuad.calcularArea());
        System.out.println("Esta es el área del circulo: " + cir.calcularArea());
        
        System.out.println("---------------------------------------------------------------------------------------");
        
        EstudianteDeportistaArtista estu = new EstudianteDeportistaArtista("Computacion", "45612385", "Fuchibol", "Piano");
        estu.setNombre("Juan");
        estu.setEdad(20);
        
        estu.comer();
        estu.ensayar();
        estu.presentar();
        estu.jugar();
        estu.entrenar();
        
        System.out.println(estu);
        
    }
    
}
