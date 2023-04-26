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
   
    private double ValorDeDaño; // Puntaje de daño del caballero
    
    int posX;
    int posY;

    public Caballero(int x, int y){
        posX = x;
        posY = y;
       // Interfaz.mat[posX][posY]=7;
        
    }

    public void movimiento(){
        
    
    
    }//fin Movimiento
    
    
    
    
    // Métodos específicos del caballero

    // Método para calcular el daño que genera el caballero al castillo
    public double DañoCastillo() {
        return ValorDeDaño;
    }
}
