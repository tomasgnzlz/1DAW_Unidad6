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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void retirarSaldo(double saldoRetirar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
