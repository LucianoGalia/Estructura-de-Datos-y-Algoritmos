/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author lucia
 */
public class ListaEnlazadaEnteros {
        private Nodo cabeza;
    

    // Clase Nodo privada 
    private class Nodo {
        int valor;
        Nodo siguiente;
    
        public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }
        public int getValor() { return this.valor; }
        public Nodo getSiguiente() { return this.siguiente; }
        public void setSiguiente(Nodo siguiente) { this.siguiente = siguiente; }
        
    }
    
    // Insertar al final (iterativo para simplificar)
    public void insertar(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }
    
    // Método recursivo para sumar valores > umbral
    public int sumaMayoresQue(int umbral) {
        return sumaMayoresQueRec(cabeza, umbral);
    }
    
    private int sumaMayoresQueRec(Nodo actual, int umbral) {
        if (actual == null) {
            return 0; // Caso base: lista vacía
        }
        int sumaResto = sumaMayoresQueRec(actual.siguiente, umbral);
        return (actual.valor > umbral) ? actual.valor + sumaResto : sumaResto;
    }
    
    // Método para imprimir la lista (iterativo)
    public void imprimir() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.valor + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
    
}
