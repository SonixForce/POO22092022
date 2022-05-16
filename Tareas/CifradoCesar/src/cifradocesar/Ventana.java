/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cifradocesar;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author sonix
 */
public class Ventana extends JFrame{
    //Declaración de variables y elementos dentro de la ventana
    private JLabel texto_1;
    private JLabel texto_2;
    private JTextField codigo;
    private JTextField textoUsuario;
    private JButton boton;
    private String texto;
    private StringBuilder textoCifrado;
    private char[] alfabetoMin = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
    private char[] alfabetoMay = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    private JLabel resultado;
    
    public Ventana() throws HeadlessException{
        
        //Propiedades de la ventana
        setTitle("Programa de Cifrado Cesar");
        setSize(800,200);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        
        //Propiedades de los elementos dentro de la ventana
        texto_1 = new JLabel("Por favor introduce aquí el número código que deseas usar para la codificación: ");
        codigo = new JTextField(2);
        texto_2 = new JLabel("Introduce aquí el texto a codificar: ");
        textoUsuario = new JTextField(70);
        boton = new JButton("Codificar");
        textoCifrado = new StringBuilder();
        resultado = new JLabel();
        codigo.setText("1");
        
        //Añadir elementos a la ventana
        this.getContentPane().add(texto_1);
        this.getContentPane().add(codigo);
        this.getContentPane().add(texto_2);
        this.getContentPane().add(textoUsuario);
        this.getContentPane().add(boton);
        this.getContentPane().add(resultado);
        
        //Mostrar ventana
        this.validate();
        this.setVisible(true);
        
        //Acción al hacer click en el botón
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                try {
                    
                    //Código que realizará el algoritmo del cifrado cesar
                    texto = textoUsuario.getText(); //Se toma el texto que introdujo el usuario y se le asigna una variable String propia
                    
                        for (int i = 0; i < texto.length(); i++) { //Primer loop que recorrerá el texto del usuario
                            for (int j = 0; j < alfabetoMin.length; j++) { //Segundo loop que comparará el texto con el alfabeto del programa para poder reemplazar las letras del texto
                                if (texto.charAt(i) == alfabetoMay[j]) { //Comparación carácter a carácter de letras mayúsculas
                                    textoCifrado.append(alfabetoMay[(j + Integer.parseInt(codigo.getText())) % 27]); //Se añade el caracter modificado a la nueva variable que contrendrá el texto cifrado
                                }
                                else if (texto.charAt(i) == alfabetoMin[j]) { //Comparación carácter a carácter de letras minúsculas
                                    textoCifrado.append(alfabetoMin[(j + Integer.parseInt(codigo.getText())) % 27]); //Se añade el caracter modificado a la nueva variable que contrendrá el texto cifrado
                                }
                            }
                            if (texto.charAt(i) == ' '){
                                textoCifrado.append(' ');
                            }
                            resultado.setText(textoCifrado.toString());//Se muestra el texto cifrado
                        }
                        textoCifrado.delete(0, textoCifrado.length());//Limpieza de la variable del texto cifrado
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Por favor introduce valores correctos dentro de los campos de texto", "ERROR DE ENTRADA", JOptionPane.ERROR_MESSAGE);
                    System.out.println(e);
                }
            }
        });
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
            
        });
        
    }
}
