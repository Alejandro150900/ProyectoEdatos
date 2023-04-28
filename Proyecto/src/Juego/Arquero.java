/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import java.awt.event.ActionEvent;

/**
 *
 * @author Alejandro
 */
public class Arquero {
    
    
    int arqX;
    int arqY;
    
    //private double puntajeDebilidad; // Puntaje de debilidad del arquero
    //private double ValorDeDaño; // Puntaje de daño del arquero arquero

    public Arquero(int x, int y) {
        arqX= x;
        arqY= y;  
        Interfaz.mat[arqX][arqY] = 8;
        
    }//constructor
    
    public void movimiento(){
    
    }
    
    
    
    
    
    // Métodos específicos del arquero

    // Método para calcular el daño que genera el arquero al castillo
    /*public double DañoCastillo() {
        return ValorDeDaño;
    }*/
}
