/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosrecursividad;

import java.util.Random;

/**
 *
 * @author tomas
 */
public class Ej1 {

    public static void main(String[] args) {
        //Recorrer un array de forma recursiva e imprimir valores

        char[] arrayChar = new char[5];
        arrayChar = rellenarMatrizChar(arrayChar);

        recursivo(arrayChar, 0);

        //
        //
        int[] arrayNumeros = {1, 2, 3, 4, 5};
        System.out.println(recursivoSumar(arrayNumeros, 0));

    }

    public static char[] rellenarMatrizChar(char[] arrayAux) {
        Random rd = new Random();
        int random = 0;
        char letras[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R', 'S', 'T', 'W', 'X', 'Y', 'Z'};

        for (int i = 0; i < arrayAux.length; i++) {
            random = rd.nextInt(letras.length);
            arrayAux[i] = letras[random];
        }
        return arrayAux;
    }

    public static void recursivo(char[] arrayAux, int posicion) {

        if (posicion < arrayAux.length) {
            System.out.println(arrayAux[posicion++]);
            recursivo(arrayAux, posicion);
        }

    }

    public static int recursivoSumar(int[] array, int posicion) {

        if (posicion == 0) {
            return 0;
        } else {
            posicion++;
            return recursivoSumar(array, posicion);
        }

    }

}
