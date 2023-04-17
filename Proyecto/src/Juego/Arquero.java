/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

/**
 *
 * @author Alejandro
 */
public class Arquero {
     private double puntajeDebilidad; // Puntaje de debilidad del arquero
    private double ValorDeDaño; // Puntaje de daño del arquero arquero

    public Arquero() {
        this.puntajeDebilidad = 0.5;
        this.ValorDeDaño = 1.0;
    }

    // Métodos específicos del arquero

    // Método para calcular el daño que genera el arquero al castillo
    public double DañoCastillo() {
        return ValorDeDaño;
    }
}
