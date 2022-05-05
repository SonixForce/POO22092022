/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

/**
 *
 * @author sonix
 */
public class Alumno extends Persona{ //Hereda atributos y metodos
    private int numeroCuenta;
    private int grupo;
    private String carrera;

    public Alumno() {
    }

    public Alumno(int numeroCuenta, int grupo, String carrera) {
        this.numeroCuenta = numeroCuenta;
        this.grupo = grupo;
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return super.toString() + "Alumno{" + "numeroCuenta=" + numeroCuenta + ", grupo=" + grupo + ", carrera=" + carrera + '}';
    }
    
    
    
}
