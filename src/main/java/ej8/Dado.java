/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej8;

import java.util.Random;

/**
 *
 * @author tomas
 */
public class Dado extends Azar {

    @Override
    public int lanzar() {
        return this.posibilidades = new Random().nextInt(1, 7);
    }

}
