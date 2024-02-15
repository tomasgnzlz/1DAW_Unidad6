/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrizsopaletras;

import java.util.Random;

/**
 *
 * @author tomas
 */
public class SopaLetras {

    private char[][] matrizLetras;

    public SopaLetras(int n) {
        this.matrizLetras = rellenarMatrizChar(n);
    }

    public char[][] getMatrizLetras() {
        return matrizLetras;
    }

    public void setMatrizLetras(char[][] matrizLetras) {
        this.matrizLetras = matrizLetras;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matrizLetras.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < matrizLetras[i].length; j++) {
                System.out.print(matrizLetras[i][j] + " ");
            }
        }
        System.out.println(" ");
        return sb.toString();
    }

    // Método que rellena la matriz automaticamente
    public static char[][] rellenarMatrizChar(int num) {
        char[][] matrizAux = new char[num][num];
        Random rd = new Random();
        int random = 0;
        char letras[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R', 'S', 'T', 'W', 'X', 'Y', 'Z'};

        for (int i = 0; i < matrizAux.length; i++) {
            for (int j = 0; j < matrizAux[i].length; j++) {
                random = rd.nextInt(letras.length);
                matrizAux[i][j] = letras[random];
            }
        }
        return matrizAux;
    }

    // Metodo que recibe una palabra y devuelve un array con cada caracter de esta. 
    public char[] devolverArrayCaracteres(String palabra) {
        // array para guardar los caracteres de la palabra
        char caracteresPalabras[] = new char[palabra.length()];

        // Relleno el array con los caracteres uno a uno de la palabra que introduce el usuario
        for (int i = 0; i < caracteresPalabras.length; i++) {
            caracteresPalabras[i] = palabra.charAt(i);
        }
        return caracteresPalabras;
    }
    //colocarPalabraHorizontal, que recibe una coordenada de la matriz y un String 
    //con la palabra y pone la palabra horizontalmente en la matriz a partir de la 
    //coordenada indicada, si se puede.

    public void colocarPalabraHorizontal(int fila, int columna, String palabra) {
        char caracteresPalabras[] = devolverArrayCaracteres(palabra);

        // en la posicion indicada empiezo a meter los valores del array de caracteres.
        try {
            for (int i = 0; i < caracteresPalabras.length; i++) {
                matrizLetras[fila][columna++] = caracteresPalabras[i];
            }
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("*****PALABRA MUY EXTENSA, NO ENTRA TODA EN LA MATRIZ*****");
        }
    }

    //colocarPalabraHorizontalInvertida,que recibe una coordenada de la matriz y
    //un String con la palabra y pone la palabra horizontalmente, de forma invertida,
    //en la matriz a partir de la coordenada indicada, si se puede.
    public void colocarPalabraHorizontalInvertida(int fila, int columna, String palabra) {
        char caracteresPalabras[] = devolverArrayCaracteres(palabra);

        // en la posicion indicada empiezo a meter los valores del array de caracteres.
        try {
            for (int i = 0; i < caracteresPalabras.length; i++) {
                matrizLetras[fila][columna--] = caracteresPalabras[i];
            }
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("*****PALABRA MUY EXTENSA, NO ENTRA TODA EN LA MATRIZ*****");
        }
    }

    
    //colocarPalabraVertical,que recibe una coordenada de la matriz y un String 
    //con la palabra y pone la palabra verticalmente en la matriz a partir de la 
    //coordenada indicada, si se puede.
    public void colocarPalabraVertical(int fila, int columna, String palabra) {
        char caracteresPalabras[] = devolverArrayCaracteres(palabra);

        // en la posicion indicada empiezo a meter los valores del array de caracteres.
        try {
            for (int i = 0; i < caracteresPalabras.length; i++) {
                matrizLetras[fila++][columna] = caracteresPalabras[i];
            }
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("*****PALABRA MUY EXTENSA, NO ENTRA TODA EN LA MATRIZ*****");
        }
    }

    //colocarPalabraVerticalInvertida,que recibe una coordenada de la matriz y un
    //String con la palabra y pone la palabra verticalmente, de forma invertida, 
    //en la matriz a partir de la coordenada indicada, si se puede.
     public void colocarPalabraVerticalInvertida(int fila, int columna, String palabra) {
        char caracteresPalabras[] = devolverArrayCaracteres(palabra);

        // en la posicion indicada empiezo a meter los valores del array de caracteres.
        try {
            for (int i = 0; i < caracteresPalabras.length; i++) {
                matrizLetras[fila--][columna] = caracteresPalabras[i];
            }
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("*****PALABRA MUY EXTENSA, NO ENTRA TODA EN LA MATRIZ*****");
        }
    }
}
