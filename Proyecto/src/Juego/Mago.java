/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

/**
 *
 * @author Alejandro
 */
public class Mago {
     private double puntajeDebilidad; // Puntaje de debilidad del mago
    private double ValorDeDaño; // Puntaje de daño del mago
    int magX;
    int magY;
    
    
    
    public Mago(int x, int y) {
        magX = x;
        magY = y;
        Interfaz.mat[magX][magY]=9;
    }

    // Métodos específicos del mago

    // Método para calcular el daño que genera el mago al castillo
    public double DañoCastillo() {
        return ValorDeDaño;
    }
}
