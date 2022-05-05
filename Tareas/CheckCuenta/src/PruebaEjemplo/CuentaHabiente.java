/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PruebaEjemplo;

/**
 *
 * @author sonix
 */
public class CuentaHabiente {
    private int idCliente;
    private String nombre;
    private float balance;

    public CuentaHabiente() {
    }

    public CuentaHabiente(int idCliente, String nombre, float balance) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "CuentaHabiente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", balance=" + balance + '}';
    }
    
    public String retirarDinero(float monto){
        if (balance < monto) {
          return "Usted no puede retirar esa cantidad de dinero en este momento, lo sentimos.";  
        }
        else{
            balance -= monto;
            return "Usted ha retirado: $" + monto + " de su cuenta, su saldo actual es de: $" + balance;
        }
    }
    
    public String evaluarNivelCliente(){
        return balance <= 50000.00f? "Usted es un cliente regular" : "Usted es un cliente premium! felicidades!!!";
    }
    
}
