/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import tp1.Agenda;
import tp1.Contacto;

/**
 *
 * @author lucia
 */
public class Parte2 {
    public static void main(String[] args) {
    Agenda agenda1 = Agenda.crearAgenda();
		
		// Creación de contactos
		Contacto c1 = new Contacto("Norberto", "3815566098", "norberto@gmail.com");
		Contacto c2 = new Contacto("Ernesto", "3815562348", "ernesto@gmail.com");
		Contacto c3 = new Contacto("Norberto", "3815566098", "norberto@gmail.com");
		Contacto c4 = new Contacto("Manuela", "385883398", "manuela@gmail.com");
                
                // agrego los contactos a la agenda
		System.out.println("Agrego contactos a la agenda: ");
		agenda1.agregar(c1);
		agenda1.agregar(c2);
		agenda1.agregar(c3);
		agenda1.agregar(c4);
		
		agenda1.listar();

		// Buscar por nombre
		System.out.println("Buscar contacto por nombre 'Ernesto': ");
		System.out.println("\n" + agenda1.buscar("Ernesto"));
		
		System.out.println("\nContactos en la agenda: ");
		agenda1.listar();
		System.out.println("Hay " + agenda1.cantidad() + " contactos en la agenda."); //hasta aqui todo bien
                
                //Continuo con alterar los Strings
                
                // Borrar por numero de telefono
		System.out.println("\nBorrar contacto por el numero de telefono (3815566098): ");
		agenda1.borrar("3815566098");
		agenda1.listar();
		System.out.println("Hay " + agenda1.cantidad() + " contactos en la agenda.");
		
		System.out.println("\nBorrar contacto por el número de teléfono (3815562348): ");
		agenda1.borrar("3815562348");
		agenda1.listar();
		System.out.println("Hay " + agenda1.cantidad() + " contactos en la agenda.");
		
                //Borro los 2 primeros contactos. Esta todo bien
                
                
                
                // Valor en posicion
		System.out.println("\nIntento mostrar el contacto en una posición inválida: ");
		try {
			Contacto c5 = agenda1.enPosicion(3);
			System.out.println("El contacto en la posición 3 es: " + c5.toString());
		} catch (Exception e) {
			
		}
		
		agenda1.listar();
		
                
                
    }
}
