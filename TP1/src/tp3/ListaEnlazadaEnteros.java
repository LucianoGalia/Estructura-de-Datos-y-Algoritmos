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
    /*3) Dada una lista enlazada de números enteros, escriba un algoritmo recursivo
    que calcule la suma de los enteros almacenados en los nodos cuyo valor sea
    superior a un valor umbral pasado como parámetro.
    */

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
    
    // Insertar al final los valores enteros ingresados (iterativo para simplificar)
    public void insertar(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) { //O(n)
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }
    
    // Método recursivo para sumar valores > umbral
    public int sumaMayoresQue(int umbral) {
        return sumaMayoresQueRec(cabeza, umbral); // O(n)
    }
    
    private int sumaMayoresQueRec(Nodo actual, int umbral) {
        if (actual == null) {
            return 0; // Caso base: lista vacía
        }
        int sumaResto = sumaMayoresQueRec(actual.siguiente, umbral); //Llamada recursiva O(n)
        return (actual.valor > umbral) ? actual.valor + sumaResto : sumaResto;
//      if (actual.valor > umbral) {
//          return actual.valor + sumaResto; //"Si es mayor a 4, retorna la suma del valor"
//        } else {
//          return sumaResto;                    //"Si es menor a 4, retorna solamente el valor sin sumar" 
//        }                     //esto hace el return con el condicional "?" 
    }
    
    // Método para imprimir la lista (iterativo)
    public void imprimir() {
        Nodo actual = cabeza;
        while (actual != null) {  //O(n)
            System.out.print(actual.valor + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
    
    
            /*5) Agregue un método recursivo llamado mayor a la clase ListaEnlazada, que
            devuelva el valor mayor en la lista.*/


        public int mayor() {
            if (this.cabeza == null) {
            throw new IllegalStateException("La lista está vacía");
        }
            return mayorRec(this.cabeza);
        }

    private int mayorRec(Nodo actual) {
        if (actual.getSiguiente() == null) {
            return actual.getValor(); // Último nodo
        }
    
        int maxResto = mayorRec(actual.getSiguiente());
        return Math.max(actual.getValor(), maxResto);
}
    
    
    
}
