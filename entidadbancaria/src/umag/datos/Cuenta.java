/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umag.datos;

/**
 *
 * @author Carlos
 */
public class Cuenta {
    
    private int id;
    private float saldo;
    private String tipoCuenta;

    public Cuenta(int id, float saldo, String tipoCuenta) {
        this.id = id;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }
    
    public float intereses () {
        if (tipoCuenta.equalsIgnoreCase("Ahorro")) {
            return saldo*0.02f;
        
        } else if (tipoCuenta.equalsIgnoreCase("Corriente")) {
            return saldo*0.0002f;
        
        } else if (tipoCuenta.equalsIgnoreCase("CDT")) {
            return saldo*0.1f;
        }
        return 0;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the saldo
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoCuenta
     */
    public String getTipoCuenta() {
        return tipoCuenta;
    }

    /**
     * @param tipoCuenta the tipoCuenta to set
     */
    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "id=" + id + ", saldo=" + saldo + ", tipoCuenta=" + tipoCuenta + '}';
    }

    
}
