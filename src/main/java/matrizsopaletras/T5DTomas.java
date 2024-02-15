/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package matrizsopaletras;

/**
 *
 * @author tomas
 */
public class T5DTomas {

    public static void main(String[] args) {
        SopaLetras s1 = new SopaLetras(5);
        System.out.println(s1.toString());

        System.out.println("*************PALABRA HORIZONTAL*************");
        s1.colocarPalabraHorizontal(0, 0, "tomas");
        System.out.println(s1.toString());

        System.out.println("*************PALABRA HORIZONTAL INVERTIDA*************");
        s1.colocarPalabraHorizontalInvertida(1, 3, "TOMAS");
        System.out.println(s1.toString());

        System.out.println("*************PALABRA VERTICAL*************");
        s1.colocarPalabraVertical(0, 0, "ToMaS");
        System.out.println(s1.toString());

        System.out.println("*************PALABRA VERTICAL INVERTIDA*************");
        s1.colocarPalabraVerticalInvertida(4, 4, "toMAS");
        System.out.println(s1.toString());

    }
}
