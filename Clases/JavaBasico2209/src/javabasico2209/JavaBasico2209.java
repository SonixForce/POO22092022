/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209;

import javax.swing.JOptionPane;

/**
 *
 * @author sonix
 */
public class JavaBasico2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad = 20;
        System.out.println("Edad = " + edad);
        Integer edad_2 = new Integer(22);
        
        System.out.println(edad_2);
        double x = edad_2.doubleValue();
        System.out.println(x);
        System.out.println(edad_2.shortValue());
        System.out.println("----------------------------------------------------");
        
        //Convertir String a entero
        String cadena = "99";
        int altura = Integer.parseInt(cadena);
        altura += 1;
        System.out.println("Altura = " + altura);
        
        float y = Float.parseFloat(cadena);
        y = y + 0.5f;
        System.out.println("Altura = " + y);
        System.out.println("----------------------------------------------------");
        
        Arbol tree_1 = new Arbol(2.4f, 15);
        Arbol tree_2 = new Arbol(2.4f, 15);
        Arbol tree_3 = new Arbol(2.4f, 15);
        Arbol tree_4 = new Arbol(2.4f, 15);
        
        System.out.println(tree_1);
        
        System.out.println("Troncos de un arbol = " + tree_1.tronco);
        System.out.println("Troncos de un arbol = " + tree_2.tronco);
        System.out.println("Troncos de un arbol = " + tree_3.tronco);
        System.out.println("Troncos de un arbol = " + tree_4.tronco);
        Arbol.generarOxigeno();
        
        JOptionPane.showMessageDialog(null, "xdddd", "Equis de", JOptionPane.ERROR_MESSAGE);
        String dato = JOptionPane.showInputDialog(null, "Ingresa tu edad", "Doxeado", JOptionPane.QUESTION_MESSAGE);
        System.out.println(dato);
        
        //Sin código terniario
        int edad_3 = 15;
        String resultado = "";
        if (edad_3 < 18) {
            resultado = "Menor de edad";
        }
        else{
            resultado = "Mayor de edad, felicidades, eres viejo";
        }
        
        System.out.println(resultado);
        
        //Con código terniario
        int edad_4 = 24;
        String res = "";
        res = edad_4 < 18? "Eres menor de edad" : "Eres mayor de edad";
        System.out.println(res);
        
        //Menor cantidad de lineas de código posible
        int edad_5 = 15;
        System.out.println(edad_5 < 18? "Chamaco meco" : "Meco solamente xd");
        
        System.out.println("-------------------------------------------------------");
        
        int val_1 = 12;
        int val_2 = 27;
        
        System.out.println(val_1 | val_2);
        
        int val_3 = 1;
        int val_4 = 0;
        val_4 = val_3 << 2;
        System.out.println(val_4);
        
        System.out.println("-------------------------Arreglos-------------------------------");
        int[] edades;
        edades = new int[5];
        System.out.println(edades);
        
        edades[0] = 10;
        System.out.println("La primer edad es: " + edades[0]);
        
        int estaturas[] = new int[5];
        System.out.println(estaturas);
        
        int pesos[] = {86,99,56,76,77};
        System.out.println(pesos[0]);
        System.out.println(pesos[1]);
        System.out.println(pesos[2]);
        System.out.println(pesos[3]);
        System.out.println(pesos[4]);
        
        //Imprimir lo anterior pero bien
        System.out.println("-------Lo mismo pero con for todo bonito precioso xd----------");
        for (int i = 0; i < pesos.length; i++) {
            System.out.println(pesos[i]);
        }
        System.out.println("--------------------Inverso--------------------");
        for (int i = pesos.length-1; i >= 0; i--) {
            System.out.println(pesos[i]);
        }
        
        System.out.println("--------------------------------------------------------------");
        Alumno lista[] = new Alumno[5];
        lista[0] = new Alumno("45565212", 2, 9.0f);
        lista[1] = new Alumno("56123185", 2, 7.0f);
        lista[2] = new Alumno("74842315", 2, 6.7f);
        lista[3] = new Alumno("78231544", 2, 8.2f);
        lista[4] = new Alumno("32110584", 2, 10.0f);
        
        for (int i = 0; i < lista.length; i++) {
            Alumno alumno = lista[i];
            alumno.checkPerformance();
        }
        
        System.out.println("----------Lo mismo pero con for each-----------");
        
        for (Alumno alumno : lista) {
            alumno.checkPerformance();
        }
    }
    
}
