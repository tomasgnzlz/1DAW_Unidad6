/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej12;

/**
 *
 * @author tomas
 */
public class CuentaAhorro extends Cuenta {

    private double interesVariable;
    private double comisionAnual;

    public CuentaAhorro(Persona cliente, double interesVariable, double comisionAnual) {
        super(cliente);
        this.interesVariable = interesVariable;
        this.comisionAnual = comisionAnual;
    }

    public double getInteresVariable() {
        return interesVariable;
    }

    public void setInteresVariable(double interesVariable) {
        this.interesVariable = interesVariable;
    }

    public double getComisionAnual() {
        return comisionAnual;
    }

    public void setComisionAnual(double comisionAnual) {
        this.comisionAnual = comisionAnual;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCuentaAhorro{" + "interesVariable=" + interesVariable + ", comisionAnual=" + comisionAnual + '}';
    }

    @Override
    public void actualizarSaldo() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        double saldoNuevo = 0;

        saldoNuevo = ((this.getSaldo() + (this.getSaldo() * interesVariable)) - comisionAnual);

        this.setSaldo(saldoNuevo);
        // controlar el saldo negativo...

    }

    @Override
    public void retirarSaldo(double saldoRetirar) {
        double saldoNuevo = 0;
        saldoNuevo = this.getSaldo() - saldoRetirar;
        if (saldoNuevo > 0) {
            this.setSaldo(saldoNuevo);
        } // de lo contrario no se podra retirar el dinero
    }

}
