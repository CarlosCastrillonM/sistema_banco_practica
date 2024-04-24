/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umag.datos;
import java.util.ArrayList;
/**
 *
 *@author Carlos
 */
public class Banco {
    
    private String nombre;
    private ArrayList<Cliente> clientes;

    
    public Banco(String nombre) {
        this.nombre = nombre;
        clientes = new ArrayList<>();
    }
    
    public void addCliente (Cliente cliente) {
        clientes.add(cliente);
    }
    
    public ArrayList<Cliente> listarClientes (String sexo, String ciudad) {
        if (!clientes.isEmpty()) {
            ArrayList<Cliente> lista = new ArrayList<>();
            for (Cliente cliente : clientes) {
                if (cliente.getSexo().equalsIgnoreCase(sexo) && cliente.getCiudad().equalsIgnoreCase(ciudad)) {
                    lista.add(cliente);
                }
            }
            return lista;
        }
        return null;
    }
    
    public float saldoTotalCuentas (Cliente cliente) {
        if (!clientes.isEmpty()) {
            for (Cliente objCliente : clientes) {
                if (objCliente.getCedula() == cliente.getCedula()) {
                    return cliente.saldoTotalCuentas();
                }
            }
        }
        return 0;
    }
    
    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the clientes
     */
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    /**
     * @param clientes the clientes to set
     */
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Banco{" + "nombre=" + nombre + ", clientes=" + clientes + '}';
    }
    
    
}
