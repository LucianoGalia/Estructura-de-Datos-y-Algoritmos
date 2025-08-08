/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticoParcial2;

import java.util.Stack;

/**
 *
 * @author lucia
 */
public class Fila<Item> {

    private Nodo frente;
    private Nodo finalFila;
    private int cantidad;

    private Fila() {
        this.cantidad = 0;
        this.finalFila = null;
        this.frente = null;
    }

    public static Fila filaVacia() {
        return new Fila();
    }

    public Boolean esFilaVacia() {
        return this.frente == null;
    }

    public Fila enFila(Item x) {
        Nodo aux = new Nodo(x);

        if (this.esFilaVacia()) {
            this.frente = aux;
            this.finalFila = aux;
        } else {
            this.finalFila.setSiguiente(aux);
            this.finalFila = aux;
        }

        this.cantidad++;
        return this;
    }

    public Fila deFila() {
        if (!this.esFilaVacia()) {
            this.frente = this.frente.getSiguiente();
            cantidad--;
        }
        return this;
    }

    public Item Frente() {
        if (!this.esFilaVacia()) {
            return this.frente.getItem();
        }
        return null;
    }

    public int cantidad() {
        return this.cantidad;
    }

    public Fila enFilaN(Item item, int n) {

        while (n != 0) {
            this.enFila(item);
            n--;
        }
        return this;
    }

    public void Mostrar() {
        if (this.esFilaVacia()) {
            return;
        }
        System.out.println("");
        Nodo aux = this.frente;
        while (aux != null) {
            System.out.print(aux.getItem());
            aux = aux.getSiguiente();
        }
        System.out.println("");
    }

    public Fila reEnfilar() {
        if (!this.esFilaVacia()) {
            this.enFila(this.Frente());
            this.frente = this.frente.getSiguiente();
        }
        return this;
    }

    public Fila Borrar(Item x) {

        if (this.esFilaVacia()) { //Caso base
            return this;
        }

        while (this.frente.getItem().equals(x) && this.frente != null) {
            this.frente = this.frente.getSiguiente();
            this.cantidad--;
        }

        if (this.frente == null) {
            this.finalFila = null;
            return this;
        }
        Nodo aux = this.frente;
        while (aux.getSiguiente() != null) {
            if (aux.getSiguiente().getItem().equals(x)) {
                if (aux.getSiguiente() == this.finalFila) {
                    this.finalFila = aux;
                }
                aux.setSiguiente(aux.getSiguiente().getSiguiente());
                this.cantidad--;
            } else {
                aux = aux.getSiguiente();
            }
        }

        return this;
    }

    public Item[] toArray() { //Convierto una Fila en array
        Item[] arr = (Item[]) new Object[this.cantidad()];
        int i = 0;
        Nodo aux = this.frente;

        while (aux != null) {
            arr[i] = aux.getItem();
            i++;
            aux = aux.getSiguiente();
        }
        return arr;
    }

    public Fila fromArray(Item[] arr) {
        for (Item i : arr) {
            this.enFila(i);
        }
        return this;
    }

    public Fila copiar() {
        Fila copiar = Fila.filaVacia();
        Nodo aux = this.frente;

        while (aux != null) {
            copiar.enFila(aux.getItem());
            aux = aux.getSiguiente();
        }
        return copiar;
    }

    public Boolean pertenece(Item x) {
        if (this.esFilaVacia()) {
            return false;
        }

        Nodo aux = this.frente;

        while (aux != null) {
            if (aux.getItem().equals(x)) {
                return true;
            }
            aux = aux.getSiguiente();

        }
        return false;
    }
    
    // hago pertenece recursivo
    public Boolean perteneceRecursivo(Item x) {
        
        return pertenecePrivate(this.frente, x);
    }
    
    private Boolean pertenecePrivate(Nodo nodo,Item x){
        if(nodo == null){
            return false;
        } 
        if(nodo.getItem().equals(x)){
            return true;
        }
        return pertenecePrivate(nodo.getSiguiente(),x);
    }
    
    public Fila invertir(Fila fila) {
        return invertirlo(fila);
    }
    private Fila invertirlo(Fila f) {
        if(f.esFilaVacia()){
            return f;
        } else {
            Item aux = (Item) f.Frente();
            return invertirlo(f.deFila()).enFila(aux);
        }
    }
    
    public Fila concat(Fila f1, Fila f2) {
        Fila Faux = Fila.filaVacia();
        if(f1.esFilaVacia() && f2.esFilaVacia()) {
            return null;
        }
        Nodo aux1 = f1.frente;
        Nodo aux2 = f2.frente;
        while(aux1 != null) {
            Faux = Faux.enFila(aux1.getItem());
            aux1 = aux1.getSiguiente();
        }
        while(aux2 != null) {
            Faux = Faux.enFila(aux2.getItem());
            aux2 = aux2.getSiguiente();
        }
        
        return Faux;
    }

    Fila<String> concatADT(Fila<String> fila, Fila<String> fila2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

//    public Fila invertir(Fila filaOriginal) {
//    Stack pila = new Stack();
//    Nodo aux = filaOriginal.frente; // <- recorrer filaOriginal, no this
//
//    while (aux != null) {
//        pila.push(aux.getItem());
//        aux = aux.getSiguiente();
//    }
//    this.frente = null;
//    this.finalFila = null;
//
//    while (!pila.isEmpty()) {
//        this.enFila((Item) pila.pop());
//    }
//    return this;
//}

    private class Nodo {

        private Nodo siguiente;
        private Item item;

        public Nodo(Item item) {
            this.siguiente = null;
            this.item = item;
        }

        public Nodo getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }

        public Item getItem() {
            return item;
        }

        public void setItem(Item item) {
            this.item = item;
        }

    }
}
