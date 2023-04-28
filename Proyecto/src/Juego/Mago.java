/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

/**
 *
 * @author Alejandro
 */
public class Mago extends Tropa {

    public Mago(int x, int y) {
        super(x, y);
        puntajeDebilidad = 0.5;
        valorDeDaño = 1.0;
        Interfaz.mat[tropaX][tropaY] = 9;
    }

    @Override
    public void mover(int nuevaX, int nuevaY) {

        Interfaz.mat[tropaX][tropaY] = 1;
        // rellena la posicion anterior
        tropaX = nuevaX;
        tropaY = nuevaY;
        // se actliza la posicion del mago
        Interfaz.mat[tropaX][tropaY] = 9;
    }
}
