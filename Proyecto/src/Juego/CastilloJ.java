/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

/**
 *
 * @author Alejandro
 */
public class CastilloJ {
    private Pila pilaJ; // Pila para el castillo del jugador

    public CastilloJ() {
        this.pilaJ = new Pila();
    }

    // Métodos específicos del castillo del jugador
    public int pop() {
        if (!pilaJ.Vacia()) {
            return pilaJ.pop();
        } else {
            System.out.println("La pila del castillo del jugador está vacía.");
            return -1; // Otra forma de manejar el caso de pila vacía
        }
    }

    public void imprimirCastilloJ() {
        System.out.println("Datos del Castillo de la CPU:");
        System.out.println("--------------------------");
        pilaJ.listar(); // Llama al método de la pila para imprimir los datos
    }
}
