/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.componentes;

/**
 *
 * @author sonix
 */
public class Teclado {
    private String marca;
    private int numTeclas;

    public Teclado() {
    }

    public Teclado(String marca, int numTeclas) {
        this.marca = marca;
        this.numTeclas = numTeclas;
    }

    public int getNumTeclas() {
        return numTeclas;
    }

    public void setNumTeclas(int numTeclas) {
        this.numTeclas = numTeclas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + ", numTeclas=" + numTeclas + '}';
    }
    
    
    
}
