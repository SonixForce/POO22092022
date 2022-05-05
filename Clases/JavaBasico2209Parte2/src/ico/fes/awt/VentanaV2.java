/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author sonix
 */
public class VentanaV2 extends Frame {
    private TextField cuadroTexto;
    private Button boton_1;
    private Label etiqueta;
    private FlowLayout layout;

    public VentanaV2() throws HeadlessException {
        this.setTitle("Ventana 2 OwO");
        this.setSize(300,220);
        
        layout = new FlowLayout(FlowLayout.LEFT);
        this.setLayout(layout);
        
        cuadroTexto = new TextField(15);
        boton_1 = new Button("Enviar");
        etiqueta = new Label("Ingresa tu nombre");
        
        this.add(cuadroTexto);
        this.add(boton_1);
        this.add(etiqueta);
        
        this.boton_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                etiqueta.setText("Hola " + cuadroTexto.getText());
                System.out.println("Coordenadas x = " + e.getX());
                System.out.println("Coordenadas y = " + e.getY());
            }
        });
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        this.cuadroTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println(e.getKeyChar());
                System.out.println(e.getKeyCode());
            }
            
        });
        
        this.setVisible(true);
    }
    
    
}
