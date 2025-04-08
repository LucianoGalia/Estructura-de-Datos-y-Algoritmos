/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1;

import interfaces.IAgenda;

/**
 *
 * @author lucia
 */
public class Agenda implements IAgenda {
        
    private ListaEnContactos listaAgenda = ListaEnContactos.crearLista();
    
    public static Agenda crearAgenda() {
		Agenda agenda = new Agenda();
		return agenda;
	}
    
    @Override
    public Agenda agregar(Contacto c) { //Agrega un contacto a la agenda
        this.listaAgenda.insertarAlFinal(c);
        return this;
    }

    @Override
    public Contacto buscar(String nombre) {//Buscar el primer contacto con el nombre recibido por parámetro y devuelve el
                                           //Contacto. Si no existe devuelve NULL
        return this.listaAgenda.buscarValorPorNombre(nombre);
    }

    @Override
    public ListaEnContactos borrar(String telefono) { //Elimina el primer contacto con telefono igual al recibido por parámetro
       Contacto c = new Contacto(null, telefono, null);
       return this.listaAgenda.borrarConValor(c);
    }

    @Override
    public void listar() { //Muestra por pantalla los datos de todos los contactos de la agenda
            this.listaAgenda.mostrar();
    }

    @Override
    public int cantidad() { //Devuelve la cantidad de contactos en la agenda
        return this.listaAgenda.cantidad();
    }

    @Override
    public Contacto enPosicion(int posicion) { //Devuelve el contacto en la posición posicion
        Contacto c = null;
        
            try {
			c = this.listaAgenda.valorEnPosicion(posicion);
		} catch (Exception e) {
			System.out.println();
			System.out.println(e.getMessage());
		}
		
		return c;
    }
    
    
    //Agrego nuevos metodos
    
    public ListaEnContactos getListaAgenda() {
		return listaAgenda;
	}
    
    public void setListaAgenda(ListaEnContactos listaAgenda) {
		this.listaAgenda = listaAgenda;
	}
    
}
