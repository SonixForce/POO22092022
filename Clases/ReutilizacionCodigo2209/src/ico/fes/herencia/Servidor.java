/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia;

import asus.com.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;

/**
 *
 * @author sonix
 */
public class Servidor extends Computadora{
   private int numFuentesPoder;
   private int numTarjetasRed;
   private String tipoRaid;

    public Servidor() {
    }

    public Servidor(int numFuentesPoder, int numTarjetasRed, String tipoRaid) {
        this.numFuentesPoder = numFuentesPoder;
        this.numTarjetasRed = numTarjetasRed;
        this.tipoRaid = tipoRaid;
    }

    public Servidor(int numFuentesPoder, int numTarjetasRed, String tipoRaid, String marca, String modelo, Monitor pantalla, Mouse raton, Teclado teclado, Procesador cpu) {
        super(marca, modelo, pantalla, raton, teclado, cpu);
        this.numFuentesPoder = numFuentesPoder;
        this.numTarjetasRed = numTarjetasRed;
        this.tipoRaid = tipoRaid;
    }

    public String getTipoRaid() {
        return tipoRaid;
    }

    public void setTipoRaid(String tipoRaid) {
        this.tipoRaid = tipoRaid;
    }

    public int getNumFuentesPoder() {
        return numFuentesPoder;
    }

    public void setNumFuentesPoder(int numFuentesPoder) {
        this.numFuentesPoder = numFuentesPoder;
    }

    public int getNumTarjetasRed() {
        return numTarjetasRed;
    }

    public void setNumTarjetasRed(int numTarjetasRed) {
        this.numTarjetasRed = numTarjetasRed;
    }

    @Override
    public String toString() {
        return super.toString() + "Servidor{" + "numFuentesPoder=" + numFuentesPoder + ", numTarjetasRed=" + numTarjetasRed + ", tipoRaid=" + tipoRaid + '}';
    }

    
   
}
