/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej11;

/**
 *
 * @author tomas
 */
public class Romboide extends Figura {

    public Romboide(double base, double altura) {
        super(base, altura);
    }

    @Override
    public String toString() {
        return "Romboide{\n" + super.toString() + "\n}";
    }

    @Override
    public void calcularArea() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        double area = super.getAltura() * super.getBase();
        System.out.println("Área del Romboide = " + area);
    }

}
