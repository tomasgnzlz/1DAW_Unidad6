/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej12;

/**
 *
 * @author tomas
 */
public class CuentaCorriente extends Cuenta {

    private final double interesFijo = 0.15;
    private final double saldoMinimo = 10;

    public CuentaCorriente(Persona cliente) {
        super(cliente);

    }

//    // Getters & Setters;
//    public double getSaldoMinimo() {
//        return saldoMinimo;
//    }
//
//    public void setSaldoMinimo(double saldoMinimo) {
//        this.saldoMinimo = saldoMinimo;
//    }
    
    
    // toString
    @Override
    public String toString() {
        return super.toString() + "\nCuentaCorriente{" + "interesFijo=" + interesFijo + ", saldoMinimo=" + saldoMinimo + '}';
    }

    @Override
    public void actualizarSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void retirarSaldo(double saldoRetirar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
