/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

/**
 *
 * @author Alejandro
 */
public class Pila {
        private Nodo cima;
    private int largo;

    public Pila() {
        this.cima = null;
        this.largo = 0;
        inicializarPila1(10); //Numero de referencia para la creacion de los nodos
    }

    public boolean Vacia() {
        return cima == null;
    }
    
//El push fue retocado para que imprimiese de menor a mayor
public void push(int valor){
    Nodo newNode = new Nodo();
    newNode.setValor(valor);
    
    if (this.Vacia()){
        this.cima = newNode;
    }
    else{
        Nodo aux = this.cima;
        Nodo prev = null;
        while (aux != null && aux.getValor() > valor){
            prev = aux;
            aux = aux.getSiguiente();
        }
        newNode.setSiguiente(aux);
        if (prev == null){
            this.cima = newNode;
        }
        else{
            prev.setSiguiente(newNode);
        }
    }
    this.largo++;
}
     

    public int pop() {
            int aux = cima.getValor();
            // Asigna como primer node al siguiente de la pila.
            this.cima = this.cima.getSiguiente();
            // Decrementa el contador del tamaño de la pila
            this.largo--;
            return aux;
        }
    
    
    public void listar() {
        // Crea una copia de la pila.
        Nodo aux = cima;
        // Recorre la pila hasta el ultimo node.
        while (aux != null) {
            System.out.println("|\t" + aux.getValor() + "\t|");
            System.out.println("-----------------");
            aux = aux.getSiguiente();
        }
    }
    

// Método recursivo para inicializar la pila segun los nodos establecidos en n
    private void inicializarPila1(int n) {
        if (n > 0) {
            push(n);
            inicializarPila1(n - 1);
        }
    }
}
