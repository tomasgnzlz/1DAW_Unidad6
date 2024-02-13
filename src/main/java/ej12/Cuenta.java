/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej12;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author tomas
 */
public abstract class Cuenta {

    // Declaracion de atributos
    private String numeroCuenta;
    private double saldo;
    private Persona cliente;

    // Constructor con parmetros
    public Cuenta(Persona cliente) {
        RandomStringUtils rds = new RandomStringUtils();
        this.numeroCuenta = rds.randomNumeric(21);
        this.saldo = 0.0;
        this.cliente = cliente;
    }

    // Getters & Setters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    //toString
    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", cliente=" + cliente.getNombre() + '}';
    }
    
    
    public abstract void actualizarSaldo();
    public abstract void retirarSaldo(double saldoRetirar);

}
