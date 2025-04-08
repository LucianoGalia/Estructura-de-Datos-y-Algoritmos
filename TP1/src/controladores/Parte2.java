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
		Contacto c1 = new Contacto("Luciano", "3815566098", "luciano@gmail.com");
		Contacto c2 = new Contacto("Franco", "3815562348", "franco@gmail.com");
		Contacto c3 = new Contacto("Luciano", "3815566098", "luciano@gmail.com");
		Contacto c4 = new Contacto("Mariana", "385883398", "mariana@gmail.com");
                
                // agrego los contactos a la agenda
		System.out.println("Agrego contactos a la agenda: ");
		agenda1.agregar(c1);
		agenda1.agregar(c2);
		agenda1.agregar(c3);
		agenda1.agregar(c4);
		
		agenda1.listar();

		// Buscar por nombre
		System.out.println("Buscar contacto por nombre 'Franco': ");
		System.out.println("\n" + agenda1.buscar("Franco"));
		
		System.out.println("\nContactos en la agenda: ");
		agenda1.listar();
		System.out.println("Hay " + agenda1.cantidad() + " contactos en la agenda."); //hasta aqui todo bien
                
                //Continuo con alterar los Strings
                
                // Borrar por numero de telefono
		System.out.println("\nBorrar contacto por el numero de telefono (3815566098): ");
		agenda1.borrar("3815566098");
		agenda1.listar();
		System.out.println("Hay " + agenda1.cantidad() + " contactos en la agenda.");
		
		System.out.println("\nBorrar contacto por el numero de telefono (3815562348): ");
		agenda1.borrar("3815562348");
		agenda1.listar();
		System.out.println("Hay " + agenda1.cantidad() + " contactos en la agenda.");
		
                //Borro los 2 primeros contactos. Esta todo bien
                
                
                
                // Valor en posicion
		System.out.println("\nIntento mostrar el contacto en una posicion invalida: ");
		try {
			Contacto c5 = agenda1.enPosicion(3);
			System.out.println("El contacto en la posicion 3 es: " + c5.toString());
		} catch (Exception e) {
			
		}
		
		agenda1.listar();
		
                
                
                // Testeando método agregarContactosUnicos()
		
		Agenda agenda2 = Agenda.crearAgenda();
		
		// Creación de contactos
		Contacto c6 = new Contacto("Luciano", "3815566098", "luciano@gmail.com");
		Contacto c7 = new Contacto("Franco", "3815562348", "franco@gmail.com");
		Contacto c8 = new Contacto("Mariano", "3815767098", "mariano@gmail.com");
		Contacto c9 = new Contacto("Mariana", "385883398", "mariana@gmail.com");
				
		// agrego los contactos a la agenda
		agenda2.agregar(c6);
		agenda2.agregar(c7);
		agenda2.agregar(c8);
		agenda2.agregar(c9);
		
		System.out.println("Contactos de agenda2: ");
		agenda2.listar();
		
		System.out.println("Agregando contactos unicos de agenda2 a agenda1: ");
		System.out.println();
		System.out.println("Hay " + agenda1.cantidad() + " contactos en la agenda1.");
		System.out.println("Hay " + agenda2.cantidad() + " contactos en la agenda2.");
                
                //Aqui esta la nueva funcion implementada en main
                agregarContactosUnicos(agenda1, agenda2);
		System.out.println("\nContactos de agenda1 luego de la combinacion: ");
		agenda1.listar();
                
    }
    
    /**
	 * 
	 * Función que recibe dos objetos Agenda y agrega en la primera los contactos de 
	 * la segunda que no existen en la primera.
	 * 
	 * @param agendaObjetivo agenda que se modificará.
	 * @param agendaOrigen agenda de la que se tomarán los contactos nuevos.
	 * @return
	 */
    public static Agenda agregarContactosUnicos(Agenda agendaObjetivo, Agenda agendaOrigen) {		
		for (int i = 0; i < agendaOrigen.cantidad(); i++) {
			Contacto c = agendaOrigen.enPosicion(i + 1);
			if (agendaObjetivo.buscar(c.getNombre()) == null) {
				agendaObjetivo.agregar(c);
			}
		}
		
		return agendaObjetivo;
	}
    
}
