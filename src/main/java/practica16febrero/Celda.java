/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica16febrero;

/**
 *
 * @author tomas
 */
class Celda {

    private int x;
    private int y;

    public Celda(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        //return "Celda{" + "x=" + x + ", y=" + y + '}';
        return "[" + x + ":" + y + "]";
    }

}
