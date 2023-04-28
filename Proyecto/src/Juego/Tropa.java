/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

/**
 *
 * @author ferva
 */
public abstract class Tropa {

    double puntajeDebilidad; // Puntaje de debilidad de la tropa
    double valorDeDaño; // Puntaje de daño de la tropa
    int tropaX; // Posición en X de la tropa en la matriz
    int tropaY; // Posición en Y de la tropa en la matriz

    public Tropa(int x, int y) {
        tropaX = x;
        tropaY = y;
    }

    public abstract void mover(int x, int y);

    // getters y setters para los datos de la 
    public double getPuntajeDebilidad() {
        return puntajeDebilidad;
    }

    public void setPuntajeDebilidad(double puntajeDebilidad) {
        this.puntajeDebilidad = puntajeDebilidad;
    }

    public double getValorDeDaño() {
        return valorDeDaño;
    }

    public void setValorDeDaño(double valorDeDaño) {
        this.valorDeDaño = valorDeDaño;
    }

    public int getTropaX() {
        return tropaX;
    }

    public void setTropaX(int tropaX) {
        this.tropaX = tropaX;
    }

    public int getTropaY() {
        return tropaY;
    }

    public void setTropaY(int tropaY) {
        this.tropaY = tropaY;
    }

}
