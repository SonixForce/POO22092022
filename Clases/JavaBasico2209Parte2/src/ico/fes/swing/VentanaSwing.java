/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.swing;

import ico.fes.herencia.Persona;
import ico.fes.modelo.ModeloPersonaCombo;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author sonix
 */
public class VentanaSwing extends JFrame{

    private JTextField cuadro;
    private JButton boton;
    private JLabel resultado;
    private JLabel instruccion;
    private float gradosF = 0;
    ImageIcon icono = new ImageIcon(System.getProperty("user.dir") + "/src/ico/fes/swing/img/Temperatura.png");
    private JComboBox<Persona> lista;
    private ModeloPersonaCombo modelo;
    private JTextArea texto;
    
    public VentanaSwing() throws HeadlessException {
        
        setTitle("Conversión de °C a °F");
        setSize(600, 300);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        cuadro = new JTextField(5);
        boton = new JButton(icono);
        boton.setBackground(Color.YELLOW);
        boton.setOpaque(true);
        boton.setToolTipText("Click para convertir a °F");
        resultado = new JLabel("El resultado es: " + gradosF + "°F");
        instruccion = new JLabel("Introduce los °F a convertir: ");
        modelo = new ModeloPersonaCombo();
        texto = new JTextArea(5, 5);
        
        /*
        lista = new JComboBox<>();
        lista.addItem("Ingenieria");
        lista.addItem("Derecho");
        lista.addItem("Periodismo");
        lista.addItem("Arquitectura");
        */
        
        modelo.consultarBaseDatos();
        lista.setModel(modelo);
        
        this.getContentPane().add(instruccion);
        this.getContentPane().add(cuadro);
        this.getContentPane().add(boton);
        this.getContentPane().add(resultado);
        this.getContentPane().add(lista);
        this.getContentPane().add(texto);
        
        this.validate();
        this.setVisible(true);
        
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    gradosF = Float.parseFloat(cuadro.getText()) * (9.0f/5.0f) + 32;
                    resultado.setText("El resultado es: " + gradosF + "°F");
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                    JOptionPane.showMessageDialog(null, "Introduce un valor numérico por favor", "ERROR DE CAPTURA", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        this.lista.addItemListener(new ItemAdapter(){
            @Override
            public void itemStateChanged(ItemEvent ie) {
                System.out.println("evento " + ie.getItem());
                texto.setText(ie.getItem() + "\n");
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
