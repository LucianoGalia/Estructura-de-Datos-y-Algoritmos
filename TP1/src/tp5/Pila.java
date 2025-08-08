/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author lucia
 */
public class Pila<Item> {

    private Nodo<Item> tope;
    private Nodo<Item> fondo;
    private int cantidad;

    public static Pila Crear() {
        return new Pila();
    }

    public boolean esPilaVacia() {
        return this.tope == null;
    }

    public Pila Push(Item x) {
        Nodo aux;
        aux = new Nodo(x);
        if (this.fondo == null) {
            this.fondo = aux;
            this.tope = aux;
            cantidad++;
        } else {
            aux.setSiguiente(this.tope);
            this.tope = aux;
            cantidad++;
        }
        return this;
    }

    public Pila Pop() {

        if (this.fondo == null) {
            return this;
        }

        this.tope = this.tope.getSiguiente();
        cantidad--;
        return this;
    }

    public Item Top() {
        if (this.fondo == null) {
            return null;
        }
        return this.tope.getDato();
    }

    public Item Fondo() {
        if (this.fondo == null) {
            return null;
        }
        return this.fondo.getDato();
    }

    public void mostrar() {
        if (this.fondo == null) {
            return;
        }
        Nodo aux;
        aux = this.tope;

        System.out.println("");
        while (aux != null) {
            System.out.print("|" + aux.getDato() + "|");
            aux = aux.getSiguiente();
            if (aux != null) {
                System.out.println("");
            }

        }
        System.out.println();

    }

    public int cantidad() {
        return this.cantidad;
    }

    private class Nodo<Item> {

        private Nodo siguiente;
        private Item dato;

        public Nodo(Item dato) {
            this.siguiente = null;
            this.dato = dato;
        }

        public Item getDato() {
            return dato;
        }

        public void setDato(Item dato) {
            this.dato = dato;
        }

        public Nodo getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }

    }

}
