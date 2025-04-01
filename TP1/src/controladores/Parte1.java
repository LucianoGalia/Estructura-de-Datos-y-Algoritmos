/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controladores;

import java.util.NoSuchElementException;
import tp1.ListaEnlazada;

/**
 *
 * @author lucia
 */
public class Parte1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
		 * Primero pruebo armar una lista nueva y mostrarla por pantalla.
		 */
		
		ListaEnlazada lista1 = ListaEnlazada.crearLista();
		ListaEnlazada lista2 = ListaEnlazada.crearLista();
		
		System.out.println("La lista esta vacia: " + lista1.esVacia());
		
		System.out.println("\nInserto elementos al inicio (en orden 1 3 1 6 9 1 12): \n");
		lista1.insertarAlInicio(1);
		lista1.insertarAlInicio(3);
		lista1.insertarAlInicio(1);
		lista1.insertarAlInicio(6);
		lista1.insertarAlInicio(9);
		lista1.insertarAlInicio(1);
		lista1.insertarAlInicio(12);
		
		lista1.mostrar();
		lista2.mostrar();
		
		System.out.println("\n\nInserto 9 al final y 15 al inicio: \n");
		lista1.insertarAlFinal(9);
		lista1.insertarAlInicio(15);

		lista1.mostrar();
		
		// Pruebo métodos con print
		System.out.println("\n\nLa lista tiene " + lista1.cantidad() + " elementos.\n");
		
		System.out.println("La lista 1 esta vacia: " + lista1.esVacia());
                System.out.println("La lista 2 esta vacia: " + lista2.esVacia());
                System.out.println("\n");
                System.out.println("\nEl primer elemento es: " + lista1.primerElemento());
		System.out.println();
                
                try {
                    System.out.println("\nEl primer elemento es: " + lista2.primerElemento());
                    } 
                catch (NoSuchElementException e) {
                    System.out.println("Error: " + e.getMessage());  // Mensaje personalizado para lista vacía
    }
                
                
                //Implemento el metodo Borrar primero:
		System.out.println("\nBorrar primero:");
		lista1.borrarPrimero();
		
		lista1.mostrar();
		
		// Borrar último
		System.out.println("\nBorrar último:");
		lista1.borrarUltimo();
		
		lista1.mostrar();
		
		// Pertenece
		System.out.println("\nEl número 9 pertenece a la lista: " + lista1.pertenece(9));
		
		// Borrar con valor
		System.out.println("\nBorrar con valor 1:");
		lista2.borrarConValor(1);
		lista1.mostrar();
		
		System.out.println("\nBorrar con valor 9:");
		lista1.borrarConValor(9);
		lista1.mostrar();
		
                
                //Valor en posicion
                
                
		System.out.println("\nEl valor en la posición 2 es: " + lista1.valorEnPosicion(2));
			
		System.out.println("\nIntento buscar un elemento en la posición 4... ");
		System.out.println("\nLa lista tiene " + lista1.cantidad() + " elementos.");
		System.out.println("\nEl valor en la posición 4 es: " + lista1.valorEnPosicion(4));
                
                
                // Modificar valor en posición
		System.out.println("\nModifico valor en la posición 2 (nuevo valor 33): ");
		lista1.modificarValorEnPosicion(33, 2);
		lista1.mostrar();
		
		System.out.println("\nModifico valor en la posición 6 (nuevo valor 33): ");
		lista1.modificarValorEnPosicion(33, 6);
		lista1.mostrar();
		
		System.out.println("\nModifico valor en la posición 1 (nuevo valor 11): ");
		lista1.modificarValorEnPosicion(11, 1);
		lista1.mostrar();
		
		// Insertar valor en posición
		System.out.println("\nInserto valor en la posición 3 (8): ");
		lista1.insertarEnPosicion(8, 3);
		lista1.mostrar();
                
                System.out.println("\nLa lista tiene " + lista1.cantidad() + " elementos.");
		System.out.println("\nBorrar con valor 8:");
		lista1.borrarConValor(8).mostrar();
		System.out.println("\nLa lista tiene " + lista1.cantidad() + " elementos.");
		
		System.out.println("\nBorrar con valor 1:");
		lista1.borrarConValor(1).mostrar();
		System.out.println("\nLa lista tiene " + lista1.cantidad() + " elementos.");
                
    }
    
}
