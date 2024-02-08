/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejpalindromo;

import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class PalindromoIterativo {

    public static void main(String[] args) {
        boolean esPalindroma = palindromo("ariel");
        System.out.println(esPalindroma);
    }

    public static boolean palindromo(String palabra) {
        int posicion = 0;
        boolean palindroma = false;

        for (int i = 0; i < palabra.length(); i++) {

            posicion = palabra.length() - 1;
            //System.out.println(palabra.charAt(i) + " = "+ palabra.charAt(posicion-i));

            if (palabra.charAt(i) == palabra.charAt(posicion - i)) {
                palindroma = true;
            } else {
                palindroma = false;
            }

        }

        return palindroma;
    }
}
