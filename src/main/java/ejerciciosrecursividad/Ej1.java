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

        recursivoMostrar(arrayChar, 0);

        //
        //
        int[] arrayNumeros = {1, 2, 3, 4, 5};
        
        System.out.println( "La suma de todos los valores del array: "+recursivoSumar(arrayNumeros, 0));

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

    public static void recursivoMostrar(char[] arrayAux, int posicion) {

        if (posicion < arrayAux.length) {
            System.out.println(arrayAux[posicion++]);
            recursivoMostrar(arrayAux, posicion);
        }

    }

    public static int recursivoSumar(int[] array, int posicion) {
        int suma = 0;
        if (posicion < array.length) {
            suma += array[posicion++];
            return suma + recursivoSumar(array, posicion);
       }
        return suma;

    }

}
