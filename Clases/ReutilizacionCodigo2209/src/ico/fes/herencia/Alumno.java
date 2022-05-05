/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia;

/**
 *
 * @author sonix
 */
public class Alumno extends Persona{
    private int numCuenta;
    private String carrera;
    int cantidad = 1;

    public Alumno() {
    }

    public Alumno(String nombre, int edad, int numCuenta, String carrera) {
        super(nombre,edad);
        this.numCuenta = numCuenta;
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    @Override
    public String toString() {
        return super.toString() + "Alumno{" + "numCuenta=" + numCuenta + ", carrera=" + carrera + '}';
    }
    
    public void estudiar(){
        System.out.println(this.getNombre() + " está estudiando" + cantidad + " Hrs.");
    }
    
    @Override
    public void dormir(){
        System.out.println("El estudiante " + this.getNombre() + " está durmiendo 5 horas...");
    }
    
    // Polimorfismo por sobre carga
    public void dormir(int horasEstudio){
        int horasDormir = 8;
        
        System.out.println(this.getNombre() + " está durmiendo " + (horasDormir - horasEstudio) + " horas");
        
    }
}
