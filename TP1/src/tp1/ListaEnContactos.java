/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1;

import java.util.NoSuchElementException;

/**
 *
 * @author lucia
 */
public class ListaEnContactos {
    
    private Nodo primero;
    private Nodo cola;
    private int cantidad;
    
    private ListaEnContactos() { //*1 - Metodo que hace null al primer y ultimo nodo de la lista
        this.primero = null;
        this.cola = null;
        this.cantidad = 0;
    }
    
    public static ListaEnContactos crearLista() {  //desde aqui se repiten algunos metodos de ListaEnlazada
		return new ListaEnContactos();     //Instancia la lista y devuelve una lista vacia "*1"
	}
    
    private class Nodo {

		private Contacto c;
		private Nodo siguiente;
		
		public Nodo(Contacto c) {
			this.c = c;
			this.siguiente = null;
		}
		
		public Contacto getContacto() {
			return this.c;
		}
		public void setContacto(Contacto c) {
			this.c = c;
		}
		public Nodo getSiguiente() {
			return siguiente;
		}
		public void setSiguiente(Nodo siguiente) {
			this.siguiente = siguiente;
		}
                
            }
    
    
    public boolean esVacia() {  //Comprueba si la lista está vacía
        return primero == null;
    }
    
    public ListaEnContactos insertarAlInicio(Contacto c) { //inserta un contacto al inicio de la lista
		Nodo aux = new Nodo(c);
		
		if (this.primero == null) {
			this.cola = aux;
		}
		
		aux.setSiguiente(this.primero);
		this.primero = aux;
		this.cantidad++;
		return this;
	}
    
    public ListaEnContactos insertarAlFinal(Contacto c) { //inserta un contacto al final de la lista
		Nodo aux = new Nodo(c);
		
		if (this.primero == null) {
			this.primero = aux;
			this.cola = aux;
		} else {
			this.cola.setSiguiente(aux);
			this.cola = aux;
		}
		
		this.cantidad++;
		return this;
	}
    
    public void mostrar() { // Recorre y muestra los contactos de la lista
		if (this.primero == null) {
			return;
		}
		
		Nodo aux;
		aux = this.primero;
		System.out.println();
		
		while(aux != null) {
			System.out.println(" -> " + aux.getContacto().toString());
			aux = aux.getSiguiente();
		}
		
		System.out.println();
	}
    
    public int cantidad() { //Devuelve la cantidad de contactos de la lista.
        return this.cantidad;
    }
    
    public Contacto primerElemento() {   //Devuelve el primer contacto de la lista
            if(this.primero == null) {
                throw new NoSuchElementException("La lista esta vacia");
                
            }
            return this.primero.getContacto();
    }
    
    public ListaEnContactos borrarPrimero() { //Borra el primer contacto
		if (this.primero == null) {
			return this;
		}
		
		this.primero = this.primero.getSiguiente();
		this.cantidad--;
		return this;
	}
    
    public ListaEnContactos borrarUltimo() { //borra el ultimo contacto de la lista
		if (this.primero == null) {
			return this;
		}
		
		Nodo aux;
		aux = this.primero;
		
		while(aux.getSiguiente().getSiguiente() != null) {
			aux = aux.getSiguiente();
		}
		
		aux.setSiguiente(null);
		this.cola = aux;
		this.cantidad--;
		return this;
	}
    
    public boolean pertenece(Contacto buscado) { //Determina si un contacto pertenece a la lista
		Nodo aux = this.primero;
		
		while(aux != null) {
			if (aux.getContacto().equals(buscado)) {
				return true;
			}
			
			aux = aux.getSiguiente();
		}
		
		return false;
	}
    
    public ListaEnContactos borrarConValor(Contacto buscado) { //Borra todos los contactos que contengan el valor igual a buscado
		/* 
			Debe borrar la primera coincidencia con el valor dado.
		*/
		
		if (this.primero == null) {
			return this;
		}
			
		// nueva implementación
		Nodo aux = this.primero;	// para recorrer la lista
		Nodo aux2 = null;			// siempre está una posición por detrás de aux
		Nodo aux3 = null;

		while(aux != null) {
			if (aux.getContacto().getTelefono().equals(buscado.getTelefono())) {
				if (aux2 == null) {
					this.borrarPrimero();
				} else if (aux.getSiguiente() == null) {
					this.borrarUltimo();
				} else {
					aux3 = aux.getSiguiente();
					while(aux3 != null) {
						aux2.setSiguiente(aux3);
						aux2 = aux3;
						aux3 = aux3.getSiguiente();
					}
					this.cantidad--;
				}
				return this;
			}

			aux2 = aux;
			aux = aux.getSiguiente();
		}

		return this;
	}
    
    public Contacto valorEnPosicion (int posicion) throws Exception { //Devuelve el contenido del nodo en la posición posicion
		Nodo aux = this.primero;
		
		if (aux == null || posicion > this.cantidad() || posicion <= 0) {
		throw new Exception("No se puede buscar el valor en la posición porque la lista está vacia o no existe un elemento en la posicion ingresada."); 
		}
		
		for (int i = 1; i < posicion; i++) {
			aux = aux.getSiguiente();
		}
		
		return aux.getContacto();
	}
    
    public ListaEnContactos modificarValorEnPosicion(Contacto valor, int posicion) { //Modificar el contenido del nodo de la posición posicion
		if (posicion <= 0 || posicion > this.cantidad()) {
			return this;
		}
		
		Nodo aux = this.primero;
		
		for (int i = 1; i < posicion; i++) {		// Me ubico en el nodo en la posicion ingresada
			aux = aux.getSiguiente();
		}
		
		aux.setContacto(valor);
		
		return this;
	}
    
    public ListaEnContactos insertarEnPosicion(Contacto valor, int posicion) { //Inserta un nodo en la posición posición con valor valor
		Nodo aux = this.primero;
		Nodo nuevo = new Nodo(valor);
		
		if (posicion <= 0 || posicion > this.cantidad()) {
			return this;
		}
		
		for (int i = 1; i < posicion - 1; i++) {		// Me ubico en la posición anterior a la ingresada
			aux = aux.getSiguiente();
		}
		
		nuevo.setSiguiente(aux.getSiguiente());
		aux.setSiguiente(nuevo);
		this.cantidad++;
		return this;
	}
    
    public Contacto buscarValorPorNombre(String nombre) {
		Nodo aux;
		aux = this.primero;
		
		while(aux != null) {
			if (aux.getContacto().getNombre().equalsIgnoreCase(nombre)) {
				return aux.getContacto();
			}
			
			aux = aux.getSiguiente();
		}
		
		return null;	// Si no existe devuelve null.
	}
    
}
