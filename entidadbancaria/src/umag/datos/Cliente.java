/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umag.datos;
import java.util.ArrayList;
/**
 *
 * @author Carlos
 */
public class Cliente {
    
    private String nombre;
    private int cedula;
    private ArrayList<Cuenta> cuentas;
    private String ciudad;
    private String sexo;
    

    public Cliente(String nombre, int cedula, String ciudad, String sexo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.ciudad = ciudad;
        this.sexo = sexo;
        cuentas = new ArrayList<>();
    }
    
    public void addCuenta (Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    public void aumentarSaldo (float aumento, int idCuenta) {
        if (!cuentas.isEmpty()) {
            for (Cuenta cuenta : cuentas) {
                if (cuenta.getId() == idCuenta) {
                    cuenta.setSaldo(cuenta.getSaldo() + aumento);
                }
            }
        }
    }
    
    public float buscarValorIntereses (int idCuenta) {
        if (!cuentas.isEmpty()) {
            float vIntereses = 0;
            for (Cuenta cuenta : cuentas) {
                if (cuenta.getId() == idCuenta) {
                    vIntereses = cuenta.intereses();
                }
            }
            return vIntereses;
        }
        return 0;
    }
    
    public float saldoTotalCuentas () {
        if (!cuentas.isEmpty()) {
            float dineroCuentas = 0;
            for (Cuenta cuenta : cuentas) {
                dineroCuentas += cuenta.getSaldo();
            }
            return dineroCuentas;
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
     * @return the cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the cuentas
     */
    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    /**
     * @param cuentas the cuentas to set
     */
    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", cedula=" + cedula + ", cuentas=" + cuentas + ", ciudad=" + ciudad + ", sexo=" + sexo + '}';
    }
    
    
}
