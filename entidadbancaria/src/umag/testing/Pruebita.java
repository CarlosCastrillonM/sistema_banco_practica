/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umag.testing;
import umag.datos.*;
/**
 *
 * @author Carlos 
 */
public class Pruebita {
    
    public static void main(String[] args) {
        
        Cliente cl = new Cliente("Carlos", 10, "sa", "ma");
        Cliente cl2 = new Cliente("Caos", 110, "sa", "ma");

        Cuenta cu = new Cuenta(1, 10000, "Ahorro");
        Cuenta cu1 = new Cuenta(2, 10000, "Corriente");
        Cuenta cu2 = new Cuenta(3, 10000, "CDT");
        
        Banco ba= new Banco("SANNN");
        
        cl.addCuenta(cu);
        cl.addCuenta(cu1);
        cl.addCuenta(cu2);
        
        ba.addCliente(cl);
        
        ba.addCliente(cl2);
        
        cl.aumentarSaldo(100, 1);
        cu.intereses();
        
        //System.out.println(cl.buscarValorIntereses(1));
        System.out.println(ba.saldoTotalCuentas(cl));
        System.out.println(ba.listarClientes("ma", "sa"));
        System.out.println(cu.intereses());
        System.out.println(cl);
        
    }
    
    
    
}
