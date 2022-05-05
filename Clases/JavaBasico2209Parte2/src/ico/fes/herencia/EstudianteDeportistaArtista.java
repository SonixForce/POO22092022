/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia;

/**
 *
 * @author sonix
 */
public class EstudianteDeportistaArtista extends Persona implements Deportista,Artista {
    private String carrera;
    private String numeroCuenta;
    private String deporte;
    private String arte;

    public EstudianteDeportistaArtista() {
    }

    public EstudianteDeportistaArtista(String carrera, String numeroCuenta, String deporte, String arte) {
        this.carrera = carrera;
        this.numeroCuenta = numeroCuenta;
        this.deporte = deporte;
        this.arte = arte;
    }

    public String getArte() {
        return arte;
    }

    public void setArte(String arte) {
        this.arte = arte;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    @Override
    public String toString() {
        return "EstudianteDeportistaArtista{" + "carrera=" + carrera + ", numeroCuenta=" + numeroCuenta + ", deporte=" + deporte + ", arte=" + arte + '}';
    }

    @Override
    public void entrenar() {
        System.out.println(this.nombre + " está entrenando " + this.deporte);
    }

    @Override
    public void jugar() {
        System.out.println(this.nombre + " está jugando " + this.deporte);
    }

    @Override
    public void ensayar() {
        System.out.println(this.nombre + " está ensayando/practicando " + this.arte);
    }

    @Override
    public void presentar() {
        System.out.println(this.nombre + " va a presentar " + this.arte);
    }
    
    
    
    }
