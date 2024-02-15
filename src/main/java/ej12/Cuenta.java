/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej12;

import java.util.HashSet;
import java.util.Set;
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

    //Creo un set para guardar los numeros de cuenta
    private static Set<String> conjuntoNumerosCuenta = new HashSet<>();

    public static String generarNumerosUnicos() {
        RandomStringUtils rds = new RandomStringUtils();
        String numCuenta = "";
        boolean salir = false;
        do {
            numCuenta = rds.randomNumeric(20);
            if (!conjuntoNumerosCuenta.contains(numCuenta)) {
                conjuntoNumerosCuenta.add(numCuenta);
                salir = true;
            }
        } while (!salir);

        return numCuenta;

    }

    // Constructor con parmetros
    public Cuenta(Persona cliente) {
        //RandomStringUtils rds = new RandomStringUtils();
        //this.numeroCuenta = rds.randomNumeric(21);
        this.numeroCuenta = generarNumerosUnicos();
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
