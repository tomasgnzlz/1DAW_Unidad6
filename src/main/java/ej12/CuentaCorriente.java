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

    private double interesFijo = 0.15;
    private double saldoMinimo = 10;

    public CuentaCorriente(Persona cliente) {
        super(cliente);

    }

    // Getters & Setters
    public double getInteresFijo() {
        return interesFijo;
    }

    public void setInteresFijo(double interesFijo) {
        this.interesFijo = interesFijo;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + "\nCuentaCorriente{" + "interesFijo=" + interesFijo + ", saldoMinimo=" + saldoMinimo + '}';
    }

    // Métodos abstractos
    @Override
    public void actualizarSaldo() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        double saldoNuevo = 0;
        if (this.getSaldo() > 1000) {
            saldoNuevo = this.getSaldo() + (saldoMinimo * interesFijo);
            this.setSaldo(saldoNuevo);
        } else {
            saldoNuevo = this.getSaldo() + (saldoMinimo + interesFijo);
            this.setSaldo(saldoNuevo);
        }
    }

    @Override
    public void retirarSaldo(double saldoRetirar) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        double saldoNuevo = 0;
        saldoNuevo = this.getSaldo() - saldoRetirar;
        if (saldoNuevo < saldoMinimo) {
            System.out.println("No puedes retirar tanta cantidad");
        } else {
            // Se establece el nuevo saldo
            this.setSaldo(saldoNuevo);
        }
    }

}
