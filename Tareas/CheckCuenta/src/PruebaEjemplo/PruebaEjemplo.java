/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PruebaEjemplo;

/**
 *
 * @author sonix
 */
public class PruebaEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaHabiente cliente[] = new CuentaHabiente[5];
        
        cliente[0] = new CuentaHabiente(4562420, "Juan Perez", 8123.88f);
        cliente[1] = new CuentaHabiente(4562482, "Rodrigo Sanchez", 50321.32f);
        cliente[2] = new CuentaHabiente(4562358, "Laura Rodriguez", 88542.66f);
        cliente[3] = new CuentaHabiente(4213587, "Juana Perez", 132.58f);
        cliente[4] = new CuentaHabiente(4154863, "Manuel Juarez", 57000.00f);
        
        for (CuentaHabiente cuentaHabiente : cliente) {
            System.out.println("Bienvenido señor(a) " + cuentaHabiente.getNombre() +" a su sistema bancario, su identificador es: " + cuentaHabiente.getIdCliente() + " y su saldo actual es de: $" + cuentaHabiente.getBalance());
            System.out.println(cuentaHabiente.evaluarNivelCliente());
            System.out.println(cuentaHabiente.retirarDinero(10000f));
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }
    
}
