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
    
    int cabX;
    int cabY;

    public Caballero(int x, int y){
        cabX = x;
        cabY = y;
       Interfaz.mat[cabX][cabY]=7;
        
    }

    public void movimiento(){
        
    
    
    }//fin Movimiento
    
    
    
    
    // Métodos específicos del caballero

    // Método para calcular el daño que genera el caballero al castillo
    public double DañoCastillo() {
        return ValorDeDaño;
    }
}
