/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

/**
 *
 * @author Alejandro
 */
public class Caballero {
     private double puntajeDebilidad; // Puntaje de debilidad del caballero
    private double ValorDeDaño; // Puntaje de daño del caballero

    public Caballero() {
        this.puntajeDebilidad = 0.5;
        this.   ValorDeDaño = 2.0;
    }

    // Métodos específicos del caballero

    // Método para calcular el daño que genera el caballero al castillo
    public double DañoCastillo() {
        return ValorDeDaño;
    }
}
